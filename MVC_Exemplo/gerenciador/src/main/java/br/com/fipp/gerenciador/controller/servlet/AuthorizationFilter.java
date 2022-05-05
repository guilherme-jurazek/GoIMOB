package br.com.fipp.gerenciador.controller.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class AuthorizationFilter implements Filter{

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

    //tem que verificar se ja esta logado nao permitindo que acesse a pagina de login
    //e se nao estiver logado nao permitir que acesse demais coisas
    
    // String paramAction = ((HttpServletRequest) req).getRequestURI().substring(13);
    
    // if(((HttpServletRequest) req).getSession().getAttribute("user_logged") == null && !paramAction.equalsIgnoreCase("Login"))
    //   paramAction = "LoginForm";

    chain.doFilter(req, resp);
  }
}
