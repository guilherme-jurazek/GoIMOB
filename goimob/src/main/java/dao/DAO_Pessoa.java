package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadePessoa;

public class DAO_Pessoa extends GenericDAO {

  public static void salvar(HttpServletRequest request, EntidadePessoa pes) {
    
    Connection conexao = (Connection) request.getAttribute("conexao_bd");

    String sql = "INSERT INTO tb_pessoa " + 
    "(pes_nome, pes_data_nasc, pes_rua, pes_bairro, pes_num, pes_cep, pes_uf, pes_cidade) " + 
    "VALUES (?,?,?,?,?,?,?,?)"; //fazer apend de acordo com a quantidade de Gets.

    try {

      PreparedStatement ps = create(conexao, sql, pes.getNome(), pes.getDataNascimento(), pes.getRua(), pes.getBairro(), pes.getNum(), pes.getCEP(), pes.getUF(), pes.getCidade());
      ResultSet rs = ps.getGeneratedKeys();
      rs.next();
      pes.setCodPes(String.valueOf(rs.getInt(1)));
      rs.close();
      ps.close();

    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_Pessoa) " + e.getMessage());
    }
  }
}
