package br.com.fipp.gerenciador.model;

public class User {

  private String user;
  private String pass;

  
  public User(String user, String pass) {
    this.user = user;
    this.pass = pass;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public boolean isEqual(String user, String pass) {
		if(!this.user.equals(user)) {
			return false;
		}
		
		if(!this.pass.equals(pass)) {
			return false;
		}
    return true;
  }	
		
}
