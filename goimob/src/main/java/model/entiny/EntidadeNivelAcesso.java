package model.entiny;

public class EntidadeNivelAcesso {
  /**
   * NÍVEL DE ACESSO DO USUÁRIO
   */

   /**
    * - admin
      - operador
      - usuário
    */

  int codNivelAcesso;
  
  public enum Niveis {
    ADMIN,
    OPERADOR,
    USUARIO,
  }
  
  public EntidadeNivelAcesso(String cod) {
    this.codNivelAcesso = Integer.valueOf(cod);
  }

  public int getCodNivelAcesso() {
    return codNivelAcesso;
  }

  public void setCodNivelAcesso(int codNivelAcesso) {
    this.codNivelAcesso = codNivelAcesso;
  }

  public String getDescricaoNivelAcesso() {
    Niveis n[] = Niveis.values();
    return n[codNivelAcesso].name();
  }

  public void salvarNivelAcesso()
  {
    
  }
}
