package br.com.fipp.gerenciador.controller.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

// @WebFilter(urlPatterns = "/*")
public class MonitorFilter implements Filter{

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

    //MEDINDO O TEMPO DE EXECUÇÃO
    System.out.println("MonitorFilter started...");
    String action = ((HttpServletRequest) req).getServletPath().substring(1);
    System.out.println("Action: " + action);
    long before = System.currentTimeMillis(), after;
    if (!action.equalsIgnoreCase("favicon.ico"))
      chain.doFilter(req, resp);
    after = System.currentTimeMillis();
    System.out.println("MonitorFilter finish ...Execution time: " + (after - before) + "\n\n");
  }
}
