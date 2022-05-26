package control.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import control.action.iAction;

@MultipartConfig(
  fileSizeThreshold = 1048576,//int (in bytes)
  maxFileSize = 1048576, //long (in bytes)
  maxRequestSize = 1048576, //long (in bytes)
  location = "/tmp/" //string
)
@WebServlet(urlPatterns = "/in")
public class ControlServlet extends HttpServlet {

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    System.out.println("ControlFilter started...");

    ControlObj res = null;

    try {

      String action = Character.toUpperCase(request.getParameter("action").charAt(0)) + request.getParameter("action").substring(1);
      System.out.println("Ação: " + action);
      String className = "control.action." + action;
      Class<?> controlClass = Class.forName(className);
      iAction act = (iAction) controlClass.newInstance();
      res = act.exec(request, response);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | NullPointerException e) {
      request.setAttribute("erro_transacao", "(Controle) " + e.getMessage());
      res = new ControlObj("forward", "index.jsp");
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
          response.setContentType("application/json");
          response.getWriter().println(res.getResource());
          break;

        case "xml":
          response.setContentType("application/xml");
          response.getWriter().print(res.getResource());
          break;

        default:
          response.setContentType("text/html");
          response.getWriter().println("<h1>Sem definição de retorno</h1>");
      }
    }

    System.out.println("ControlFilter finish...");
  }

}
