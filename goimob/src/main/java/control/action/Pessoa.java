package control.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;
import database.DataBaseConnection;
import model.entiny.EntidadeUsuario;

public class Pessoa implements iAction {

  @Override
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ControlObj retorno = new ControlObj("", "");

    switch (request.getMethod()) {

      case "POST":

        try (Connection conn = new DataBaseConnection().getConnection())
        {
          ///// Entidade Pessoa /////
          String nome = request.getParameter("name"); //ok
          String dataNascimento = request.getParameter("data_nasc"); dataNascimento = "1998-09-18"; //Faltando
          String cep = request.getParameter("cep"); //Ok
          String num = request.getParameter("nresidencia"); //Ok
          
          /* parametros que serão obtidos por API */
          String uf = request.getParameter("uf");
          String cidade = request.getParameter("cidade");
          String bairro = request.getParameter("bairro");
          String rua = request.getParameter("rua");
          uf = "SP";
          cidade = "Nantes";
          bairro = "Centro";
          rua = "Siqueira";
          /* parametros que serão obtidos por API */

          //--------------------------------

          ///// Entidade Pessoa Fisica /////
          String cpf = request.getParameter("cpf");  //Ok
          String sexo = request.getParameter("sexo"); //Ok
          //--------------------------------

          ///// Entidade Usuario /////
          String email = request.getParameter("email"); //Ok
          String senha = request.getParameter("senha"); //Ok
          //--------------------------------

          EntidadeUsuario usu = new EntidadeUsuario();

          ///// Entidade Pessoa /////
          usu.setNome(nome);
          usu.setDataNascimento(dataNascimento);
          usu.setRua(rua);
          usu.setBairro(bairro);
          usu.setNum(num);
          usu.setCEP(cep);
          usu.setUF(uf);
          usu.setCidade(cidade);

          ///// Entidade Pessoa Fisica /////
          usu.setCPF(cpf);
          usu.setSexo(sexo);

          ///// Entidade Usuario /////
          usu.setEmail(email);
          usu.setSenha(senha);

          usu.salvarPessoa(conn);


          //Mover para acao pessoa fisica.
          usu.salvarPessoaFisica(conn);

          //Mover para achao pessoa usuario.
          usu.salvarUsuario(conn);

          conn.close();

          //setar volta
          retorno.setMethod("forward");
          retorno.setResource("PessoaFisica");

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
    return retorno;
  }

}
