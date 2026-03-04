package br.com.fiapride.model;

public class MaquinaDeLavar {
    // Atributos (Características)
    public String MaterialCorpo;
    public double PesoDaMaquina;
    public int Voltagem;
    public double PesoSuportado;
    public int WattsPorHoraDesejado;
    // Nota: Por enquanto usamos 'public' para facilitar o aprendizado.
    // Nas próximas aulas, aprenderemos a proteger esses dados.
    public MaquinaDeLavar(String MaterialCorpo, double PesoDaMaquina, int Voltagem, double PesoSuportado, int WattsPorHoraDesejado) {
        this.MaterialCorpo = MaterialCorpo;
        this.PesoDaMaquina = PesoDaMaquina ; // Novo Atributo
        this.Voltagem = Voltagem ;
        this.PesoSuportado = PesoSuportado;
        this.WattsPorHoraDesejado = 0;
    }

	public void adicionarConsumo(int ConsumoWatts) {
	    // Regra de negócio: O valor da recarga deve ser positivo
	    if (ConsumoWatts <= 0) {
	        System.out.println("Erro: O valor de recarga deve ser maior que zero.");
	        return;
	    }
	    this.WattsPorHoraDesejado += ConsumoWatts;
	    System.out.println("Seu limite de Watts por hora foi definido em: " + this.WattsPorHoraDesejado);
	}
	
	public void ConsumoDaPassagem(double energiaUtilizada) {
	    // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
	    if (energiaUtilizada <= 0) {
	        System.out.println("Erro: O custo da viagem é inválido.");
	        return;
	    }
	    if (this.WattsPorHoraDesejado < energiaUtilizada) {
	        System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
	        return;
	    }
	    this.WattsPorHoraDesejado -= energiaUtilizada;
	    System.out.println("Lavagem Realizada, sua maquina pode gastar mais: " + this.WattsPorHoraDesejado + "Watts");
	}
}