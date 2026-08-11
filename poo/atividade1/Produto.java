package atividade1;

public class Produto {
    String nome;
    double preco;
    int estoque;

    void exibirInfo() {
        System.out.println("Nome: " + nome + "Preco: R$ " + preco + "Estoque: " + estoque);
    }

    void vender(int qtd) {
        estoque = estoque - qtd;
    }
}
