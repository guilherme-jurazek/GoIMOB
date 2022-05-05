package br.com.fipp.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ActionControl {

  String exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
  
}
