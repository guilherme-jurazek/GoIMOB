package control.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.VARS;
import control.ControlObj;
import database.DB_ConnectionFactory;

public class Teste implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    Statement stmt = null;
    ResultSet rs = null;
    List<String> lista = null;
    Connection conn = null;
    try {
      conn = new DB_ConnectionFactory().getConnection();
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM tb_pessoa");

      // or alternatively, if you don't know ahead of time that
      // the query will be a SELECT...

      // if (stmt.execute("SELECT foo FROM bar")) {
      // rs = stmt.getResultSet();
      // }

      // Now do something with the ResultSet ....
      lista = new ArrayList<String>();
      while (rs.next()) {
        lista.add(rs.getString(2));
      }
    } catch (SQLException ex) {

      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    } finally {

      // it is a good idea to release
      // resources in a finally{} block
      // in reverse-order of their creation
      // if they are no-longer needed
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException sqlEx) {
        } // ignore
        rs = null;
      }

      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException sqlEx) {
        } // ignore
        stmt = null;
      }

      if (conn != null) {
        try {
          conn.close();
          System.out.println("Fechou!!");
        } catch (SQLException sqlEx) {}
        stmt = null;

      }
    }

    return new ControlObj("json", VARS.gson.toJson(lista));
  }
}
