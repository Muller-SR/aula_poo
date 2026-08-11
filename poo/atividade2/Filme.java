package atividade2;

public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido = false;

    void exibirFicha() {
        System.out.println("Titulo: " + titulo + "Duracao: " + duracao + "Nota: " + nota + "Assistido: " + assistido);
    }

    void marcarAssistido() {
        assistido = true;
    }

    void avaliar(double novaNota) {
        nota = novaNota;
    }
}
