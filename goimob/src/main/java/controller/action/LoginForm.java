package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.iAction;

public class LoginForm implements iAction {

  @Override
  public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /**
     * DEFINIR CHAVEAMENTO
     * GET
     * PUT
     * DELETE
     * ...
     */
    
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
