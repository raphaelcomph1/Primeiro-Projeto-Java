package br.com.fiapride.model;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    // 1. ADICIONAR ESTE ATRIBUTO (para o Carro e Moto pararem de dar erro)
    private double nivelCombustivel = 50.0; // Exemplo: começa com 50 litros/carga

    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
    }

    //add essas duas funcoes pro codigo funfar!
    public abstract String calcularAutonomia();
    public double getNivelCombustivel() {
        return this.nivelCombustivel;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public abstract void exibirTipo();

    private void setPlaca(String placa) {
        if (placa != null && placa.length() >= 7) {
            this.placa = placa;
        }
    }
}