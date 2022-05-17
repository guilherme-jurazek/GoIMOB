package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.entiny.EntidadeUsuario;

public class DAO_Usuario extends GenericDAO {

  public static void salvar(Connection conn, EntidadeUsuario usu) throws SQLException {
    String sql = "INSERT INTO tb_usuario " +
    "(pes_fk_id, usu_email, usu_senha) " +
    "VALUES (?,?,?)";

    PreparedStatement ps = create(conn, sql, usu.getCodPes(), usu.getEmail(), usu.getSenha());
    ps.close();
  }
}
