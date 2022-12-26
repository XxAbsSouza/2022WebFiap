//sortear um número entre 0 e 1
let numeroSorteado = Math.round(Math.random()*100);
console.log(`Número = ${numeroSorteado}`);

// operadores aritméticos
console.log(`${numeroSorteado} + 10 =  ${numeroSorteado+10}`);
console.log(`${numeroSorteado} - 10 =  ${numeroSorteado-10}`);
console.log(`${numeroSorteado} * 10 =  ${numeroSorteado*10}`);
console.log(`${numeroSorteado} + 10 =  ${numeroSorteado+10}`);
console.log(`${numeroSorteado} / 10 =  ${numeroSorteado/10}`);
console.log(`${numeroSorteado} % 10 =  ${numeroSorteado%10}`);
console.log(`${numeroSorteado} ** 3 =  ${numeroSorteado**3}`);
console.log(`-----------------------`);

//relacionais
console.log(`${numeroSorteado} > 10 =  ${numeroSorteado>10}`);
console.log(`${numeroSorteado} < 10 =  ${numeroSorteado<10}`);
console.log(`${numeroSorteado} >= 10 =  ${numeroSorteado>=10}`);
console.log(`${numeroSorteado} <= 10 =  ${numeroSorteado<=10}`);
console.log(`${numeroSorteado} == 10 =  ${numeroSorteado==10}`);
console.log(`${numeroSorteado} != 10 =  ${numeroSorteado!=10}`);

let a = 10;
let b = '10';
console.log(`${a} === ${b} =  ${a===b}`);

// lógicos
// E = &&
// OU = ||
// Não = !

b = 20;
console.log(`${a>b || b>10}`);
console.log(`${a>b && b>10}`);
console.log(`${!(a>b && b>10)}`);

console.log(`${a} - ${b}`);

// unitários
a++;
b--;
console.log(`${a} - ${b}`);

// atribuição
a+=20;
b-=30
console.log(`${a} - ${b}`);

//pegando o id
const getId = document.getElementById('numero');
getId.innerHTML = numeroSorteado;
console.log(getId);