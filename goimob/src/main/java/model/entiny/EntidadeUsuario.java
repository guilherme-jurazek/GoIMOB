package model.entiny;

import javax.servlet.http.HttpServletRequest;

import dao.DAO_Usuario;

public class EntidadeUsuario extends EntidadePessoaFisica {
  
  String email;
  String senha;
  int codNivelAcesso;

  public EntidadeUsuario() {}
  
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  public int getCodNivelAcesso() {
    return codNivelAcesso;
  }
  public void setCodNivelAcesso(int codNivelAcesso) {
    this.codNivelAcesso = codNivelAcesso;
  }


  public void salvarUsuario(HttpServletRequest request) {
    DAO_Usuario.salvar(request, this);
  }
}
