package controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.iAction;

// @WebServlet(urlPatterns = "/")
public class ControllerFilter implements Filter {

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

    /**
     * CLASSE ControllerFilter
     * 
     * Classe reponsavel por receber a URI instanciar
     * o objeto de desejo de acordo com essa URI
     */

    System.out.println("ControllerFilter started...");
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) resp;

    String res = "";
    String paramAction = request.getServletPath().substring(1);

    try {
      String className = "controller.action." + paramAction;
      Class<?> controlClass = Class.forName(className);
      iAction act = (iAction) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      System.out.println(e.toString());
      /**
        * TRATAR URI ERRADA, VAI LANCAR EXCECÃO NA CLASSE, AQUI
        * TEM QUE SER FEITO O REDIRECIONADO PARA UMA PÁGINA DE ERRO OU
        * QUALQUER PÁGINA QUE DESEJAMOS QUE O USUÁRIO VEJA, QUANDO
        * ELE FIZER UMA REQUISIÇÃO A UM RECURSO INEXISTENTE, OU MESMO
        * ERRAR O NOME DA REQUISIÇÃO.

        * Caso de acontece essa exceção:

        * Com o usuário logado: redireciona para página com o código do erro
        * ou qualquer outra, opção para retornar para o dashboard.
        * Com usuário deslogado: redirecionar para a página com o código do erro ou
        * qualquer outra, opção para retornar para página de login
        * ou página inicial.
        */

      // remover "user_logged" pois a etapa de autorização é de resposabilidade de AuthorizationFilter.
      res = request.getSession().getAttribute("user_logged") == null ? "redirect:LoginForm" : "redirect:ListaEmpresa";
    }

    String path[] = res.split(":");
    if (path != null && path.length > 1) {

      switch (path[0]) {

        case "forward":
          request.getRequestDispatcher(path[1]).forward(request, response);
          break;

        case "redirect":
          response.sendRedirect(path[1]);
          break;

        default:
          // CÓDIGO PARA QUANDO O TIPO DE RESPOSTA É INVÁLIDO.
      }
    }
    System.out.println("ControllerFilter finish...");
  }
}
