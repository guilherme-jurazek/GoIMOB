package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.entiny.EntidadePessoa;

public class DAO_Pessoa extends GenericDAO {

  public static void salvar(Connection conn, EntidadePessoa pes) throws SQLException {
    
    String sql = "INSERT INTO tb_pessoa " + 
    "(pes_nome, pes_data_nasc, pes_rua, pes_bairro, pes_num, pes_cep, pes_uf, pes_cidade) " + 
    "VALUES (?,?,?,?,?,?,?,?)"; //fazer apend de acordo com a quantidade de Gets.

    PreparedStatement ps = create(conn, sql, pes.getNome(), pes.getDataNascimento(), pes.getRua(), pes.getBairro(), pes.getNum(), pes.getCEP(), pes.getUF(), pes.getCidade());
    ResultSet rs = ps.getGeneratedKeys();
    rs.next();
    pes.setCodPes(String.valueOf(rs.getInt(1)));
    rs.close();
    ps.close();
  }

}
