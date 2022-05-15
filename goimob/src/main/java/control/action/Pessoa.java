package control.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import database.DataBaseConnection;
import model.entiny.EntidadePessoa;

public class Pessoa implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ControlObj retorno = new ControlObj("", "");

    switch (request.getMethod()) {

      case "POST":

        try (Connection conn = new DataBaseConnection().getConnection())
        {
          String nome = request.getParameter("nome");
          String dataNascimento = request.getParameter("data_nasc");
          String rua = request.getParameter("rua");
          String bairro = request.getParameter("bairro");
          String num = request.getParameter("num");
          String cep = request.getParameter("cep");
          String uf = request.getParameter("uf");
          String cidade = request.getParameter("cidade");
          
          EntidadePessoa pes = new EntidadePessoa();

          pes.setNome(nome);
          pes.setDataNascimento(dataNascimento);
          pes.setRua(rua);
          pes.setBairro(bairro);
          pes.setNum(num);
          pes.setCEP(cep);
          pes.setUF(uf);
          pes.setCidade(cidade);

          pes.salvar(conn);
          conn.close();

          retorno.setMethod("json");
          retorno.setResource("Deu certo porra!");

        } catch (SQLException e) {
          e.printStackTrace();
        }

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
        // CÓDIGO PARA QUANDO ESSA CLASE NÃO ATENDE O MÉTODO REQUISITADO
    }

    /**
     * RETORNO DO COMMAND.
     * 
     * após a classe action executar sua tarefa, ele tem que retornar
     * para o ControllerFilter com um redirect, ou forward, cada qual
     * com suas características a depender do fluxo.
     */
    
    return retorno;
  }

}
