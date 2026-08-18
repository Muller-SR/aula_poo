package aula3att3;

public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    public Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public void exibirFicha() {
        System.out.println("Ficha do livro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
        System.out.println();
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro \"" + titulo + "\" ja esta emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        }
    }
}
