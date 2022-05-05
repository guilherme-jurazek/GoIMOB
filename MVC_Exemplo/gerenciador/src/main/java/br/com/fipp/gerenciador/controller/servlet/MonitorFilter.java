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
public class MonitorFilter implements Filter{

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
      throws IOException, ServletException {

    //MEDINDO O TEMPO DE EXECUÇÃO
    System.out.println("Filter started...");
    System.out.print("Action: " + ((HttpServletRequest) req).getRequestURI().substring(13));
    long before = System.currentTimeMillis(), after;
    chain.doFilter(req, resp);
    after = System.currentTimeMillis();
    System.out.print("      ...Execution time: " + (after - before) + "\n\n");
  }
}
