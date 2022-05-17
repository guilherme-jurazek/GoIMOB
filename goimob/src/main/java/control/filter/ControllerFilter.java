package control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import control.action.iAction;

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
    
    ControlObj res = null;

    try {
      String action = Character.toUpperCase(request.getParameter("action").charAt(0)) + request.getParameter("action").substring(1);
      String className = "control.action." + action;
      Class<?> controlClass = Class.forName(className);
      iAction act = (iAction) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      System.out.println(e.toString());
    }

    if (res != null) {
      switch (res.getMethod()) {

        case "forward":
          request.getRequestDispatcher(res.getResource()).forward(request, response);
          break;

        case "redirect":
          response.sendRedirect(res.getResource());
          break;

        case "json":
          resp.setContentType("application/json");
          resp.getWriter().println(res.getResource());
          break;

        case "xml":
          resp.setContentType("application/xml");
          resp.getWriter().print(res.getResource());
          break;

        default:
          // CÓDIGO PARA QUANDO O TIPO DE RESPOSTA É INVÁLIDO.
      }
    }
    System.out.println("ControllerFilter finish...");
  }

  
}

