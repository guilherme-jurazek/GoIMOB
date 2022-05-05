package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm implements ActionControl {
  
  public String exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    return "forward:" + Constant.VIEW_PATH + "formLogin.jsp";
  }

}
