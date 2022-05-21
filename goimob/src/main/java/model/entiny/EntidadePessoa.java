package model.entiny;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import dao.DAO_Pessoa;

public class EntidadePessoa {

  private int codPes; // GERADOS PELO BANCO, ESTUDAR CLASSE SQL PARA VER SE TEM COMO DEVOLVER O VALOR
  private String nome;
  private LocalDate dataNascimento;
  private LocalDate dataCadastro; // GERADOS PELO BANCO, ESTUDAR CLASSE SQL PARA VER SE TEM COMO DEVOLVER O VALOR
  private String rua;
  private String bairro;
  private int num;
  private String CEP;
  private String UF;
  private String cidade;

  public EntidadePessoa() {
  }

  public LocalDate getDataCadastro() {
    return dataCadastro;
  }


  public String getCodPes() {
    return String.valueOf(codPes);
  }

  public void setCodPes(String codPes) {

    this.codPes = Integer.valueOf(codPes);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    this.dataNascimento = LocalDate.parse(dataNascimento, f);
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getNum() {
    return String.valueOf(num);
  }

  public void setNum(String num) {
    this.num = Integer.valueOf(num);
  }

  public String getCEP() {
    return CEP;
  }

  public void setCEP(String CEP) {
    this.CEP = CEP;
  }

  public String getUF() {
    return UF;
  }

  public void setUF(String UF) {
    this.UF = UF;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void salvarPessoa(HttpServletRequest request) {
    DAO_Pessoa.salvar(request, this);
  }
}
