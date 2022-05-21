package control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenticationFilter implements Filter{
  /**
   * Aqui e o filtro de aunteticacao.
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    String[] params = {"Victor", "Taveira"};

    for (String string : params) {
      System.out.println(string);
    }

  }
  
}
