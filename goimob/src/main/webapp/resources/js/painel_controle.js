class ComponenteTabela {

  constructor(acao, id_objeto_form, nome_evento, id_objeto_tabela) {

    this.acao = acao;
    this.id_objeto_form = id_objeto_form;
    this.nome_evento = nome_evento;
    this.objeto_tabela = document.querySelector('#' + id_objeto_tabela);
    console.log(this.objeto_tabela);
    this.adicionarEscutador(this.id_objeto_form, this.nome_evento, this.funcao_callback);
    
  }

  AtualizarLista(tabela, json){
  
    function obterLista(tabela) {
      return tabela.tBodies[0];
    }
  
    function removeLista(tbody) {
      if (tbody) tbody.remove();
    }
  
    function criarTBody(tabela) {
      return tabela.createTBody();
    }
  
    function insereLinhaNoFimTBody(tbody) {
      return tbody.insertRow(); //isso cria um <tr> em algum tbody, thead ou tfoot e devolve a refêrencia da linha.
    }
  
    function insereCelulaNoFimLinha(linha) {
      return linha.insertCell(); //IMPORTANTE!! isso cria somente um elemento <td> e insere em um elemento <tr>
    }
  
    function adicionaClasse(objetoHtml, nomeClasse) {
      objetoHtml.classList.add(nomeClasse);
    }
  
    function insereTexto(objetoHtml, texto) {
      objetoHtml.innerText = texto;
    }
  
    if (tabela && json) {
      removeLista(obterLista(tabela));
      const novoTBody = criarTBody(tabela);
  
      json.forEach(objeto => {
        const linha_tr = insereLinhaNoFimTBody(novoTBody);
        adicionaClasse(linha_tr, "tr-effect");
  
        Object.keys(objeto).forEach(chave => {
          const celula_td = insereCelulaNoFimLinha(linha_tr);
          insereTexto(celula_td, objeto[chave]);
        });
      });
    }
  };

  obterDados() {

    const myHeaders = new Headers();
    myHeaders.append("Accept", "application/json");

    const requestOptions = {
      method: "GET",
      headers: myHeaders,
      redirect: "follow",
    };

    fetch(`in?action=${this.acao}`, requestOptions)
      .then(response => response.json())
      .then(JsonData => this.AtualizarLista(this.objeto_tabela, JsonData))
      .catch(error => console.log("error", error));
  }


  gravarFormulario(e) {
    e.preventDefault();
    const formdata = new FormData(e.currentTarget);

    const requestOptions = {
      method: "POST",
      body: formdata,
      redirect: "follow",
    };

    fetch("in", requestOptions)
      .then(response => response.json())
      .then(JsonData => {
        console.log(JsonData);
        console.log(this);
        this.obterDados();
      })
      .catch(error => console.log("error", error));
  }

  adicionarEscutador() {
    const objeto = document.querySelector('#' + this.id_objeto_form);
    objeto.addEventListener(this.nome_evento, this.gravarFormulario.bind(this));
  }
}
//this.infoBoxActive.bind(this)

//constructor(acao, id_objeto_form, nome_evento, id_objeto_tabela)
const tabelaGerar = new ComponenteTabela("ListaAnuncioImovel", "form-gerar", "submit", "table-gerar");
tabelaGerar.obterDados();