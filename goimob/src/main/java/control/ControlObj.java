package control;

public class ControlObj {
  private String method;
  private String resource;

  public ControlObj(String method, String path) {
    this.method = method;
    this.resource = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getResource() {
    return resource;
  }

  public void setResource(String path) {
    this.resource = path;
  }


}
