package br.com.fiapride.model;

public class MaquinaDeLavar {

    private String materialCorpo;
    private double pesoDaMaquina;
    private int voltagem;
    private double pesoSuportado;
    private int wattsPorHoraDesejado;

    public MaquinaDeLavar(String materialCorpo, double pesoDaMaquina, int voltagem, double pesoSuportado, int valor) {
        this.setMaterialCorpo(materialCorpo) ;
        //this.setPesoDaMaquina(pesoDaMaquina);
        this.setVoltagem(voltagem);
        //this.setPesoSuportado(pesoSuportado);
        this.setWattsPorHoraDesejado(valor); 
    }

    public void adicionarConsumo(int consumoWatts) {
        if (consumoWatts <= 0) {
            System.out.println("Erro: A quantidade de energia desejada é inválida.");
            return;
        }
        this.wattsPorHoraDesejado += consumoWatts;
        System.out.println("Seu limite de Watts por hora foi definido em: " + this.wattsPorHoraDesejado);
    }

    public void consumoDaLavagem(double energiaUtilizada) {
        if (energiaUtilizada <= 0) {
            System.out.println("Erro: A quantidade de energia desejada é inválida.");
            return;
        }
        if (this.wattsPorHoraDesejado < energiaUtilizada) {
            System.out.println("Erro: Energia insuficiente para realizar a lavagem.");
            return;
        }
        this.wattsPorHoraDesejado -= energiaUtilizada;
        System.out.println("Lavagem Realizada. Restam: " + this.wattsPorHoraDesejado + " Watts disponíveis.");
    }

    public String getMaterialCorpo() {
        return this.materialCorpo;
    }

    private void setMaterialCorpo(String materialCorpo) {
        this.materialCorpo = materialCorpo;
    }

    public double getPesoDaMaquina() {
        return this.pesoDaMaquina;
    }

    private void setPesoDaMaquina(double pesoDaMaquina) {
        this.pesoDaMaquina = pesoDaMaquina;
    }

    public int getVoltagem() {
        return this.voltagem;
    }

    private void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPesoSuportado() {
        return this.pesoSuportado;
    }

    private void setPesoSuportado(double pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }

    public int getWattsPorHoraDesejado() {
        return this.wattsPorHoraDesejado;
    }

    private void setWattsPorHoraDesejado(int valor) {
    	if (wattsPorHoraDesejado >= 0) {
            this.wattsPorHoraDesejado = valor;
        } else {
            System.out.println("Quantidade de watts por hora invalidada!");
        }
    }
   }
