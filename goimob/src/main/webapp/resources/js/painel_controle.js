const form_gerar = document.querySelector("#form-gerar");
let obj_json;
form_gerar.addEventListener("submit", e => {
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
      obterDados(AtualizarLista);
    })
    .catch(error => console.log("error", error));
});

const AtualizarLista = json => {
  
  function obterLista() {
    return table_gerar.tBodies[0];
  }

  function removeLista(tbody) {
    if (tbody) tbody.remove();
  }

  function criarTBody() {
    return table_gerar.createTBody();
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

  const table_gerar = document.querySelector("#table-gerar");
  if (table_gerar && json) {
    testJson = json;
    removeLista(obterLista());
    const novoTBody = criarTBody();

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

const obterDados = func => {

  const myHeaders = new Headers();
  myHeaders.append("Accept", "application/json");

  const requestOptions = {
    method: "GET",
    headers: myHeaders,
    redirect: "follow",
  };

  fetch("in?action=ListaAnuncioImovel", requestOptions)
    .then(response => response.json())
    .then(JsonData => func(JsonData))
    .catch(error => error);
};

obterDados(AtualizarLista);
