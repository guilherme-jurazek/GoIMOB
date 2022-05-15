package control.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;

public class TestData implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    System.out.println("Data: " + request.getParameter("dt_nasc"));
    return null;
  }
  
}
