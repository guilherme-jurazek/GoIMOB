package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.controller.Config.Defines;
import br.com.fipp.gerenciador.model.Banco;
import br.com.fipp.gerenciador.model.Empresa;

public class ListaEmpresa implements ActionControl {

	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// System.out.println("ListaEmpresa");
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		request.setAttribute("empresas", lista);

		return "forward:" + Defines.VIEW_PATH + "listaEmpresa.jsp";
	}
}
