package br.com.fipp.gerenciador.controller.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebFilter(urlPatterns = "/*")
public class AuthorizationFilter implements Filter{

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

    //tem que verificar se ja esta logado nao permitindo que acesse a pagina de login
    //e se nao estiver logado nao permitir que acesse demais coisas
    System.out.println("AuthorizationFilter started...");
    String paramAction = ((HttpServletRequest) req).getServletPath().substring(1);

    if( !paramAction.equalsIgnoreCase("EmpresaService") && ((HttpServletRequest) req).getSession().getAttribute("user_logged") == null && !paramAction.equalsIgnoreCase("Login") && !paramAction.equalsIgnoreCase("LoginForm"))
    {
      //ha uma possibilidade de repassar essa requisiao para o EndPoint chamaar a pagian de login
      ((HttpServletResponse) resp).sendRedirect("LoginForm");
      System.out.println("Autentication request started...");
      System.out.println("AuthorizationFilter finish...");
      return;
    }
      
      // paramAction = "LoginForm";
    System.out.println("the user has been authorized!");
    chain.doFilter(req, resp);
    
    System.out.println("AuthorizationFilter finish...");
  }
}
