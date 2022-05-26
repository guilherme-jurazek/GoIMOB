package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import model.entiny.EntidadeUsuario;

public class Usuario implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {

    ControlObj retorno = null;

    switch (request.getMethod()) {
      case "POST":

        String id = request.getParameter("pes_id");
        String email = request.getParameter("usu_email"); // Ok
        String senha = request.getParameter("usu_senha"); // Ok

        EntidadeUsuario usu = new EntidadeUsuario();

        usu.setCodPes(id);
        usu.setEmail(email);
        usu.setSenha(senha);
        usu.setCodNivelAcesso(Integer.valueOf(usu.getCodPes()) == 1 ? 1 : 3);
        usu.salvarUsuario(request);
        retorno = new ControlObj("forward", "index.jsp");

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
