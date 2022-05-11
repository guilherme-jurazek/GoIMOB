
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ruluko&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    <style>
        /* ========= INFORMACOES PERFIL ========= */
        .body-painel{
            display: flex;
            padding: 100px;
        }
        
        .div-left{
            max-width: 50%;
            padding-right: 25px;
        }
        .div-right{
            
            padding-left: 25px;
            justify-content: flex-end;

            margin: 0 auto;
        }
        .tittle-usu{
            font-size: 38px;
            margin-bottom: 0;
        }
        
        .cointainer-info-pes{
            display: flex;  
            text-align: left;   
        }
        
        
        .img-perfil{
            border-radius: 20px;
            width: 155px;
            border: 2px solid black;    
            margin-right: 30px;
        }
        .text-usu-info{
            font-size: 22px;
            
        }
        .editar-perfil{
            background-color: #9fa9ff;
            border-radius: 12px;
            border: none;
            margin-top: 20px;
            font-size: 24px;
        }
        .container-princ-info{
            text-align: center;
            
        }
        
        .container-info-dinamic{
 
            text-align: center;
        }
        .functions{
            display: flex;
        }
        .btn-op{
            background-color: transparent;
            border: none;   
            margin-right: 10px;
            border-radius:15px;
            transition: 0.3s;
        }
        .btn-op:hover{  
            background-color: #F0F0F0;
            
        }
        .tittle-table{
            font-weight: 600;
            font-size: 18px
        }
        .table-background-agenda{
            background-color: #F8F8F8;
            border-radius: 20px;
            padding: 10px;
        }
        .table-background-contrato{
            margin-bottom: 10px;
            background-color: #F8F8FF;
            border-radius: 20px;
            padding: 10px;
        }
        /* ====X==== INFORMACOES PERFIL ====X==== */
    </style>
</head>
<body>
    <%-- ==============  HEADER ============== --%>
    <nav class="navbar navbar-expand-md bg-white navbar-light fixed-top">
        <a class="navbar-brand" href="#"><img src="Assets/Logo.png" style="width: 175px; margin-left: 20px"> </a>
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
                <a class="nav-link text-dark nav-text-style" href="#"><img src="Assets/User.png" width="28px"> Usuário</a>
            </li>    
          </ul>
        </div>  
    </nav>
    <%-- =====XXX======  HEADER ======XXX===== --%> 	
    
    <%-- ==============  BODY ============== --%>
    <div class="body-painel">
        
        <div class="div-left">
            <div class="container-princ-info">
                <p class="tittle-usu">Corretor</p>
                <div class="cointainer-info-pes">
                    <img class="img-perfil" src="Assets/Corretor.png">
                    <p class="text-usu-info">
                        Nome: Victor Taveira<br>
                        Telefone: (18) 97884-5564<br>
                        Email: rodrigueseti@outlook.com<br>
                        Cidade: Presidente Prudente<br>
                    </p>
                </div>
                <button class="editar-perfil">Editar Perfil</button>
            </div>
            <div>
                
            </div>
        </div> 
        
        
        <div class="div-right">
            <div class="container-info-dinamic table-background-contrato">
                <div class="functions">
                    <a href="GerarContrato.jsp"><button class="btn-op">Gerar novo Contrato</button></a>
                    <a href=""><button class="btn-op">Filtros</button></a>
                    <a href=""><button class="btn-op">Ordenar </button></a>
                    <div style="text-align: right; margin:0 auto;">
                        <p class="tittle-table">Contratos realizados pelo Corretor</p>
                    </div>
                </div>
                <div>
                    <table class="table">
                        <thead>
                          <tr>
                            <th>Nome Cliente</th>
                            <th>Valor Imóvel</th>
                            <th>Taxa Corretor</th>
                            <th>Em aberto?</th>
                            <th>Data Contrato</th>
                            <th>Tipo Contrato</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr>
                            <td>Cássia</td>
                            <td>R$250.000</td>
                            <td>14%</td>
                            <td>Sim</td>
                            <td>15/01/2012</td>
                            <td>Venda</td>
                          </tr>
                          <tr>
                            <td>Mary</td>
                            <td>R$850.000</td>
                            <td>12%</td>
                            <td>Não</td>
                            <td>15/08/2018</td>
                            <td>Venda</td>
                          </tr>
                          <tr>
                            <td>July</td>
                            <td>R$2.000</td>
                            <td>2%</td>
                            <td>Não</td>
                            <td>12/05/2022</td>
                            <td>Aluguel</td>
                            
                          </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            
            <div class="table-background-agenda">
                <div class="container-info-dinamic">
                <div class="functions">
                    <a href="GerarContrato.jsp"><button class="btn-op">Cadastrar Agendamento</button></a>
                    <a href=""><button class="btn-op">Filtros</button></a>
                    <a href=""><button class="btn-op">Ordenar </button></a>
                    <div style="text-align: right; margin:0 auto;">
                        <p class="tittle-table">Agendamentos do Corretor</p>
                    </div>
                </div>
                <div>
                    <table class="table">
                        <thead>
                          <tr>
                            <th>Nome Cliente</th>
                            <th>Valor Imóvel</th>
                            <th>Taxa Corretor</th>
                            <th>Em aberto?</th>
                            <th>Data Contrato</th>
                            <th>Tipo Contrato</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr>
                            <td>Cássia</td>
                            <td>R$250.000</td>
                            <td>14%</td>
                            <td>Sim</td>
                            <td>15/01/2012</td>
                            <td>Venda</td>
                          </tr>
                          <tr>
                            <td>Mary</td>
                            <td>R$850.000</td>
                            <td>12%</td>
                            <td>Não</td>
                            <td>15/08/2018</td>
                            <td>Venda</td>
                          </tr>
                          <tr>
                            <td>July</td>
                            <td>R$2.000</td>
                            <td>2%</td>
                            <td>Não</td>
                            <td>12/05/2022</td>
                            <td>Aluguel</td>
                            
                          </tr>
                        </tbody>
                    </table>
                </div>
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