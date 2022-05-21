package database;

import java.sql.Connection;
import java.sql.DriverManager;

import config.VARS;

public class DB_ConnectionFactory {

  /**
   * CLASSE DB_ConnectionFactory
   * 
   * Essa classe será responsável por fazer a conexão direta
   * com o banco, será nela que as configurações de acesso,
   * manipulção do driver, autenticação com o SGBD sarão definidas
   * e métodos serão criados para prover uma abstração para
   * as camadas superiores que à utilizarão, como a DAL, e
   * posteriormente as ENTITIES seguido de view.
   * 
   */

  static {
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException /*| InstantiationException | IllegalAccessException */e) {
      System.out.println("Erro ao carregar driver: " + e.getMessage());
    }
  }

  public Connection getConnection() {
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      return DriverManager.getConnection(VARS.DBURL, VARS.DBUSER, VARS.DBPASS);
    } catch (Exception e) {
      throw new RuntimeException("Erro ao obter conexão: ");
    }
  }
}
