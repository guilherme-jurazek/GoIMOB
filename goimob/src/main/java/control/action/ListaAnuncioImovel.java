package control.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.VARS;
import control.ControlObj;
import model.entiny.EntidadeListaAnuncioImovel;

public class ListaAnuncioImovel implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {
    ControlObj retorno = null;

    switch (request.getMethod()) {

      case "POST":
        break;

      case "GET":
        List<EntidadeListaAnuncioImovel> lista = EntidadeListaAnuncioImovel.obterLista(request);
        String json = VARS.gson.toJson(lista);
        System.out.println(json);
        
        retorno = new ControlObj("json", json);
        break;

      default:
        break;
    }

    return retorno;
  }

}
