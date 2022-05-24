package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String fk_cod_usu = request.getParameter("usu_id");
        String codImov = request.getParameter("imov_id");
        // PEGAR AS FOTOS

        EntidadeAnuncioImovel anun = new EntidadeAnuncioImovel();

        anun.setDescricao_anuncio(descricao_anum);
        anun.setFk_cod_imov(codImov);
        anun.setFk_cod_usu(fk_cod_usu);

        anun.salvarAnuncioImovel(request);

        break;

      default:
        break;
    }

    return retorno;
  }

}
