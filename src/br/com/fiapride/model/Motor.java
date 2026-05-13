package br.com.fiapride.model;

public class Motor{
    private String marcaMotor;
    private int rpm;
    private int potenciaEmWatts;

    public Motor( String marcaMotor, int rpm, int potenciaEmWatts){
        this.marcaMotor = marcaMotor;
        this.rpm = rpm;
        this.potenciaEmWatts = potenciaEmWatts;
}
    public String getMarcaMotor() {
        return marcaMotor;
    }

    public int getRpm() {
        return rpm;
    }

    public int getPotenciaEmWatts() {
        return potenciaEmWatts;
    }
}