package model.entiny;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DAO_PessoaFisica;

public class EntidadePessoaFisica extends EntidadePessoa {

  private String CPF;
  private char sexo;

  public EntidadePessoaFisica() {
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public Character getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo.charAt(0);
  }

  public void salvarPessoaFisica(Connection conn) throws SQLException
  {
    DAO_PessoaFisica.salvar(conn, this);
  }
}
