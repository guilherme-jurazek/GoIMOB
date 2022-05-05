package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fipp.gerenciador.model.Banco;
import br.com.fipp.gerenciador.model.User;

public class Login implements ActionControl {
  
  public String exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String login = request.getParameter("login");
    String pass = request.getParameter("pass");

    // System.out.println("Logando..." + login);

    Banco banco = new Banco();
    User user = banco.userIsValid(login, pass);

    if (user != null)
    {
      HttpSession sess = request.getSession();
      sess.setAttribute("user_logged", user);
      return "redirect:ListaEmpresa";
    }
    return "redirect:LoginForm";
  }
}
