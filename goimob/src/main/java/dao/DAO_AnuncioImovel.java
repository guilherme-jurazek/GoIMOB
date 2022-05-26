package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadeAnuncioImovel;

public class DAO_AnuncioImovel extends GenericDAO {

  public static void salvar(HttpServletRequest request, EntidadeAnuncioImovel AnunImov) {
    Connection conexao = (Connection) request.getAttribute("conexao_bd");

    String sql = "INSERT INTO tb_anuncio_imovel " +
        "(anun_descri, anun_tipo, imov_fk_id, usu_fk_id) " +
        "VALUES (?,?,?,?)";

    try {
      PreparedStatement ps = create(conexao, sql,
          AnunImov.getDescricao_anuncio(),
          AnunImov.getAnun_tipo(),
          Integer.valueOf(AnunImov.getFk_cod_imov()),
          Integer.valueOf(AnunImov.getFk_cod_usu()));

      ps.close();
    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_AnuncioIMovel) " + e.getMessage());
    }
  }
}
