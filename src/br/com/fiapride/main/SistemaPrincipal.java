package br.com.fiapride.main;

// Importamos a classe MaquinaDeLavar para que o sistema a reconheça
import br.com.fiapride.model.MaquinaDeLavar;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando a primeira maquina e seguindo com novos exemplos (Objeto 1)
        MaquinaDeLavar maquina1 = new MaquinaDeLavar();
        maquina1.MaterialCorpo = "Aço";
        maquina1.Voltagem = 110;
        maquina1.PesoDaMaquina = 45.6;

        MaquinaDeLavar maquina2 = new MaquinaDeLavar();
        maquina2.MaterialCorpo = "Plastico";
        maquina2.Voltagem = 220;
        maquina2.PesoDaMaquina = 60.5;

        MaquinaDeLavar maquina3 = new MaquinaDeLavar();
        maquina3.MaterialCorpo = "Inox";
        maquina3.Voltagem = 110;
        maquina3.PesoDaMaquina = 55.2;



        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Material da Maquina: " + maquina1.MaterialCorpo + " | Voltagem da Maquina: " + maquina1.Voltagem + "V | Peso da Maquina: " + maquina1.PesoDaMaquina);
        System.out.println("Material da Maquina: " + maquina2.MaterialCorpo + " | Voltagem da Maquina: " + maquina2.Voltagem + "V | Peso da Maquina: " + maquina2.PesoDaMaquina);
        System.out.println("Material da Maquina: " + maquina3.MaterialCorpo + " | Voltagem da Maquina: " + maquina3.Voltagem + "V | Peso da Maquina: " + maquina3.PesoDaMaquina);
        // Oq falta para evoluir esse codigo?
        // Uma identificacao de qm e dono de cada maquina talvez 
    }
}