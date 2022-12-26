// pegar o tbody no html
const tbody = document.querySelector('tbody');

//pegando o form e passando um escutador de eventos
document.querySelector('form').addEventListener('submit', function(e){
    // cancelar o evento
    e.preventDefault();
    
    //pegar os campos do formulário
    const campos = [
        document.querySelector('#usuario'),
        document.querySelector('#email'),
        document.querySelector('#dataCadastro'),
        document.querySelector('#tipoConta')
    ];
    
    // criando uma tr para que ela receba os campos
    const tr = document.createElement('tr');
    
    // criar um for para percorrer o Array e 
    // para cada índice criar uma td
    
    campos.forEach(e => {
        
        // criar uma td 
        const td = document.createElement('td');

        //atribuir o valor digitado na td
        td.textContent = e.value;

        //vincular a td na tr
        tr.appendChild(td);
    });
    
    // inserir a tr no tbody
    tbody.appendChild(tr);

    //limpar o formulário
    this.reset();    
})