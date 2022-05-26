package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class GenericDAO {
  
  public static PreparedStatement create (Connection con, String createSQL, Object... parametros) throws SQLException {
    try {
      PreparedStatement pstmt = con.prepareStatement(createSQL, PreparedStatement.RETURN_GENERATED_KEYS);
        
      for (int i = 0; i < parametros.length; i++) {
        pstmt.setObject(i + 1, parametros[i]);
      }
      pstmt.execute();
      
      return pstmt;

    } catch (SQLException e) {
      throw new SQLException(e);
    }
  }

  public static ResultSet read (Connection con, String sql) throws SQLException {

    try {

      PreparedStatement stmt = con.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      stmt.close();
      return rs;
      

    } catch (SQLException e) {
      throw new SQLException(e);
    }
  }


  public void update (String sql, Object... parametros) {}
  public void deletar (String sql, Object... parametros) {}
}
