package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import control.filter.RequestWrapper;
import model.entiny.EntidadeImovel;

public class Imovel implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {

    ControlObj retorno = null;

    switch (request.getMethod())
    {
      case "POST":

        String imovel_valor =  request.getParameter("imov_valor");
        String proprietario_imovel = request.getParameter("imov_proprietario");
        String cidade_imovel = request.getParameter("imov_cidade");
        String bairro_imovel = request.getParameter("imov_bairro");
        String rua_imovel = request.getParameter("imov_rua");
        String numero_imovel = request.getParameter("imov_numero");
        String uf_imovel = request.getParameter("imov_uf");
        String cep_imovel = request.getParameter("imov_cep");

        EntidadeImovel imov = new EntidadeImovel();

        imov.setImovel_valor(imovel_valor);
        imov.setProprietario_imovel(proprietario_imovel);
        imov.setCidade_imovel(cidade_imovel);
        imov.setBairro_imovel(bairro_imovel);
        imov.setRua_imovel(rua_imovel);
        imov.setNumero_imovel(numero_imovel);
        imov.setUf_imovel(uf_imovel);
        imov.setCep_imovel(cep_imovel);

        imov.salvarImovel(request);

        
        ((RequestWrapper) request).setParameter("action", "AnuncioImovel");
        ((RequestWrapper) request).setParameter("imov_id", imov.getCod_imov());

        
        retorno = new ControlObj("forward", "in");

        break;

      case "GET":
        // REGRA AQUI.
        break;

      case "PUT":
        // REGRA AQUI.
        break;

      case "DELETE":
        // REGRA AQUI.
        break;

      default:
        // CÓDIGO PARA QUANDO ESSA CLASE NÃO ATENDE O MÉTODO REQUISITADO.
    }

    return retorno;
  }

}
