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
    String paramAction = request.getRequestURI().substring(13);
    
    if(request.getSession().getAttribute("user_logged") == null && !paramAction.equalsIgnoreCase("Login"))
      paramAction = "LoginForm";
    
    
    try {
      String className = "br.com.fipp.gerenciador.controller.action." + paramAction;
      Class<?> controlClass = Class.forName(className);
      ActionControl act = (ActionControl) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      System.out.println(e.toString());
      res = request.getSession().getAttribute("user_logged") == null ? "redirect:LoginForm" : "redirect:ListaEmpresa";
    }

    String path[] = res.split(":");
    if (path.length > 1) {

      switch (path[0]) {

        case "forward" :
          request.getRequestDispatcher(path[1]).forward(request, response);
          break;

        case "redirect" :
          response.sendRedirect(path[1]);
          break;

        default:
          response.sendRedirect("/LoginForm");
      }
    }
  }
}
