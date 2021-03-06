package control.action;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ControlObj;

public interface iAction {

  ControlObj exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException;
  
  /**
   * Essa é a classe de interface
   * que obriga a implementação das
   * ações, que nada mais é do que
   * o pattern denominado Command.
   * 
   * "Comportamental – preocupa-se 
   * com o comportamento do objeto 
   * (fazer) e suas variações".
   * 
   * A classe "ControllerFilter" é
   * instanciada pelo servidor tomcat
   * que por sua vez, instacia as cla
   * sses de negócio dentro de "action"
   * que são as classes responsáveis
   * por executar suas ações baseadas
   * no método da requisição (GET, PUT
   * POST, DELETE...). Tudo na pasta 
   * "controller", é responsável pela
   * camada controle desta aplicação.
   */
}