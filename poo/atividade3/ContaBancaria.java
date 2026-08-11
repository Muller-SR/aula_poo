package atividade3;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + "Saldo: R$ " + saldo);
    }
}
