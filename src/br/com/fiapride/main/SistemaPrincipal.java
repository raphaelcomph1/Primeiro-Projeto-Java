package br.com.fiapride.main;

// Importamos a classe MaquinaDeLavar para que o sistema a reconheça
import br.com.fiapride.model.MaquinaDeLavar;

public class SistemaPrincipal {
	public static void main(String[] args) {
	    // INSTANCIAÇÃO
	    // O comando 'new' aloca memória para um novo objeto.
	    // Criando o primeiro passageiro (Objeto 1)
		MaquinaDeLavar maquina1 = new MaquinaDeLavar("Aço", 110.0, 110, 10.5, 0);	    System.out.println("Aumento do Consumo desejado aumentado");
	    maquina1.adicionarConsumo(1000);
	
	    // Criando o segundo passageiro (Objeto 2)
		MaquinaDeLavar maquina2 = new MaquinaDeLavar("Plastico", 80.0, 220, 8.0, 0);	    System.out.println("Aumento do Consumo desejado aumentado");
	    maquina2.adicionarConsumo(4000);
	
	    System.out.println("--- Sistema FiapRide ---");
	    System.out.println("Maquina1: " + maquina1.getMaterialCorpo() + " | Voltagem: " + maquina1.getVoltagem() + " | Energia desejada: " + maquina1.getWattsPorHoraDesejado());
	    System.out.println("Maquina1: " + maquina2.getMaterialCorpo() + " | Voltagem: " + maquina2.getVoltagem() + " | Energia desejada: " + maquina2.getWattsPorHoraDesejado());
	    
	    System.out.println("A lavagem foi realizada");
	    maquina1.consumoDaLavagem(500);
	    System.out.println("A lavagem foi realizada");
	    maquina2.consumoDaLavagem(1500);
	
	}
	}
