package controller.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.action.iActionControl;

// @WebServlet(urlPatterns = "/")
public class ControllerFilter implements Filter {


  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
    

    System.out.println("ControllerFilter started...");
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) resp;

    String res = "";
    String paramAction = request.getServletPath().substring(1);

    try {
      String className = "controller.action." + paramAction;
      Class<?> controlClass = Class.forName(className);
      iActionControl act = (iActionControl) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      System.out.println(e.toString());

      //TRATAR URI ERRADA, VAI LANCAR EXCECAO NA CLASSE, AQUI TEM QUE SER REDIRECIONADO PARA UMA PAGINA DE ERRO
      //caso de erro no recurso chamado
      //  com usuario logado: pagina com o codigo do erro, opcao para retornar para o dashboard
      //  com usuario deslogado: pagina com o codigo do erro, opcao para retornar para pagina de logon
      // res = request.getSession().getAttribute("user_logged") == null ? "redirect:LoginForm" : "redirect:ListaEmpresa";
    }

    String path[] = res.split(":");
    if (path != null && path.length > 1) {

      switch (path[0]) {

        case "forward" :
          request.getRequestDispatcher(path[1]).forward(request, response);
          break;

        case "redirect" :
          response.sendRedirect(path[1]);
          break;

        default:
          System.out.println("No return");
      }
    }
    System.out.println("ControllerFilter finish...");
  }
}
