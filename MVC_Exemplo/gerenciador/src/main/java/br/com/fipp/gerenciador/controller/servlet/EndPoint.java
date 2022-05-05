package br.com.fipp.gerenciador.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.controller.action.ActionControl;

@WebServlet(urlPatterns = "/")
public class EndPoint extends HttpServlet {

  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String res = "";
    ActionControl act;
    Class<?> controlClass;
    String paramAction = request.getRequestURI().substring(13);
    String className = "br.com.fipp.gerenciador.action." + paramAction;

    try {
      controlClass = Class.forName(className);
      act = (ActionControl) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      throw new ServletException(e);
    }

    String type[] = res.split(":");

    if (type.length > 1) {
      switch (type[0]) {
        case "forward" :
          request.getRequestDispatcher(type[1]).forward(request, response);
          /**
           * FORWARD
           * 
           * Foward ja devolve ao autor da ultima requisao feita, o foward
           * trabalha dentro do servidor, um forward pode chamar outro servlet.
           */
          break;

        case "redirect" :
          response.sendRedirect(type[1]);
          /**
           * REDIRECT
           * O sendRedirect ordena que o navegador do cliente redirecione
           * uma requisição GET para o caminho da string passada por parâmetro
           * essa requisição pode ser para qualquer recurso viavel, como
           * um servlet, jsp, html. Porem, para recursos da VIEW fica restr
           * ito o uso desse metodo no padrão MVC, onde a camada da view tem
           * que passar obrigatoriamente pelo controlador, note que isso nao
           * é uma limitação tecnologica, e sim de padrão de arquitetura
           * , por tanto, o navegador
           * web não pode fazer uma requisição para WEB-INF/view/page.html,
           * o redirect serve para ordenar que o navegador obtenha um recurso
           * atraves de uma nova requisao, que na arquitetura desse projeto
           * (MVC) é somente o servlet que pode ser chamado pelo navegador.
           * Então, em um contexto onde um ser
           * vlet/ação pindura algum dado na requisição, esse dado é perdido
           * no uso do sendRedirect, entao se algum dado precisa ser redenri
           * zado pela view, esse nao e o metodo correto.
           */
          break;

        default:
          System.out.println("Ivalid method");
          break;
      }
    }

    // tudo que está acima, é equivalete a este código comentado
    // if (paramAction != null) {

    // switch (paramAction) {

    // case "ListaEmpresa":

    // ListaEmpresa listAction = new ListaEmpresa();
    // res = listAction.exec(request, response);
    // break;

    // case "RemoveEmpresa":

    // RemoveEmpresa romoveAction = new RemoveEmpresa();
    // res = romoveAction.exec(request, response);
    // break;

    // case "AlteraEmpresa":

    // AlteraEmpresa alterAction = new AlteraEmpresa();
    // res = alterAction.exec(request, response);
    // break;

    // case "MostraEmpresa":

    // MostraEmpresa mostraAction = new MostraEmpresa();
    // res = mostraAction.exec(request, response);
    // break;

    // case "NovaEmpresa":

    // NovaEmpresa addEmpresa = new NovaEmpresa();
    // res = addEmpresa.exec(request, response);
    // break;

    // case "NovaEmpresaForm":

    // NovaEmpresaForm empForm = new NovaEmpresaForm();
    // res = empForm.exec(request, response);
    // break;

    // default:

    // System.out.println("Error request");
    // break;
    // }

  }
}
