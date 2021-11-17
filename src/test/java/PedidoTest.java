
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Pedido pedido = new Pedido();
        pedido.setProduto1(150.0);
        pedido.setProduto2(250.0);

        assertEquals(400.0, pedido.calcularPedido());
    }

}