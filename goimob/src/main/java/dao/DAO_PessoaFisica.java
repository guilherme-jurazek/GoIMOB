package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.entiny.EntidadePessoaFisica;

public class DAO_PessoaFisica extends GenericDAO {

  public static void salvar(Connection conn, EntidadePessoaFisica pes_fis) throws SQLException {

    String sql = "INSERT INTO tb_pes_fisica " + 
    "(pes_fk_id, pesf_cpf, pesf_sexo) " +
    "VALUES (?,?,?)";
    
    PreparedStatement ps = create(conn, sql, pes_fis.getCodPes(), pes_fis.getCPF(), String.valueOf(pes_fis.getSexo()));
    ps.close();
  }
  
}
