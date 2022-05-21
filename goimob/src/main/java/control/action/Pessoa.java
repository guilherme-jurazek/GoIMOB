package control.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import control.filter.RequestWrapper;
import model.entiny.EntidadePessoa;

public class Pessoa implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException, SQLException {

    ControlObj retorno = null;

    switch (request.getMethod()) {

      case "POST":

          String nome = request.getParameter("name"); // ok
          String dataNascimento = request.getParameter("data_nasc"); // Faltando
          dataNascimento = "1998-09-18"; // Faltando
          String num = request.getParameter("nresidencia"); // Ok
          String cep = request.getParameter("cep"); // Ok

          /* parametros que serão obtidos por API atráves do CEP */
          String uf = request.getParameter("uf");
          String cidade = request.getParameter("cidade");
          String bairro = request.getParameter("bairro");
          String rua = request.getParameter("rua");
          
          uf = "SP";
          cidade = "Nantes";
          bairro = "Centro";
          rua = "Siqueira";
          /* parametros que serão obtidos por API atráves do CEP */

          EntidadePessoa pes = new EntidadePessoa();

          pes.setNome(nome);
          pes.setDataNascimento(dataNascimento);
          pes.setRua(rua);
          pes.setBairro(bairro);
          pes.setNum(num);
          pes.setCEP(cep);
          pes.setUF(uf);
          pes.setCidade(cidade);

          pes.salvarPessoa(request);

          ((RequestWrapper) request).setParameter("id", pes.getCodPes());
          ((RequestWrapper) request).setParameter("action", "PessoaFisica");

          retorno = new ControlObj("forward", "in");
        break;

      case "GET":
        // REGRA AQUI
        break;

      case "PUT":
        // REGRA AQUI
        break;

      case "DELETE":
        // REGRA AQUI
        break;

      default:
        break;
      // CÓDIGO PARA QUANDO ESSA CLASE NÃO ATENDE O MÉTODO REQUISITADO
    }
    return retorno;
  }

}
