<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="pt-BR">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <%-- <meta charset="UTF-8"> --%>
    <%-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerar Contrato</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ruluko&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/style.css">
    <%-- <style>
        
    /* ========= BACKGROUND BODY CONTRATO ========= */
    .bg-image-contrato{
        background-image: url("../images/BackgroundContrato.png");
        height: 850px;
        width: 100%;
        background-size: cover;
        position:absolute;
        margin-top: 80px;
        padding-top: 60px
    }
    /* ====X==== BACKGROUND BODY CONTRATO ====X==== */
    
    /* ========= FORMULARIO CONTRATO ========= */
    .tittle-gerar{
        color: #000;
        font-weight: 600;
        text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
        font-size: 64px;
    }
    .containter-contrato{
        background-color: #918EFF;
        height: 675px;
        width: 750px;
        opacity: 0.74   ;
        border-radius: 45px;
        text-align: center;
        margin: 0 auto;
        padding-top: 50px
    }
    .btn-gerar{
        background-color: #4EFFB4;
        margin-top: 5px;
        border-radius: 20px;
        width: 140px;
        font-size: 25px;
        box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
        border: none;
    }
    .btn-gerar:hover{
        background-color: #4EDFB4;
    }
    .form-gerar{
        padding-left: 45px;
        padding-right: 45px;
    }
    .input-gerar{
        background-color: #D4EEE2;
        border-radius: 15px;
        border: none;
        font-size: 20px;
    }
    .label-gerar{
        color: #000;
        font-size: 24px;
        margin-bottom: 0;
        margin-top: 10px;
        font-weight: 600;
    }
    /* ====X==== FORMULARIO CONTRATO ====X==== */
        
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
                <a class="nav-link text-dark nav-text-style" href="#"><img src="resources/images/User.png" width="28px"> Login</a>
            </li>    
          </ul>
        </div>  
    </nav>
    <%-- =====XXX======  HEADER ======XXX===== --%> 	
    
    <%-- ==============  BODY ============== --%>
    <div class="bg-image-contrato">
        <div class="containter-contrato">
            <div>
                <h1 class="tittle-gerar">Gerar Contrato de Venda</h1>
            </div>
            <form class="form-gerar">
                <div class="row">
                    <div class="col">
                        <label><p class="label-gerar">Código do Usuário</p></label>
                        <select class="form-control input-gerar" id="exampleFormControlSelect1">
                            <option>1 - João Almeida</option>
                            <option>2 - Nome Genérico</option>
                            <option>3 - Teste de Nome</option>
                            <option>4 - Mais um Nome</option>
                            <option>5 - Último nome</option>
                        </select>
                    </div>
                    <div class="col">
                        <label ><p class="label-gerar">Dono do Imóvel</p></label>
                        <select class="form-control input-gerar" id="exampleFormControlSelect1">
                            <option>145 - Francisco Assis</option>
                            <option>146 - Cassia Perego</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><p class="label-gerar">Código do Anúncio</p></label>
                        <select class="form-control input-gerar" id="exampleFormControlSelect1">
                            <option>1 - Casa Padrão</option>
                            <option>2 - Mansão Prudente</option>
                            <option>3 - Casa Teste</option>
                        </select>
                    </div>
                    <div class="col">
                        <label ><p class="label-gerar">Desconto do imóvel(%)</p></label>
                        <input type="password" class="form-control input-gerar" placeholder="Exemplo: 25" name="pswd">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><p class="label-gerar">Taxa de Corretagem(%)</p></label>
                        <input type="text" class="form-control input-gerar" id="email" placeholder="Exemplo: 5" name="email">
                    </div>
                    <div class="col">
                        <label ><p class="label-gerar">Data de Encerramento</p></label>
                        <input type="date" class="form-control input-gerar" placeholder="Exemplo: 01/01/2022" name="pswd">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label><p class="label-gerar">Descrição da Venda</p></label>
                        <textarea type="text" class="form-control input-gerar" id="email" placeholder="Descrição" name="email" rows="3" style="resize: none"></textarea>
                    </div>

                </div>
            </form>
            <a href="Cadastro.jsp"><button class="btn-gerar">Gerar</button></a>
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