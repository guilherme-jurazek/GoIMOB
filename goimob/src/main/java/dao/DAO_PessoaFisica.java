package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.entiny.EntidadePessoaFisica;

public class DAO_PessoaFisica extends GenericDAO {

  public static void salvar(HttpServletRequest request, EntidadePessoaFisica pes_fis) {

    Connection conexao = (Connection) request.getAttribute("conexao_bd");

    String sql = "INSERT INTO tb_pes_fisica " + 
    "(pes_fk_id, pesf_cpf, pesf_sexo) " +
    "VALUES (?,?,?)";
    try {
      PreparedStatement ps = create(conexao, sql, Integer.valueOf(pes_fis.getCodPes()), pes_fis.getCPF(), String.valueOf(pes_fis.getSexo()));
      ps.close();
    } catch (SQLException e) {
      request.setAttribute("erro_transacao", "(DAO_PessoaFisica) " + e.getMessage());
    }
  }
  
}
