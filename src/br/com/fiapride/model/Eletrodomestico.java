package br.com.fiapride.model;

public abstract class Eletrodomestico {
    private String marca;
    private int voltagem;
    private double wattsDisponiveis;


    public Eletrodomestico(String marca, int voltagem) {
        this.setMarca(marca);
        this.setVoltagem(voltagem);
        this.wattsDisponiveis = 0;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    private void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public abstract void realizarTarefa(double energia);

    public void adicionarEnergia(int watts) {
        if (watts > 0) {
            this.wattsDisponiveis += watts;
            System.out.println("Energia adicionada! Saldo: " + this.wattsDisponiveis);
        }
    }

    public double getWattsDisponiveis() {
        return wattsDisponiveis;
    }

    public void setWattsDisponiveis(double wattsDisponiveis) {
        this.wattsDisponiveis = wattsDisponiveis;
    }
}

