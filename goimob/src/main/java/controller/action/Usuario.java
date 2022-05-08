package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Usuario implements iActionControl {

  @Override
  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    switch (request.getMethod()) {
      case "GET" :
        
        break;
      case "DELETE" :
        break;
      case "PUT" :
        break;
      case "POST":
      default:
        break;
    }

    
    return null;
  }
  
}
