package model.entiny;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import dao.DAO_AnuncioImovel;

public class EntidadeAnuncioImovel {
  
  private String descricao_anuncio;
  private Calendar data_cadastro;
  private char anun_tipo;
  private int fk_cod_imov;
  private int fk_cod_usu;
  //Fotos;

  public EntidadeAnuncioImovel() {}

  
  public String getAnun_tipo() {
    return String.valueOf(anun_tipo);
  }


  public void setAnun_tipo(String anun_tipo) {
    this.anun_tipo = anun_tipo.charAt(0);
  }


  public String getFk_cod_usu() {
    return String.valueOf(fk_cod_usu);
  }


  public void setFk_cod_usu(String fk_cod_usu) {
    this.fk_cod_usu = Integer.valueOf(fk_cod_usu);
  }


  public String getFk_cod_imov() {
    return String.valueOf(fk_cod_imov);
  }
  public void setFk_cod_imov(String fk_cod_imov) {
    
    this.fk_cod_imov = Integer.valueOf(fk_cod_imov);
  }
  public String getDescricao_anuncio() {
    return descricao_anuncio;
  }
  public void setDescricao_anuncio(String descricao_anuncio) {
    this.descricao_anuncio = descricao_anuncio;
  }
  public Calendar getData_cadastro() {
    return data_cadastro;
  }
  public void setData_cadastro(Calendar data_cadastro) {
    this.data_cadastro = data_cadastro;
  }

  public void salvarAnuncioImovel(HttpServletRequest request)
  {
    DAO_AnuncioImovel.salvar(request, this);
  }
}
