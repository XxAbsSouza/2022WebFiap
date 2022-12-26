// console do browser
console.log('Oi, eu sou o console');
console.log('Você pode verificar qq coisa aqui');

//variáveis NÃO TEM TIPO - JS FAZ TIPAGEM AUTOMÁTICA
// 2 PALAVRAS CHAVE = SÃO 3 MAIS UMA VC VAI ESQUECER

let userName = 'Israel Marques';
let userId = 123456;
let userLogin = true;
let userEmail;
let userPhone = '99999999';
let userHeight = null;

//array
let arr = ['eu', 'tu', 'ele', 123, false, 456, 'oi', 789];

// exibindo variáveis
console.log(userName, userId, userLogin, userPhone);
console.log(userEmail);

// typeof - mostra o tipo atribuído
console.log(userName, typeof userName);
console.log(userId, typeof userId);
console.log(userLogin, typeof(userLogin));
console.log(userPhone, typeof(userPhone));
console.log(userEmail, typeof(userEmail));
console.log(userHeight, typeof(userHeight));

//exibindo o array
console.log(arr);
console.log(typeof arr);


userLogin = 'aaaaaaa';
console.log(userLogin, typeof(userLogin));


const pessoa = {
    nome: 'eu mesmo',
    idade: 51,
    email: 'profisrael.copi@fiap.com.br'
}

console.log(pessoa);
console.log(pessoa.nome);
console.log(pessoa.idade);
console.log(pessoa.email);

pessoa.idade = 30;
console.log(pessoa.idade);

// NÃO USE
var naoUsar = 'Nunca vou usar';
console.log(naoUsar);

var naoUsar = '3123123';
console.log(naoUsar);


for(let i = 0; i<=10; i++) {
    console.log(i);
}

let i = 0;
console.log(i);
i+=200;
console.log(i);

// const DATANASCIMENTO = '02/12/1970';
// console.log(DATANASCIMENTO);
// DATANASCIMENTO = '01/11/1986';




