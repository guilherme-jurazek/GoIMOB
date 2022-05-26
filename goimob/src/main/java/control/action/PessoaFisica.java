package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import control.filter.RequestWrapper;
import model.entiny.EntidadePessoaFisica;

public class PessoaFisica implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {

    ControlObj retorno = null;

    switch (request.getMethod()) {
      case "POST":

        String id = request.getParameter("pes_id");
        String cpf = request.getParameter("pes_fis_cpf"); // Ok
        String sexo = request.getParameter("pes_fis_sexo"); // Ok

        EntidadePessoaFisica pes_fis = new EntidadePessoaFisica();

        pes_fis.setCodPes(id);
        pes_fis.setCPF(cpf);
        pes_fis.setSexo(sexo);

        pes_fis.salvarPessoaFisica(request);

        ((RequestWrapper) request).setParameter("action", "Usuario");

        retorno = new ControlObj("forward", "in");
        break;

      case "GET":
        break;

      case "PUT":
        break;

      default:
        break;
    }
    return retorno;
  }

}
