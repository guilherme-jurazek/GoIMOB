package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.VARS;

public class DataBaseConnection {

  /**
   * CLASSE DataBaseConnection
   * 
   * Essa classe será responsável por fazer a conexão direta
   * com o banco, será nela que as configurações de acesso,
   * manipulção do driver, autenticação com o SGBD sarão definidas
   * e métodos serão criados para prover uma abstração para
   * as camadas superiores que à utilizarão, como a DAL, e
   * posteriormente as ENTITIES seguido de view.
   * 
   * ATENÇÃO: CLASSE INCOMPLETA!
   */

  ResultSet rs;
  private Connection conn;
  private String lastOpMsgError;
  private Statement statement;

  public DataBaseConnection() {
    try {
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    } catch (SQLException e) {
      lastOpMsgError = "Failed to register driver: " + e.toString();
    }
  }

  public DataBaseConnection(boolean wantToConnect) {
    this();
    if(wantToConnect)
      Connect();
  }

  public String Connect() {
    try {
      conn = DriverManager.getConnection(VARS.DBURL, VARS.DBUSER, VARS.DBPASS);
    } catch (SQLException e) {

      lastOpMsgError = e.toString();
      return e.toString();
    }
    lastOpMsgError = "Connection sucess!";
    return lastOpMsgError;
  }

  public boolean isConnect() {
    if (conn != null)
        return true;
    return false;
  } 

  public ResultSet execQuery (String sql, boolean wantCloseConnection) {

    try {
      statement = conn.createStatement();
    } catch (SQLException e) {
      lastOpMsgError = "Failed to create statement: " + e.toString();
      closeConnection();
      return null;
    }

    try {
      /**
       * só result_set que pode ficar aberto
       * talvez tenhamos que tratar todo o 
       * retorno de dados diretamente na classe
       * banco.
       */
      rs = statement.executeQuery(sql);
    } catch (SQLException e) {
      lastOpMsgError = "Failed to execute query: " + e.toString();
    }

    try {
      statement.close();
    } catch (SQLException e) {
      lastOpMsgError = "Failed to closed statement: " + e.toString();
    }

    if (wantCloseConnection) {
      closeConnection();
    }
    return null;
  }

  public boolean closeConnection () {
    try {
      conn.close();
      return true;
    } catch (SQLException e) {
      lastOpMsgError = "Failed to close connection: " + e.toString();
      return false;
    }
  }
}
