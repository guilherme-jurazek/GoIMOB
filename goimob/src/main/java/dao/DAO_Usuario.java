package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadeUsuario;

public class DAO_Usuario extends GenericDAO {

  public static void salvar(HttpServletRequest request, EntidadeUsuario usu){

    Connection conexao = (Connection) request.getAttribute("conexao_bd");
    
    String sql = "INSERT INTO tb_usuario " +
    "(pes_fk_id, usu_email, usu_senha, na_fk_id) " +
    "VALUES (?,?,?,?)";
    
    try {
      PreparedStatement ps = create(conexao, sql, Integer.valueOf(usu.getCodPes()), usu.getEmail(), usu.getSenha(), usu.getCodNivelAcesso());
      ps.close();
    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_Usuario) " + e.getMessage());
    }
  }
}
