package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.VARS;
import control.ControlObj;
import model.entiny.EntidadeAnuncioImovel;

public class AnuncioImovel implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {

    ControlObj retorno = null;
    switch (request.getMethod()) {
      case "POST":

        String descricao_anum = request.getParameter("anun_desc");
        String anun_tipo = request.getParameter("anun_tipo");
        String codImov = request.getParameter("imov_id"); // X
        // String fk_cod_usu = (int)
        // request.getSession().getAttribute("id_usuario_atual");

        // PEGAR AS FOTOS

        EntidadeAnuncioImovel anun = new EntidadeAnuncioImovel();

        anun.setDescricao_anuncio(descricao_anum);
        anun.setAnun_tipo(anun_tipo);
        anun.setFk_cod_imov(codImov);
        anun.setFk_cod_usu("1");

        anun.salvarAnuncioImovel(request);

        retorno = new ControlObj("json", VARS.gson.toJson("Ok!"));

        break;

      case "GET":

        // String anun_id = request.getParameter("anun_id");
        // EntidadeAnuncioImovel anun2 = new EntidadeAnuncioImovel();

        // if (anun_id != null) {
        //   // um cara.
        // } else {
          
        // }

        break;
      default:
        break;
    }

    return retorno;
  }

}
