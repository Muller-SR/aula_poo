package aula3att1;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Silva", "ana@email.com");
        Produto produto1 = new Produto("Notebook", 3500.00);
        Pedido pedido1 = new Pedido(cliente1, produto1, 2);

        Cliente cliente2 = new Cliente("Carlos Souza", "carlos@email.com");
        Produto produto2 = new Produto("Mouse", 80.00);
        Pedido pedido2 = new Pedido(cliente2, produto2, 3);

        pedido1.resumo();
        pedido2.resumo();
    }
}
