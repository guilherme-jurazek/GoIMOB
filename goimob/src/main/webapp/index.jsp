<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="pt-BR">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <%-- <meta charset="UTF-8"> --%>
    <%-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> --%>
    <%-- <meta charset="ISO-8859-1"> --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ruluko&display=swap" rel="stylesheet">
    <link rel="stylesheet" href='resources/css/style.css'>
    <%-- <style>
      body {
        background-image: url("sfondo.jpg");
      }
    </style> --%>
</head>
<body>
    <%-- ==============  HEADER ============== --%>
    <nav class="navbar navbar-expand-md bg-white navbar-light fixed-top">
        <a class="navbar-brand" href="#"><img src="resources/images/Logo.png" style="width: 175px; margin-left: 20px"> </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse " id="collapsibleNavbar" style="justify-content: right; margin-right: 20px">
          <ul class="navbar-nav ">
            <li class="nav-item">
              <a class="nav-link text-dark nav-text-style" href="#">Locações</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark nav-text-style" href="#">Venda</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark nav-text-style" href="#">Imobiliárias</a>
            </li>    
            <li class="nav-item">
                <a class="nav-link text-dark nav-text-style" href="#"><img src="resources/images/User.png" width="28px">Login</a>
            </li>    
          </ul>
        </div>  
    </nav>
    <%-- =====XXX======  HEADER ======XXX===== --%> 	
    
    <%-- ==============  BODY ============== --%>
    <div class="bg-image-login">
        <div class="containter-login">
            <div>
                <h1 class="tittle-login">Login</h1>
            </div>
            <div>
                <div>
                    <form class="form-login">
                        <label class="text-form"><p>Email</p></label><br>
                        <input class="input-form" type="email"><br>
                        <label class="text-form"><p>Senha</p></label><br>
                        <input class="input-form" type="password"><br>
                        <a href="script/PainelControle.js"><input class="btn-login" type="submit" value="Login"></a>
                    </form>
                </div>
                <div>
                    <p class="text-modal">Ou entre usando:</p>
                    <div> 
                        <img class="img-google" src="resources/images/GoogleIcon.png" width="60px;"> 
                        <img class="img-face" src="resources/images/FaceIcon.png" width="60px"> 
                    </div>
                </div>
                <div>
                    <p class="text-modal">Deseja se cadastrar?</p>
                    <a href="Cadastro.jsp"><button class="btn-reg">Cadastre-se</button></a>
                </div>
            </div>    
        </div>
    </div>        
    <%-- =====XXX======  BODY ======XXX===== --%>     
    
    <%-- ==============  FOOTER ============== --%>
    <div class="footer-imob">
         <%-- A FAZER --%>
    </div>
    <%-- =====XXX======  FOOTER =====XXX====== --%>
</body>
</html>