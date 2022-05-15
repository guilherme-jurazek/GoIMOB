package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericDAO {
  
  public static void create (Connection con, String createSQL, Object... parametros) {
    try {
      PreparedStatement pstmt = con.prepareStatement(createSQL);
      for (int i = 0; i < parametros.length; i++) {
        pstmt.setObject(i + 1, parametros[i]);
      }
      pstmt.execute();
      pstmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } 
  };

  public void read (String sql, Object... parametros) {};
  public void update (String sql, Object... parametros) {};
  public void deletar (String sql, Object... parametros) {};
}
