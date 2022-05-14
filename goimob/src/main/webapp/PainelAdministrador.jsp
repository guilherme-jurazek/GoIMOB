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
        
        .editar-perfil:hover{
            background-color: #7f99Df;
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
        .table-background-imoveis{
            margin-top: 20px;
            background-color: #F8FFF8;
            border-radius: 20px;
            padding: 10px;
        }

        .tr-effect{
            transition: 0.5s;
            border-radius: 3px;
        }
        .tr-effect:hover{
            cursor: pointer;
            box-shadow: 4px 2px 15px 1px black;
            border-collapse: collapse;
        }
        .table-usuarios{
            margin: 0 auto;
        }
        .text-tipo-dado{
            color: black;
            font-size: 20px;
            margin-top: 10px;
            margin-bottom: 0;
        }
        .btn-edit-dados{
            background-color: #85dD66;
            border: none;
            border-radius: 10px;
            font-size: 20px;
            margin-top: 40px;
        }
        .btn-edit-dados:hover{
            background-color: #85ED66;
        }
        /* ====X==== INFORMACOES PERFIL ====X==== */
    </style>
</head>
<body>
    <%-- ==============  HEADER ============== --%>
    <nav class="navbar navbar-expand-md bg-white navbar-light fixed-top">
        <a class="navbar-brand" href="index.jsp"><img src="Assets/Logo.png" style="width: 175px; margin-left: 20px"> </a>
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
        <div class="table-usuarios">
            <div class="container-info-dinamic table-background-contrato">
                <div class="functions">
                    <a href="GerarContrato.jsp"><button class="btn-op">Gerenciar Usuários</button></a>
                    <a href=""><button class="btn-op">Filtros</button></a>
                    <a href=""><button class="btn-op">Ordenar </button></a>
                    <div style="text-align: right; margin:0 auto;">
                        <p class="tittle-table">Gerenciar Usuários Cadastrados</p>
                    </div>
                </div>
                <div>
                    <table class="table">
                        <thead>
                          <tr>
                            <th>Nome Usuário</th>
                            <th>E-mail</th>
                            <th>CPF</th>
                            <th>Nível de Acesso</th>
                            <th>Ativo</th>
                          </tr>
                        </thead>
                        <tbody>
                           <tr class="tr-effect" data-toggle="modal" data-target="#myModal">
                            <td>admin</td>
                            <td>admin@goimob.com</td>
                            <td>889.487.546-135</td>
                            <td>Administrador</td>
                            <td>Sim</td>
                          </tr>
                          <tr class="tr-effect" data-toggle="modal" data-target="#myModal">
                            <td>Cássia</td>
                            <td>cassia@gmail.com</td>
                            <td>484.472.458-99</td>
                            <td>Operador</td>
                            <td>Sim</td>
                          </tr>
                          <tr class="tr-effect" data-toggle="modal" data-target="#myModal">
                            <td>Mary</td>
                            <td>R$850.000</td>
                            <td>659.871.452-66</td>
                            <td>Operador</td>
                            <td>Não</td>
                          </tr>
                          <tr class="tr-effect" data-toggle="modal" data-target="#myModal">
                            <td>July</td>
                            <td>R$2.000</td>
                            <td>326.498.755-44</td>
                            <td>Operador</td>
                            <td>Não</td>
                          </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        
        
                <!-- The Modal -->
        <div class="modal" id="myModal">
          <div class="modal-dialog">
            <div class="modal-content">

              <!-- Modal Header -->
              <div class="modal-header">
                <h4 class="modal-title">Cássia Perego</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
              </div>

              <!-- Modal body -->
              <div class="modal-body">
                <form class="form-gerar" action="in" method="post">
                <div class="row">
                    <div class="col">
                        <label for="nameCad"><p class="text-tipo-dado">Nome e Sobrenome</p></label>
                        <input class="input-form-cadastro" type="text" value="Cássia Perego Alves" name="name" id="nameCad" required disabled>
                    </div>
                    <div class="col">
                        <label for="cepCad"><p class="text-tipo-dado">Cep</p></label>
                        <input class="input-form-cadastro" type="text" value="18445-846" name="cep" id="cepCad" required disabled>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="emailCad"><p class="text-tipo-dado">E-mail</p></label>
                        <input class="input-form-cadastro" type="text" value="cassia@gmail.com" name="email" id="emailCad" required disabled> 
                    </div>
                    <div class="col">
                        <label for="foneCad"><p class="text-tipo-dado">Número Residencial</p></label>
                        <input class="input-form-cadastro" type="text" value="25" name="nresidencia" id="foneCad" required disabled>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="sexoCad"><p class="text-tipo-dado">Sexo</p></label>
                        <select class="input-form-cadastro input-option" id="exampleFormControlSelect1" id="sexoCad" required disabled>
                            <option>Vázio</option>
                            <option>Homem</option>
                            <option selected>Mulher</option>
                            <option>Prefiro não dizer</option>
                        </select>
                    </div>
                    <div class="col">
                        <label for="cpfCad"><p class="text-tipo-dado">CPF</p></label>
                        <input  class="input-form-cadastro" type="text" value="668.978.456-55" name="cpf" id="cpfCad" required disabled>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="sexoCad"><p class="text-tipo-dado">Nivel Acesso</p></label>
                        <select class="input-form-cadastro input-option" id="exampleFormControlSelect1" id="sexoCad" required>
                            <option selected>Operador</option>
                            <option>Administrador</option>
                        </select>
                    </div>
                    <div class="col">
                        <input type="submit" value="Editar" class="btn-edit-dados"></input>
                    </div>
                </div>
                 <input type="hidden" name="action" value="Usuario">
            </form>

              </div>

              <!-- Modal footer -->
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
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