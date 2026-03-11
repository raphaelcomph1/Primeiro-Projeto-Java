# Desafio Prático Parte 2  OBJECT-ORIENTED PROGRAMMING


Neste repositorio está a explicação de forma clara o funcionamento da classe (MaquinaDeLavar), o que o esse objeto representa no mundo real e como usar os métodos.

Neste readme coloquei apenas trechos do codigo, no repositorio voce pode acessar os codigos completos.

<br>

## Projeto Máquina de Lavar🧺
 Este repositório contém a implementação da classe MaquinaDeLavar, desenvolvida como parte do aprendizado de modelagem de objetos em Java. O foco na produção desta atividade foi entender como transformar um objeto do mundo real em código e como gerenciar seu estado através de métodos.

<br>

 ## O que este objeto representa?
 No mundo real, uma Máquina de Lavar é um eletrodoméstico complexo. Para esse sistema, ela foi resumida como um objeto que possui características físicas (peso, voltagem, material, carga) e uma lógica de gerenciamento de energia.

Imagine uma máquina inteligente, onde você define um limite de consumo (Watts) e, a cada lavagem realizada, o sistema desconta a energia utilizada, garantindo que você não ultrapasse sua meta de consumo elétrico.

<br>

## Atributos (Características)
Os atributos definem o estado do objeto. Nesta classe, temos:

- MaterialCorpo: Define a composição externa (ex: Aço Inox, Plástico).
- PesoDaMaquina: O peso físico do aparelho em si.
- Voltagem: Tensão elétrica (110v ou 220v).
- PesoSuportado: A capacidade de carga de roupas (ex: 10kg, 12kg).
- WattsPorHoraDesejado: Atua como um limite de uso de energia para que a máquina possa consumir.

<br>

## Funcionalidades (Métodos)

A classe possui comportamentos específicos para gerenciar o consumo de energia

1 - Adicionar Limite de Consumo
O método adicionarConsumo(int ConsumoWatts) serve para abastecer a máquina com uma cota de energia.

- Regra: Não é permitido adicionar valores negativos.

- Uso Prático: 
```
maquina1.adicionarConsumo(500);
```

2 -  Realizar Lavagem
O método ConsumoDaLavagem(double energiaUtilizada) simula o gasto energético de um ciclo de lavagem.

- Regra: A máquina só inicia a lavagem se a energiaUtilizada for menor ou igual ao saldo de WattsPorHoraDesejado.

- Uso Prático: 
```
maquina1.ConsumoDaLavagem(150.6);
```

## Como Utilizar

Para adicionar sua maquina e escolher seu consumo:
```
MaquinaDeLavar maquina1 = new MaquinaDeLavar("Aço",45.6,110, 6.0, 0); 
	    System.out.println("Aumento do Consumo desejado aumentado");
	    maquina1.adicionarConsumo(1000);
```

Para efetuar a lavagem:
```
maquina1.ConsumoDaLavagem(500);
```
<br>

## Print Astah
![alt text](<astah print.png>)