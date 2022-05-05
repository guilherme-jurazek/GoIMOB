package br.com.fipp.gerenciador.controller.action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements ActionControl{
  public String exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    request.getSession().invalidate();
    return "redirect:LoginForm";
  }
}
