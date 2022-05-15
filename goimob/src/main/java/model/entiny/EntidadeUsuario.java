package model.entiny;

import java.sql.Connection;
import java.util.Calendar;

public class EntidadeUsuario extends EntidadePessoaFisica {
  
  int codUsu;
  Calendar dataCadastro;
  int codNivelAcesso;
  String senha;
  


  // public EntidadeUsuario(String nome, String telefone1, String telefone2, Calendar dataNascimento, String email,
  //     String rua, String bairro, int num, String cEP, String uF, String cidade, int cod, String cPF, Character sexo,
  //     int codUsu, Calendar dataCadastro, int codNivelAcesso, String senha) {
  //   super(nome, telefone1, telefone2, dataNascimento, email, rua, bairro, num, cEP, uF, cidade, cod, cPF, sexo);
  //   this.codUsu = codUsu;
  //   this.dataCadastro = dataCadastro;
  //   this.codNivelAcesso = codNivelAcesso;
  //   this.senha = senha;
  // }

  public EntidadeUsuario(int cod, String cPF, Character sexo, int codUsu, Calendar dataCadastro, int codNivelAcesso,
      String senha) {
    super(cod, cPF, sexo);
    this.codUsu = codUsu;
    this.dataCadastro = dataCadastro;
    this.codNivelAcesso = codNivelAcesso;
    this.senha = senha;
  }

  public EntidadeUsuario(int codUsu, Calendar dataCadastro, int codNivelAcesso, String senha) {
    this.codUsu = codUsu;
    this.dataCadastro = dataCadastro;
    this.codNivelAcesso = codNivelAcesso;
    this.senha = senha;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public EntidadeUsuario() {

  }
  
  public int getCodUsu() {
    return codUsu;
  }

  public void setCodUsu(int codUsu) {
    this.codUsu = codUsu;
  }
  public Calendar getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(Calendar dataCadastro) {
    this.dataCadastro = dataCadastro;
  }
  public int getCodNivelAcesso() {
    return codNivelAcesso;
  }
  public void setCodNivelAcesso(int codNivelAcesso) {
    this.codNivelAcesso = codNivelAcesso;
  }

  public static boolean salvar(Connection conn,EntidadeUsuario usu)
  {

    return true;
  }
}
