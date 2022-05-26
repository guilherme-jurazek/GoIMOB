package model.entiny;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

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

  public void salvarPessoaFisica(HttpServletRequest request) throws SQLException
  {
    DAO_PessoaFisica.salvar(request, this);
  }
}
