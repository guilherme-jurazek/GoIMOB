package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericDAO {
  
  public static PreparedStatement create (Connection con, String createSQL, Object... parametros) {
    try {
      PreparedStatement pstmt = con.prepareStatement(createSQL, PreparedStatement.RETURN_GENERATED_KEYS);
        
      for (int i = 0; i < parametros.length; i++) {
        pstmt.setObject(i + 1, parametros[i]);
      }
      pstmt.execute();
      // ResultSet rs = pstmt.getGeneratedKeys();
      // rs.next();
      // System.out.println("Id: " + rs.getInt(1));
      // System.out.println("Data: " + rs.getObject(4));
      // System.out.println("Commit effectived!");
      
      return pstmt;

    } catch (SQLException e) {
      System.out.println("Erro: " + e.toString());
      throw new RuntimeException(e);
    }
  };

  public void read (String sql, Object... parametros) {};
  public void update (String sql, Object... parametros) {};
  public void deletar (String sql, Object... parametros) {};
}
