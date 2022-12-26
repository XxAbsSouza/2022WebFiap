const dias = document.querySelectorAll('.dia-mes');
document.querySelector('#dados').addEventListener('click', () => {
    for(let i=0; i<dias.length; i++){
        const dia  = Number(dias[i].textContent);

        if (dias[i].textContent.length === 0) {
            dias[i].classList.add('bg-dark');
        }
         else if (dias[i].textContent % 2 === 0 && dias[i].textContent.length > 0) {
            dias[i].classList.add('bg-light');
        }
        else if (dias[i].textContent % 2 === 1 && dias[i].textContent.length > 0) {
            dias[i].classList.add('bg-warning');
        }
        // Esse if vai verificar quem é feriado, pois quando muda ele deve receber o dia original, não tendo esse fica aparecendo a palavra Feriado
        if (dias[i].textContent === 'FERIADO') {
            let diaAnterior = Number(dias[i - 1].textContent);
            dias[i].textContent = diaAnterior + 1;
        }
    }

    // parte 2
    let numero = Math.floor(Math.random() * 32);
    while (numero === 0) {
        numero = Math.floor(Math.random() * 32);
    }
        
        for(let i = 0; i<dias.length; i++) {
            if (dias[i].textContent == numero) {
                dias[i].textContent = 'FERIADO';
                dias[i].classList.add('lead');
            }
        };

    //parte 3 todos os dias quarta-feira
    for (let i = 3; i <= dias.length; i += 7) {
        console.log(dias[i].textContent);
    }
})