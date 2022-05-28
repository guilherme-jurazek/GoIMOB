package model.entiny;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dao.DAO_ListaAnuncioImovel;

public class EntidadeListaAnuncioImovel {

  private String proprietario;
  private String bairro;
  private String cidade;
  private Double valor;
  private Character tipoImovel;
  private Boolean status;
  
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public String getProprietario() {
    return proprietario;
  }

  public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Character getTipoImovel() {
    return tipoImovel;
  }

  public void setTipoImovel(Character tipoImovel) {
    this.tipoImovel = tipoImovel;
  }

  
  public static List<EntidadeListaAnuncioImovel> obterLista(HttpServletRequest request) {
    return DAO_ListaAnuncioImovel.recuperarLista(request);
  }
}
