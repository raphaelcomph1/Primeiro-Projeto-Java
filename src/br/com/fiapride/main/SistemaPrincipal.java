package br.com.fiapride.main;

// Importamos a classe MaquinaDeLavar para que o sistema a reconheça
import br.com.fiapride.model.MaquinaDeLavar;
import br.com.fiapride.model.Motor;
import br.com.fiapride.model.Geladeira;

public class SistemaPrincipal {
	public static void main(String[] args) {
	    // INSTANCIAÇÃO
	    // O comando 'new' aloca memória para um novo objeto.
	    // Criando o primeiro passageiro (Objeto 1)
		Motor motor1 = new Motor("Weg",  1525 , 800 );
		MaquinaDeLavar maquina1 = new MaquinaDeLavar("LG",110, "Aco",  motor1);
		Geladeira geladeira1 = new Geladeira("Electrolux", 110, false);

	
	    // Criando o segundo passageiro (Objeto 2)
		Motor motor2 = new Motor("LG",  1225 , 600 );
	    MaquinaDeLavar maquina2 = new MaquinaDeLavar("Electrolux",220, "Plastico", motor2);
		Geladeira geladeira2 = new Geladeira("Electrolux", 110, true);

	
	    System.out.println("--- Maquinas usadas ---");
	    System.out.println("Maquina1 - Marca: " + maquina1.getMarca() + " | Voltagem: " + maquina1.getVoltagem() );
	    System.out.println("Maquina1 - Marca: " + maquina2.getMarca() + " | Voltagem: " + maquina2.getVoltagem() );
		System.out.println("-------");

		System.out.println("--- Motores usados ---");
		System.out.println("Motor1: " + motor1.getMarcaMotor() + " | Rpm: " + motor1.getRpm());
		System.out.println("Motor2: " + motor2.getMarcaMotor() + " | Rpm: " + motor2.getRpm());
		System.out.println("-------");

		System.out.println("--- Geladeira usadas ---");
		System.out.println("Geladeira1 - Marca: " + geladeira1.getMarca() + " | Geladeira1 - Voltagem: " + geladeira1.getVoltagem()+ " | Geladeira1 - Tem agua na porta?: " + geladeira2.getHasAguaNaPorta());
		System.out.println("Geladeira2 - Marca: " + geladeira2.getMarca() + " | Geladeira2 - Voltagem: " + geladeira2.getVoltagem()+ " | Geladeira2- Tem agua na porta?: " + geladeira2.getHasAguaNaPorta());
		System.out.println("-------");

		System.out.println("--- Início do Teste Simples ---");

		maquina1.adicionarEnergia(1000);
		geladeira1.adicionarEnergia(500);

		maquina1.realizarTarefa(300);
		geladeira1.realizarTarefa(150);
		System.out.println("-------");



	}
	}
