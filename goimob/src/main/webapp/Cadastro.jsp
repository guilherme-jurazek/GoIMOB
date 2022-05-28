<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <%-- <meta charset="UTF-8"> --%>
    <%-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ruluko&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/style.css">
    <style>
        /* ========= FORMULARIO REGISTRO ========= */
        .check-terms{
            color: white;
        }
        .terms{
            color: #959FFF;
        }
        .terms:hover{
            cursor: pointer;
            text-decoration: none;
            color: #95FFFF;
        }
        .input-form-cadastro{
            margin-top: 0;
            margin-bottom: 10px;
            width: 240px;
            font-size: 18px;
            background-color: #D4EFF2;
            border: none;
            color: #000;
            padding: 3px;
            padding-left: 8px;
            padding-right: 8px;
        }
        .input-option{
            height: 32px;
        }
        .input-form-cadastro:focus{
            outline: none;
        }
        .submit-form{
            margin-top: 30px;
        }
        .containter-reg{
            background-color: #0C2A57;
            height: 605px;
            width: 600px;
            opacity: 0.77;
            border-radius: 45px;
            text-align: center;
            margin: 0 auto;
            padding-top: 50px
        }
        /* ====X==== FORMULARIO REGISTRO ====X==== */
    </style>
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
        <div class="containter-reg">
            <div>
                <h1 class="tittle-login">Registro</h1>
            </div>
            <form class="form-gerar" action="in" method="post">
                <div class="row">
                    <div class="col">
                        <label for="nameCad"><p class="text-form">Nome e Sobrenome</p></label>
                        <input class="input-form-cadastro" type="text" placeholder="João Batista" name="pes_nome" id="nameCad">
                    </div>
                    <div class="col">
                        <label for="cepCad"><p class="text-form">Cep</p></label>
                        <input class="input-form-cadastro" type="text" placeholder="00000-000" name="pes_cep" id="cepCad">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="emailCad"><p class="text-form">E-mail</p></label>
                        <input class="input-form-cadastro" type="text" placeholder="example@example.com" name="usu_email" id="emailCad">
                    </div>
                    <div class="col">
                        <label for="foneCad"><p class="text-form">Número Residencial</p></label>
                        <input class="input-form-cadastro" type="text" placeholder="Exemplo: 25" name="pes_num_residencia" id="foneCad">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="senhaCad"><p class="text-form">Senha</p></label>
                        <input class="input-form-cadastro" type="password" placeholder="1234Abc" name="usu_senha" id="senhaCad">
                    </div>
                    <div class="col">
                        <label for="cpfCad"><p class="text-form">CPF</p></label>
                        <input  class="input-form-cadastro" type="text" placeholder="Exemplo: 000.000.000-00" name="pes_fis_cpf" id="cpfCad">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="confirmasenhaCad"><p class="text-form">Confirmar Senha</p></label>
                        <input class="input-form-cadastro" type="password" placeholder="1234Abc" name="" id="confirmasenhaCad">
                    </div>
                    <div class="col">
                        <label for="sexoCad"><p class="text-form">Sexo</p></label>
                        <select class="input-form-cadastro input-option" id="exampleFormControlSelect1" name="pes_fis_sexo" id="sexoCad">
                            <option value="V">Vazio</option >
                            <option value="M">Masculino</option>
                            <option value="F">Feminino</option>
                            <option value="X">Prefiro não dizer</option>
                        </select>
                    </div>
                </div>
                <div class="row submit-form">
                    <div class="col">
                        <label class="form-check-label check-terms" for="termoCad">
                            <input type="checkbox" class="form-check-input" name="optradio" id="termoCad">Aceito os <a class="terms">Termos e Condições</a>
                        </label>
                    </div>
                    <div class="col">
                        <input type="submit" class="btn-gerar" value="Cadastrar">
                    </div>
                </div>
                 <input type="hidden" name="action" value="Pessoa">
            </form>
            
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