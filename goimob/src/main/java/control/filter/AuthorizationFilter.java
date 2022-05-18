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

  /**
   * OQUE É A CLASSE AuthorizationFilter ?
   * 
   * AuthorizationFilter, é por onde passa todas as requisições feitas
   * e validada a autenticidade do usúario, essa classe será
   * usada para primeiramente, verificar se o usúario do sistema
   * está registrado, por meio da sessão, a sessão só
   * pode ser válida se o atributo "user_logged" está definido na
   * sessão, essa atribuição é realizada pela classe de controle
   * "Login" de dentro da pasta "action", caso contrário, AuthorizationFilter
   * impede que o user-agent acesse qualquer recurso da aplicação diferente
   * de Login e LoginForm.
   */

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    System.out.println("AuthorizationFilter started...");

    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;
    // String paramAction = req.getParameter("action");

    /*
    Enumeration<String> keys = req.getParameterNames();
    String key;
    while (keys.hasMoreElements()) {
      key = keys.nextElement();
      System.out.println("Key: " + key + " | value: " + req.getParameter(key));
    }
    */

    

    // if (req.getSession().getAttribute("user_logged") == null) {

    //   if (!paramAction.equals("Login"))
    //   {
    //     req.getRequestDispatcher("index.html").forward(req, resp);
    //     return;
    //   }
    // }

    chain.doFilter(req, resp);
    
    System.out.println("AuthorizationFilter finish...");
  }
}
