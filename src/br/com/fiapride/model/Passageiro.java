package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0); // Todo mundo começa com zero
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            // Usamos o setSaldo interno para aplicar a regra de negócio
            this.setSaldo(this.saldo + valor);
            System.out.println("Saldo adicionado com sucesso para " + this.nome);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}