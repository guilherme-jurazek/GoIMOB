package control.action;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import database.DataBaseConnection;
import model.entiny.EntidadePessoaFisica;

public class PessoaFisica implements iAction{

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    switch (request.getMethod()) {
      case "POST" :

        try (Connection conn = new DataBaseConnection().getConnection()) {
          //NOVO USUARIO
          //// Entidade Pessoa Fisica /////
          String id = request.getParameter("id");
          String cpf = request.getParameter("cpf");  //Ok
          String sexo = request.getParameter("sexo"); //Ok

          EntidadePessoaFisica pes_fis = new EntidadePessoaFisica();

          pes_fis.setCodPes(id);
          pes_fis.setCPF(cpf);
          pes_fis.setSexo(sexo);

          pes_fis.salvarPessoaFisica(conn);
          conn.close();
          
        } catch (Exception e) {
          System.out.println("Erro (PessoaFisica): " + e.toString());
        }
        
        break;
      case "GET" :
        break;

      case "PUT" :
        break;

      default:
        break;
    }
    return null;
  }
  
}
