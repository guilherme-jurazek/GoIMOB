package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadeListaAnuncioImovel;

public class DAO_ListaAnuncioImovel extends GenericDAO {

  public static List<EntidadeListaAnuncioImovel> recuperarLista(HttpServletRequest request) {

    Connection conexao = (Connection) request.getAttribute("conexao_bd");

    String sql = "SELECT imov_proprietario, imov_bairro, imov_cidade, imov_valor, anun_tipo, anun_status " +
        "FROM tb_imovel " +
        "INNER JOIN tb_anuncio_imovel ON imov_id = imov_fk_id";

    try {
      List<EntidadeListaAnuncioImovel> lista = new ArrayList<EntidadeListaAnuncioImovel>();

      PreparedStatement stmt = conexao.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {

        EntidadeListaAnuncioImovel n = new EntidadeListaAnuncioImovel();

        n.setProprietario(rs.getString("imov_proprietario"));
        n.setBairro(rs.getString("imov_bairro"));
        n.setCidade(rs.getString("imov_cidade"));
        n.setValor(rs.getDouble("imov_valor"));
        n.setTipoImovel(rs.getString("anun_tipo").charAt(0));
        n.setStatus(rs.getBoolean("anun_status"));

        lista.add(n);
      }
      stmt.close();
      rs.close();

      return lista;
    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_ListaAnuncioIMovel) " + e.getMessage());
    }
    return null;
  }
}
