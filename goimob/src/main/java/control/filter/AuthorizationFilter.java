package control.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    System.out.println("AuthorizationFilter started...");

    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;
    
    /**
     * Aqui acontece a validacao de quais telas o usuario pode acessar
     * de acordo com seu nivel de acesso.
     */

    chain.doFilter(req, resp);
    
    System.out.println("AuthorizationFilter finish...");
  }
}
