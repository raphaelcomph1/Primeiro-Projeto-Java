package br.com.fiapride.model;

public class MaquinaDeLavar extends Eletrodomestico implements Notificavel{

    private String materialCorpo;
    private Motor intermediador;

    public MaquinaDeLavar(String marca, int voltagem, String materialCorpo, Motor motorUtilizado) {
        super(marca, voltagem);
        this.setMaterialCorpo(materialCorpo) ;
        this.intermediador = motorUtilizado;
    }
    public Motor getMotor(){
        return this.intermediador;
    }


    public String getMaterialCorpo() {
        return this.materialCorpo;
    }

    private void setMaterialCorpo(String materialCorpo) {
        this.materialCorpo = materialCorpo;
    }

    @Override
    public void realizarTarefa(double energiaUtilizada) {
        if (getWattsDisponiveis() >= energiaUtilizada) {
            setWattsDisponiveis(getWattsDisponiveis() - energiaUtilizada);
            System.out.println("LAVAGEM CONCLUÍDA. Restam: " + getWattsDisponiveis() + " Watts.");
        } else {
            System.out.println("Erro: Energia insuficiente na máquina.");
        }
    }
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[App Casa] Notificação da Máquina: " + mensagem);
    }
}

