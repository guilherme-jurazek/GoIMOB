package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadeImovel;

public class DAO_Imovel extends GenericDAO {

  public static void salvar(HttpServletRequest request, EntidadeImovel imov) {
    Connection conexao = (Connection) request.getAttribute("conexao_bd");

    String sql = "INSERT INTO tb_imovel " +
        "(imov_valor, imov_proprietario, imov_cidade, imov_bairro, imov_rua, imov_numero, imov_uf, imov_cep) " +
        "VALUES (?,?,?,?,?,?,?,?)";

    try {
      PreparedStatement ps = create(conexao, sql,
          Double.valueOf(imov.getImovel_valor()),
          imov.getProprietario_imovel(),
          imov.getCidade_imovel(),
          imov.getBairro_imovel(),
          imov.getRua_imovel(),
          Integer.valueOf(imov.getNumero_imovel()),
          imov.getUf_imovel(),
          imov.getCep_imovel());

      ResultSet rs = ps.getGeneratedKeys();
      rs.next();
      imov.setCod_imov(String.valueOf(rs.getInt(1)));
      rs.close();
      ps.close();
    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_Imovel) " + e.getMessage());
    }
  }
}
