package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fipp.gerenciador.controller.Config.Defines;
import br.com.fipp.gerenciador.model.Banco;
import br.com.fipp.gerenciador.model.Empresa;

public class EmpresaService implements ActionControl {

  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    List<Empresa> emp = new Banco().getEmpresas();
    String type = request.getHeader("accept");
    type = type == null ? "" : type;
    type = type.toLowerCase();

      // EM XML
      if (type.endsWith("xml")) {
        Defines.xstream.alias("empresa", Empresa.class);
        response.setContentType("application/xml");
        response.getWriter().print(Defines.xstream.toXML(emp));
      } else {
        response.setContentType("application/json");
        response.getWriter().print(Defines.gson.toJson(emp));
      }
    return "";
  }
}
