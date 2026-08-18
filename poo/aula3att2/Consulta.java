package aula3att2;

import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;

    public Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    public void exibirComprovante() {
        System.out.println("Comprovante da consulta");
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data: " + data);
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println();
    }
}
