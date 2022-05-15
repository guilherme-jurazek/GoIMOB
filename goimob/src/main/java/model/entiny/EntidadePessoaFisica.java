package model.entiny;

public class EntidadePessoaFisica extends EntidadePessoa {
  int cod;
  String CPF;
  Character sexo;
  
  public EntidadePessoaFisica(String nome, String dataNascimento, String rua, String bairro, int num, String CEP, String UF, String cidade, String CPF, Character sexo) 
  {
    super(nome, dataNascimento, rua, bairro, num, CEP, UF, cidade);
    this.CPF = CPF;
    this.sexo = sexo;
  }


  public EntidadePessoaFisica(int cod, String cPF, Character sexo) {
    this.cod = cod;
    this.CPF = cPF;
    this.sexo = sexo;
  }

  public EntidadePessoaFisica() {

  }
  
  public int getCod() {
    return cod;
  }
  public void setCod(int cod) {
    this.cod = cod;
  }
  public String getCPF() {
    return CPF;
  }
  public void setCPF(String cPF) {
    CPF = cPF;
  }
  public Character getSexo() {
    return sexo;
  }
  public void setSexo(Character sexo) {
    this.sexo = sexo;
  }

  public boolean novaPessoa()
  {
    return true;
  }
}
