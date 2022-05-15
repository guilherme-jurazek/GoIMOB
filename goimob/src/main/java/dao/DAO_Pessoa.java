package dao;

import java.sql.Connection;

import model.entiny.EntidadePessoa;

public class DAO_Pessoa extends GenericDAO {

  public static void salvar(Connection conn, EntidadePessoa pes) {
    
    String sql = "INSERT INTO tb_pessoa " + 
    "(pes_nome, pes_data_nasc, pes_rua, pes_bairro, pes_num, pes_cep, pes_uf, pes_cidade) " + 
    "VALUES (?,?,?,?,?,?,?,?)"; //fazer apend de acordo com a quantidade de Gets.
  
    create(conn, sql, pes.getNome(), pes.getDataNascimento(), pes.getRua(), pes.getBairro(), pes.getNum(), pes.getCEP(), pes.getUF(), pes.getCidade());
  }

}
