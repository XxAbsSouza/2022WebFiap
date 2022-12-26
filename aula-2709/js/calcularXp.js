const btnCalcular = document.querySelector('#btnCalcularXP');

btnCalcular.addEventListener('click', function(){
    // pegar as trs com classe heroi
    const herois = document.querySelectorAll('.heroi');
    for(let i = 0; i<herois.length; i++){
        let forca = Number(herois[i].querySelector('.forca').textContent);
        let velocidade = Number(herois[i].querySelector('.velocidade').textContent);
        let agilidade = Number(herois[i].querySelector('.agilidade').textContent)   ;
        let xpFinal = (forca + velocidade + agilidade)/3;
        herois[i].querySelector('.xp').textContent = xpFinal.toFixed(1);

        if(xpFinal <= 70){
            herois[i].classList.add('bg-danger', 'text-light');
            // herois[i].style.backgroundColor = "#900";
            // herois[i].style.color = "#FFF";
        }
    }    
});


// function mensagem(){
//     alert('oiii fui chamado pela função')
// }
// mensagem();

// sortear um número
let numero = parseInt(Math.random()*100);
console.log(numero);

const numeros = [];
    for(let i = 0; i <= 19; i++){
        numeros[i] = parseInt(Math.random()*100);
    }
console.log(numeros);

