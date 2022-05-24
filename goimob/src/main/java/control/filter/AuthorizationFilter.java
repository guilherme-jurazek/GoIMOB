package control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthorizationFilter implements Filter {

  
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    System.out.println("AuthorizationFilter started...");

    /**
     * Aqui acontece a validacao de quais telas o usuario pode acessar
     * de acordo com seu nivel de acesso.
     */

    chain.doFilter(request, response);
    
    System.out.println("AuthorizationFilter finish...");
  }
}
