package aula3att1;

public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void resumo() {
        double valorTotal = produto.preco * quantidade;

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Email: " + cliente.email);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println();
    }
}
