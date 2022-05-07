package br.com.fipp.gerenciador.controller.servlet;

import javax.servlet.http.HttpServletRequest;

public class GetRequestData {
  
  public static void getData(HttpServletRequest req) {

    String info1 = ((HttpServletRequest) req).getRequestURI();
    String info2 = ((HttpServletRequest) req).getRequestURL().toString();
    String info3 = ((HttpServletRequest) req).getQueryString();

    String info4 = ((HttpServletRequest) req).getContextPath();
    String info5 = ((HttpServletRequest) req).getServletPath();
    String info6 = ((HttpServletRequest) req).getPathInfo();
    String info7 = ((HttpServletRequest) req).getPathTranslated();

    // String info8 = ((HttpServletRequest) req).changeSessionId();
    String info9 = ((HttpServletRequest) req).getRequestedSessionId();

    String info10 = ((HttpServletRequest) req).getAuthType();
    String info11 = ((HttpServletRequest) req).getContentType();
    String info12 = ((HttpServletRequest) req).getProtocol();

    String info13 = ((HttpServletRequest) req).getCharacterEncoding();
    
    String info14 = ((HttpServletRequest) req).getLocalAddr();
    String info15 = ((HttpServletRequest) req).getLocalName();
    String info16 = Integer.toString(((HttpServletRequest) req).getLocalPort());
    
    String info17 = ((HttpServletRequest) req).getMethod();
    
    String info18 = ((HttpServletRequest) req).getRemoteAddr();
    String info19 = ((HttpServletRequest) req).getRemoteHost();
    String info20 = ((HttpServletRequest) req).getRemoteUser();
    String info21 = Integer.toString(((HttpServletRequest) req).getRemotePort());
    
    String info22 = ((HttpServletRequest) req).getServerName();
    String info23 = Integer.toString(((HttpServletRequest) req).getServerPort());
  
    String info24 = ((HttpServletRequest) req).getScheme();
    String info25 = ((HttpServletRequest) req).toString();
    
    String info26 = HttpServletRequest.BASIC_AUTH;
    String info27= HttpServletRequest.CLIENT_CERT_AUTH;
    String info28 = HttpServletRequest.DIGEST_AUTH;
    String info29 = HttpServletRequest.FORM_AUTH;

    String info30 = Integer.toString(((HttpServletRequest) req).getContentLength());
    
    String info31 = Long.toString(((HttpServletRequest) req).getContentLengthLong());

    String info32 = ((HttpServletRequest) req).getServletContext().getRealPath("/");
    String info33 = ((HttpServletRequest) req).getServletContext().getContextPath();

    String info34 = ((HttpServletRequest) req).getServletContext().getServerInfo();
    String info35 = ((HttpServletRequest) req).getServletContext().getServletContextName();
    String info36 = ((HttpServletRequest) req).getServletContext().getVirtualServerName();
    
    System.out.println("getRequestURI: " + info1);
    System.out.println("getRequestURL: " + info2);
    System.out.println("getQueryString: " + info3);
    System.out.println("getContextPath: " + info4);
    System.out.println("getServletPath: " + info5);
    System.out.println("getPathInfo: " + info6);
    System.out.println("getPathTranslated: " + info7);
    // System.out.println("changeSessionId: " + info8); //pode dar erro
    System.out.println("getRequestedSessionId: " + info9);
    System.out.println("getAuthType: " + info10);
    System.out.println("getContentType: " + info11);
    System.out.println("getProtocol: " + info12);
    System.out.println("getCharacterEncoding: " + info13);
    System.out.println("getLocalAddr: " + info14);
    System.out.println("getLocalName: " + info15);
    System.out.println("getLocalPort: " + info16);
    System.out.println("getMethod: " + info17);
    System.out.println("getRemoteAddr: " + info18);
    System.out.println("getRemoteHost: " + info19);
    System.out.println("getRemoteUser: " + info20);
    System.out.println("getRemotePort: " + info21);
    System.out.println("getServerName: " + info22);
    System.out.println("getServerPort: " + info23);
    System.out.println("getScheme: " + info24);
    System.out.println("request.toString: " + info25);
    System.out.println("BASIC_AUTH: " + info26);
    System.out.println("CLIENT_CERT_AUTH: " + info27);
    System.out.println("DIGEST_AUTH: " + info28);
    System.out.println("FORM_AUTH: " + info29);
    System.out.println("getContentLength: " + info30);
    System.out.println("getContentLengthLong: " + info31);
    System.out.println("getServletContext.getRealPath(\"/\"): " + info32);
    System.out.println("getServletContext.getContextPath: " + info33);
    System.out.println("getServletContext.getServerInfo: " + info34);
    System.out.println("getServletContext.getServletContextName: " + info35);
    System.out.println("getServletContext.getVirtualServerName: " + info36);

    //Objetos que herdam de HttpServletRequest [Analizar!!!]
    // ((HttpServletRequest) req).getSession();
    // ((HttpServletRequest) req).getDispatcherType();
    // ((HttpServletRequest) req).getHttpServletMapping();
    // ((HttpServletRequest) req).getInputStream();
    // ((HttpServletRequest) req).getLocale();
    // ((HttpServletRequest) req).getReader();
    // ((HttpServletRequest) req).getServletContext();
    // ((HttpServletRequest) req).getUserPrincipal();
    // ((HttpServletRequest) req).newPushBuilder();
    // ((HttpServletRequest) req).startAsync();
  }
}
