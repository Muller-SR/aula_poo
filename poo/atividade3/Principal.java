package atividade3;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Murilo";
        c1.saldo = 500.00;

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Maria";
        c2.saldo = 1000.00;

        c1.depositar(200.00);
        c1.sacar(100.00);

        c2.depositar(300.00);
        c2.sacar(1500.00);

        c1.exibirSaldo();
        c2.exibirSaldo();
    }
}
