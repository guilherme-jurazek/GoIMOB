package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.controller.Config.Defines;

public class NovaEmpresaForm implements ActionControl {
  
  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		return "forward:" + Defines.VIEW_PATH + "formNovaEmpresa.jsp";
  }
}
