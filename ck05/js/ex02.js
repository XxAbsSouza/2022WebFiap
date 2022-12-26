document.querySelector('#btnMedia').addEventListener('click', function () {
    let resultado = '';
    let disciplinas = document.querySelectorAll('.disciplina')
    disciplinas.forEach(disciplina =>{
        const mediaPriSemestre = Number(disciplina.querySelector('.nota1').textContent);
        const mediaSegSemestre = Number(disciplina.querySelector('.nota2').textContent);
        const media =(mediaPriSemestre+mediaSegSemestre)/2
       disciplina.querySelector('.media').textContent = media.toFixed(1);
       disciplina.querySelector('.media').classList.add('text-center');
       
       if(media < 4){
           resultado = 'Reprovado';
       }
       else if (media < 6) {
           resultado = 'Exame Final';
       }
       else {
           resultado = 'Aprovado';
        }
        disciplina.querySelector('.resultado').textContent= resultado;
        disciplina.querySelector('.resultado').classList.add('text-center');

    })
})