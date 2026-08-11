package atividade2;

public class Principal {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Rodrigo sem h";
        f1.duracao = 90;
        f1.nota = 9.90;

        Filme f2 = new Filme();
        f2.titulo = "A volta dos que nao foram";
        f2.duracao = 120;
        f2.nota = 3.10;

        Filme f3 = new Filme();
        f3.titulo = "A bala que dobrou a esquina";
        f3.duracao = 100;
        f3.nota = 8.50;

        f1.marcarAssistido();
        f2.avaliar(7.5);

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();
    }
}
