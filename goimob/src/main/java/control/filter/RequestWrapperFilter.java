package control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RequestWrapperFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println("RequestWrapperFilter start...");
    HttpServletRequest wrappedRequest = new RequestWrapper((HttpServletRequest) request);
    chain.doFilter(wrappedRequest, response);
    RequestWrapper.clearParameters();
    System.out.println("RequestWrapperFilter finish...");
  }

}
