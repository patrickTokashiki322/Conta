package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldoInicial) {
        this.numero = numero;
        this.nome = nome;
        depositar(saldoInicial);
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) {
        saldo -= quantia + 5.0;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    @Override
    public String toString() {
        return
                "número da conta: " + numero +
                        " nome: " + nome +
                        " saldo: " + String.format("%.2f", saldo);

    }
}
