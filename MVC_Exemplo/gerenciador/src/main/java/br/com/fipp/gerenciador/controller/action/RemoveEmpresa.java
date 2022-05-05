package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.model.Banco;

public class RemoveEmpresa implements ActionControl {
  
  public String exec (HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		// System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:ListaEmpresa";
  }
}
