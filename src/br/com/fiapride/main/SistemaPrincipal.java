package br.com.fiapride.main;

// Importamos a classe MaquinaDeLavar para que o sistema a reconheça
import br.com.fiapride.model.MaquinaDeLavar;

public class SistemaPrincipal {
	public static void main(String[] args) {
	    // INSTANCIAÇÃO
	    // O comando 'new' aloca memória para um novo objeto.
	    // Criando o primeiro passageiro (Objeto 1)
		MaquinaDeLavar maquina1 = new MaquinaDeLavar("Aço",45.6,110, 6.0, 0); 
	    System.out.println("Aumento do Consumo desejado aumentado");
	    maquina1.adicionarConsumo(1000);
	
	    // Criando o segundo passageiro (Objeto 2)
	    MaquinaDeLavar maquina2 = new MaquinaDeLavar("Plastico",56.6,220, 10.2, 0); 
	    System.out.println("Aumento do Consumo desejado aumentado");
	    maquina2.adicionarConsumo(2000);
	
	    System.out.println("--- Sistema FiapRide ---");
	    System.out.println("Maquina1: " + maquina1.MaterialCorpo + " | Voltagem: " + maquina1.Voltagem + " | Energia desejada: " + maquina1.WattsPorHoraDesejado);
	    System.out.println("Maquina1: " + maquina2.MaterialCorpo + " | Voltagem: " + maquina2.Voltagem + " | Energia desejada: " + maquina2.WattsPorHoraDesejado);
	    
	    System.out.println("A lavagem foi realizada");
	    maquina1.ConsumoDaLavagem(500);
	    System.out.println("A lavagem foi realizada");
	    maquina2.ConsumoDaLavagem(1500);
	
	}
	}
