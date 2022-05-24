package model.entiny;

import javax.servlet.http.HttpServletRequest;

import dao.DAO_Imovel;

public class EntidadeImovel {

  private int cod_imov;
  private double imovel_valor;
  private String proprietario_imovel;
  private String cidade_imovel;
  private String bairro_imovel;
  private String rua_imovel;
  private int numero_imovel;
  private String uf_imovel;
  private String cep_imovel;
  
  public EntidadeImovel() {
  }
  
  
  public String getCep_imovel() {
    return cep_imovel;
  }


  public void setCep_imovel(String cep_imovel) {
    this.cep_imovel = cep_imovel;
  }


  public String getImovel_valor() {
    return String.valueOf(imovel_valor);
  }


  public void setImovel_valor(String imovel_valor) {
    this.imovel_valor = Double.valueOf(imovel_valor);
  }


  public String getCod_imov() {

    return String.valueOf(cod_imov);
  }

  public void setCod_imov(String cod_imov) {
    this.cod_imov = Integer.valueOf(cod_imov);
  }

  public String getProprietario_imovel() {
    return proprietario_imovel;
  }

  public void setProprietario_imovel(String proprietario_imovel) {
    this.proprietario_imovel = proprietario_imovel;
  }

  public String getCidade_imovel() {
    return cidade_imovel;
  }

  public void setCidade_imovel(String cidade_imovel) {
    this.cidade_imovel = cidade_imovel;
  }

  public String getBairro_imovel() {
    return bairro_imovel;
  }

  public void setBairro_imovel(String bairro_imovel) {
    this.bairro_imovel = bairro_imovel;
  }

  public String getRua_imovel() {
    return rua_imovel;
  }

  public void setRua_imovel(String rua_imovel) {
    this.rua_imovel = rua_imovel;
  }

  public String getNumero_imovel() {
    return String.valueOf(numero_imovel);
  }

  public void setNumero_imovel(String numero_imovel) {
    this.numero_imovel = Integer.valueOf(numero_imovel);

  }

  public String getUf_imovel() {
    return uf_imovel;
  }

  public void setUf_imovel(String uf_imovel) {
    this.uf_imovel = uf_imovel;
  }

  public void salvarImovel(HttpServletRequest request) {

    DAO_Imovel.salvar(request, this);
  }

}
