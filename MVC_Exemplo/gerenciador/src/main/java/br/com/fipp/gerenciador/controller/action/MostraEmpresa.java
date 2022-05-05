package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.controller.Config.Defines;
import br.com.fipp.gerenciador.model.Banco;
import br.com.fipp.gerenciador.model.Empresa;

public class MostraEmpresa implements ActionControl {

  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String paramId = request.getParameter("id");
    Integer id = Integer.valueOf(paramId);

    Banco banco = new Banco();

    Empresa empresa = banco.buscaEmpresaPelaId(id);

    // System.out.println(empresa.getNome());

    request.setAttribute("empresa", empresa);

    return "forward:" + Defines.VIEW_PATH + "formAlteraEmpresa.jsp";
  }
}
