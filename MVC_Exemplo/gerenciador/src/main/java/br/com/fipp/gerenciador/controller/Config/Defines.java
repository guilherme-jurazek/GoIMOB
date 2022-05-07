package br.com.fipp.gerenciador.controller.Config;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

final public class Defines {
  public static final String VIEW_PATH = "WEB-INF/view/";
  public static final Gson  gson = new Gson();
  public static final XStream xstream = new XStream();
}
