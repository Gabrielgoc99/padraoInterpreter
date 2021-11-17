
public class Pedido {
    private double produto1;
    private double produto2;

    public double getProduto1() {
        return produto1;
    }

    public void setProduto1(double produto1) {
        this.produto1 = produto1;
    }

    public double getProduto2() {
        return produto2;
    }

    public void setProduto2(double produto2) {
        this.produto2 = produto2;
    }

    public double calcularPedido() {
        return Loja.calcularPedido(this.produto1, this.produto2);
    }
}