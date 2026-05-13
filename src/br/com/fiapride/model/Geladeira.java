package br.com.fiapride.model;

public class Geladeira extends Eletrodomestico{
    private boolean hasAguaNaPorta;

    public Geladeira(String marca, int voltagem, boolean hasAguaNaPorta){
        super(marca,voltagem);
        this.hasAguaNaPorta = hasAguaNaPorta;
    }

    public boolean getHasAguaNaPorta(){
        return hasAguaNaPorta;
    }

    @Override
    public void realizarTarefa(double energiaUtilizada) {
        if (getWattsDisponiveis() >= energiaUtilizada) {
            setWattsDisponiveis(getWattsDisponiveis() - energiaUtilizada);
            System.out.println("SISTEMA DE REFRIGERAÇÃO ATIVO. Saldo: " + getWattsDisponiveis());
        } else {
            System.out.println("Alerta: Geladeira sem energia!");
        }
    }
}
