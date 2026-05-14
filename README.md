# Projeto FiapRide - Raphael Mischiatti de Souza

# 📊 Informações do aluno 

- **Nome:** Raphael Mischiatti de Souza 
- **RM:** 563567
- **Turma:** 2CCPO
- **Curso:** Ciências da computação
- **GitHub:** https://github.com/raphaelcomph1

---

## Descrição do Projeto
Este projeto é o resultado do aprendizado nas aulas 1-9 de Progra
mação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).
---
## Checklist de Implementação
- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces
---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`?  Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"

**Resposta:**
Usar variáveis soltas até funciona para um teste rápido, mas no mundo real isso perde o controle. A classe Passageiro funciona como um molde: você define ali tudo o que um passageiro tem e faz. Assim, quando você precisa de um novo usuário, basta instanciar(criar) um objeto a partir desse molde.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo+ 100` diretamente no código principal, porque dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Resposta:**
Fazer a alteração direta parece mais facil, mas é perigoso porque você perde o controle sobre as regras do negócio. O método adicionarSaldo funciona como segurança da variável, ele pode verificar se o valor é positivo ou se o cartão é válido antes de completar a operação.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?

**Resposta:**
A diferença está no controle. Quando o atributo é private, ele está guardado em um cofre. O método get público funciona como uma cópia autenticada desse dado: quem pede a informação consegue ler o valor, mas não tem o poder de altera-lo ou estraga-lo.

---

### Aula 4 - Construtores

**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

**Resposta:**
O objetivo aqui é garantir a imutabilidade e a segurança dos dados. O modelo de um veículo (como um Celta ou uma Brastemp) não muda depois que ele sai da fábrica; por isso, passamos essa informação apenas no Construtor e não criamos um setModelo(). Isso evita que alguém mude o modelo do objeto por erro no meio do código.

---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?_

**Resposta:**
Pedir apenas a String do nome pode parecer mais leve no começo, mas acaba com a inteligência do sistema. Se a classe Viagem guardar apenas um texto com o nome "Ana Silva", ela perde o contato com a pessoa real. Na hora de encerrar a viagem, o sistema saberia quem viajou, mas não teria como acessar a conta bancária dessa pessoa para fazer a cobrança.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Resposta:**
O Java bloqueia o acesso direto porque, mesmo sendo "mãe e filha", elas ainda são classes diferentes. Se o Carro pudesse mexer direto na placa que está na classe Veiculo, ele poderia ignorar as regras de segurança que você criou lá atrás. O uso do super() no construtor ou dos métodos set garante que a criação e a alteração do dado passem pelo funil de validação da classe mãe.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Resposta:**
Não, você não conseguiria. O Java é muito rigoroso com o tipo da variável que você está usando no loop. Se a sua lista é de Veiculo, o compilador só deixa você chamar o que o Veiculo conhece. Mesmo que você saiba que ali dentro tem um Carro, se a "mãe" não assinou o contrato dizendo que sabe calcularAutonomia(), o Java bloqueia o chamado para evitar erros.

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho? 

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Resposta:**
O Java não deduz isso sozinho porque, por padrão, ele entende que toda classe pode ser usada para criar objetos. Precisamos usar o abstract para colocar uma "trava de segurança" no código, avisando que aquela classe é apenas uma ideia ou um molde, e não algo que deva existir de verdade no sistema.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`? 

Como as interfaces resolvem esse problema?

**Resposta:**
O Java proíbe a herança múltipla para evitar confusão. Se um CarroEletrico herdasse de duas mães e ambas tivessem o método ligar(), o Java não saberia qual deles executar. Isso causaria um erro de ambiguidade que travaria o sistema.

--- 
## Desafios Técnicos Implementados

### Desafio Pessoal (Meu projeto)

*Qual foi o domínio que você escolheu para seu projeto pessoal?*

**Resposta:**
Sistema de Gestão de Eletrodomésticos e Integração de Dispositivos Inteligentes.

*Quais classes você criou?*

**Resposta:**
 Eletrodomestico (Abstrata), MaquinaDeLavar, Geladeira, Motor, e a Interface Notificavel.

*Qual foi o maior desafio técnico que você enfrentou?*

***Resposta:***
 O maior desafio foi implementar a Abstração combinada com a Associação. No início, era difícil entender por que eu não podia simplesmente criar um "Eletrodoméstico" comum, mas ao tornar a classe abstrata, percebi que isso forçava o código a ser mais específico e seguro. Além disso, conectar a classe MaquinaDeLavar com a classe Motor (Associação) exigiu atenção redobrada no construtor para garantir que nenhum eletrodoméstico funcionasse sem um motor válido. Resolvi isso estruturando bem a hierarquia de herança e usando o @Override para garantir que cada aparelho realizasse sua tarefa específica, mantendo a organização através do encapsulamento com atributos privados.

## Conclusão

*O que você aprendeu nestas 9 aulas?*

***Resposta:***
Aprendi que programar em Java vai muito além de escrever código que "funciona". A jornada passou por entender como proteger dados com Encapsulamento, como reutilizar lógica com Herança e como criar sistemas flexíveis usando Polimorfismo e Interfaces. Entendi que uma boa arquitetura de software facilita a manutenção e permite que o sistema cresça sem virar um caos, tratando objetos diferentes de forma padronizada.

*Qual conceito foi mais difícil de entender?*

***Resposta:***
O conceito de Polimorfismo de Interface foi o mais desafiador. No começo, parecia estranho tratar um Carro e uma MaquinaDeLavar como a mesma coisa (um Notificavel). Superei essa dificuldade ao colocar o código para rodar no main e ver que, com um único comando, eu conseguia disparar alertas para objetos de famílias totalmente diferentes. Ali percebi o poder de focar no "que o objeto faz" em vez de apenas no "que o objeto é".

*O que você melhoraria no seu projeto se pudesse refazer?*

***Resposta:***
Eu implementaria uma Coleção dinâmica (como um ArrayList) no lugar de arrays fixos para gerenciar os dispositivos. Também adicionaria Tratamento de Exceções (Try-Catch) para lidar com erros, como por exemplo, impedir que o sistema aceite uma potência de motor negativa ou uma voltagem inválida, deixando o sistema ainda mais robusto e próximo de uma aplicação real de mercado.