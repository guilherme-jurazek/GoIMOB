package control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenticationFilter implements Filter{
  


  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println("AuthenticationFilter started...");

    
  
    //valida e retornar id
    // req.getSession().setAttribute("id_usuario_atual", "1");

    chain.doFilter(request, response);
    System.out.println("AuthenticationFilter finish...");
  }
  
}
