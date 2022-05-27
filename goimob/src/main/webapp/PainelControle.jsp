<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="pt-BR">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <%-- <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script> --%>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <%-- <meta charset="UTF-8"> --%>
    <%-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Painel de Controle</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ruluko&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/style.css">
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
        <a class="navbar-brand" href="index.jsp"><img src="resources/images/Logo.png" style="width: 175px; margin-left: 20px"> </a>
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
                <a class="nav-link text-dark nav-text-style" href="#"><img src="resources/images/User.png" width="28px"> Usuário</a>
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
                    <img class="img-perfil" src="resources/images/Corretor.png">
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
                <div class="container-info-dinamic table-background-imoveis">
                    <div class="functions">
                        <a><button class="btn-op"  data-toggle="modal" data-target="#myModal">Cadastrar novo Anúncio</button></a>
                        <a href=""><button class="btn-op">Filtros</button></a>
                        <a href=""><button class="btn-op">Ordenar </button></a>
                        <div style="text-align: right; margin:0 auto;">
                            <p class="tittle-table">Imóveis anunciados pelo corretor</p>
                        </div>
                    </div>

                    <div>
                        <table id="table-gerar" class="table">
                            <thead>
                              <tr>
                                <th>Proprietário</th>
                                <th>Bairro</th>
                                <th>Cidade</th>
                                <th>Valor</th>
                                <th>Tipo Imóvel</th>
                                <th>Status</th>
                              </tr>
                            </thead>
                                <%-- <tbody id="anun_body">
                                    <tr class="tr-effect">
                                        <td>item.proprietario</td>
                                        <td>item.bairr</td>
                                        <td>${item.cidade}</td>
                                        <td>${item.valor}</td>
                                        <td>${item.tipoImovel}</td>
                                        <td>${item.status}</td>
                                    </tr>
                                </tbody> --%>
                        </table>
                    </div>
                </div>
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
                          <tr class="tr-effect">
                            <td>Cássia</td>
                            <td>R$250.000</td>
                            <td>14%</td>
                            <td>Sim</td>
                            <td>15/01/2012</td>
                            <td>Venda</td>
                          </tr>
                          <tr class="tr-effect">
                            <td>Mary</td>
                            <td>R$850.000</td>
                            <td>12%</td>
                            <td>Não</td>
                            <td>15/08/2018</td>
                            <td>Venda</td>
                          </tr>
                          <tr class="tr-effect">
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
                            <tr class="tr-effect">
                                
                                <td>Cássia</td>
                                <td>R$250.000</td>
                                <td>14%</td>
                                <td>Sim</td>
                                <td>15/01/2012</td>
                                <td>Venda</td>
                                
                            </tr>
                          <tr class="tr-effect">
                            <td>Mary</td>
                            <td>R$850.000</td>
                            <td>12%</td>
                            <td>Não</td>
                            <td>15/08/2018</td>
                            <td>Venda</td>
                          </tr>
                          <tr class="tr-effect">
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



    <%-- ===============  MODAL ============== --%>
    <div class="modal" id="myModal">
        <div class="modal-dialog">
          <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
              <h4 class="modal-title">Cadastrar Anúncio do Imóvel</h4>
              <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- Modal body -->
            <div class="modal-body">
              <form id="form-gerar" class="form-gerar" action="in" method="post">
              <div class="row">
                  <div class="col">
                      <label for="nameCad"><p class="text-tipo-dado">Nome Proprietario</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="João Almeida" name="imov_proprietario" id="imov_proprietario" pattern="[a-zA-Z]{1,50}" required>
                  </div>
                  <div class="col">
                      <label for="cepCad"><p class="text-tipo-dado">Cep do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="00000-000" name="imov_cep" id="imov_cep" pattern="[0-9]{1,9}" required>
                  </div>
              </div>
               <div class="row">
                  <div class="col">
                      <label for="nameCad"><p class="text-tipo-dado">Rua do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="Rua Jacarezinhos" name="imov_rua" id="imov_rua" pattern="[a-zA-Z]{1,50}" required>
                  </div>
                  <div class="col">
                      <label for="cepCad"><p class="text-tipo-dado">Bairro do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="Bairro Bongiovanni" name="imov_bairro" id="imov_bairro" pattern="[a-zA-Z]{1,25}" required>
                  </div>
              </div>
               <div class="row">
                  <div class="col">
                      <label for="nameCad"><p class="text-tipo-dado">Número do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="17" name="imov_numero" id="imov_numero" pattern="[0-9]{1,9}" required>
                  </div>
                  <div class="col">
                      <label for="cepCad"><p class="text-tipo-dado">Cidade do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="Presidente Prudente" name="imov_cidade" id="imov_cidade" pattern="[a-zA-Z]{1,50}" required>
                  </div>
              </div>
              <div class="row">
                  <div class="col">
                      <label for="emailCad"><p class="text-tipo-dado">Estado do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="SP" name="imov_uf" id="imov_uf" pattern="[A-Z]{1,3}" required> 
                  </div>
                  <div class="col">
                      <label for="foneCad"><p class="text-tipo-dado">Valor do Imóvel</p></label>
                      <input class="input-form-cadastro" type="text" placeholder="500.000" name="imov_valor" id="imov_valor" pattern="[0-9]{1,10}" required>
                  </div>
              </div>
              <div class="row">
                  <div class="col">
                      <label for="foneCad"><p class="text-tipo-dado">Descrição do Imóvel</p></label>
                      <textarea class="input-form-cadastro form-control" type="text" placeholder="Imóvel localizado próximo ao centro com 12 banheiros." name="anun_desc" id="anun_desc" required></textarea>
                  </div>
              </div>
              <div class="row">
                  <div class="col">
                      <label for="sexoCad"><p class="text-tipo-dado">Tipo de Anúncio</p></label>
                      <select class="input-form-cadastro input-option" id="anun_tipo" name="anun_tipo" required>
                          <option value="V" selected>Venda</option>
                          <option value="A">Aluguel</option>
                      </select>
                  </div>
                  <div class="col">
                      <input type="submit" class="btn-edit-dados">
                  </div>
              </div>
                <input type="hidden" name="action" value="Imovel">
          </form>

            </div>

            <!-- Modal footer -->
            <div class="modal-footer">
              <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>

          </div>
        </div>
    </div>
    <script src="resources/js/painel_controle.js"></script>
    <%-- =====XXX======  MODAL =====XXX====== --%>
</body>
</html> 