package control.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;

public class NivelAcesso implements iAction {
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
  public ControlObj exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    switch (request.getMethod()) {
      case "POST":
        
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

    /**
     * RETORNO DO COMMAND.
     * 
     * após a classe action executar sua tarefa, ele tem que retornar
     * para o ControllerFilter com um redirect, ou forward, cada qual
     * com suas características a depender do fluxo.
     */
    // return "redirect:algumLugar";
    return new ControlObj("", "");
  }
}
