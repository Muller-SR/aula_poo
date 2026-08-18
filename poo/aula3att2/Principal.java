package aula3att2;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Ana Silva", "1198765-4321");
        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2026, 8, 20), 150.00);

        Paciente paciente2 = new Paciente("Carlos Souza", "1191234-5678");
        Consulta consulta2 = new Consulta(paciente2, LocalDate.of(2026, 8, 21), 200.00);

        consulta1.exibirComprovante();
        consulta2.exibirComprovante();
    }
}
