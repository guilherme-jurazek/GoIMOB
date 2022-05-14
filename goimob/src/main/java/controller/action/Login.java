package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.iAction;

public class Login implements iAction {
  /**
   * CLASSES DE AÇÃO OU COMMAND
   * 
   * São classes que implementara um único método exigido pela classe
   * de interface iAction, essas classes seguirão o pattern "command".
   * essas classes de ação, são instanciadas pela classe ControllerFilter
   * que, por sua vez, recebe a URI requisitada pelo usuário, essa URI é
   * obtida pelo método getServletPath();
   * 
   * então, por exemplo, se no navegador o usuário requisita por:
   * 
   * localhost:8080/goimob/NivelAcesso
   * 
   * o valor devolvido pelo getServletPath(); é "NivelAcesso" que é o
   * mesmo nome de uma das classes em action.
   * 
   * OS MÉTODOS.
   * 
   * Os métodos que chegam com a requisição define o tipo de
   * operação a ser feita:
   * 
   * @POST + parâmetros/dados: um novo registro.
   * @GET + nenhum valor como parâmetro: obter todos os registros.
   * @GET + um ou mais parâmetros de identificação: obteremos um ou mais registros.
   * @PUT + dados como parâmetro: atualizar um ou mais registros.
   * @DELETE + um ou mais parâmetros de identifição: deletar um ou mais registros.
   * 
   * Os métodos podem ser opcionais, bastando não especificar no chaveamento switch.
   * Note que isso são convenções, são os patterns definidos pelo sistema REST
   * por tanto, não se trata de uma limitação de tecnologia, e sim de uma convenção
   * podendo ser personalizado.
   */
  @Override
  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    switch (request.getMethod()) {

      case "POST":
        // REGRA AQUI
        break;

      case "GET":
        // REGRA AQUI

        String login = request.getParameter("login");
        String pass = request.getParameter("pass");

        
        /**
         * utiliza os objetos DAO_Usuario junto à
         * entidade Usuario para validar usuario
         */


        //if (/*user != null*/ )
        //{
          /**
           * Obtem a sessao e pindura user_logged
           * passando a string nome de usuario user.
           */
          // HttpSession sess = request.getSession();
          // sess.setAttribute("user_logged", "muck" /*user*/);
          // return "redirect:ListaEmpresa";
        //}
        
        break;

      case "PUT":
        // REGRA AQUI
        break;

      case "DELETE":
        // REGRA AQUI
        break;

      default:
        // CÓDIGO PARA QUANDO ESSA CLASE NÃO ATENDE O MÉTODO REQUISITADO.
    }

    /**
     * RETORNO DO COMMAND.
     * 
     * após a classe action executar sua tarefa, ele tem que retornar
     * para o ControllerFilter com um redirect, ou forward, cada qual
     * com suas características a depender do fluxo.
     */
    return "redirect:algumLugar";
  }
  
}