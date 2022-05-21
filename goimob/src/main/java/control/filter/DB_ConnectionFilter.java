package control.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import database.DB_ConnectionFactory;

public class DB_ConnectionFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    Connection conexao = null;
    try {

      conexao = new DB_ConnectionFactory().getConnection();
      conexao.setAutoCommit(false);
      request.setAttribute("conexao_bd", conexao);
      chain.doFilter(request, response);
      String erro_transacao = (String) request.getAttribute("erro_transacao");

      if (erro_transacao == null)
        conexao.commit();
      else {
        System.out.println("Erro na transação -> " + erro_transacao);
        conexao.rollback();
      }

    } catch (SQLException e) {
      System.out.println("Erro em operação -> " + e.getMessage());
      // e.printStackTrace();
    } finally {

      try {
        conexao.close();
      } catch (SQLException e) {
        System.out.println("Erro de fechamento de conexão com o banco: " + e.getMessage());
        // e.printStackTrace();
      }
    }
  }
}
