
public class Loja {

    public static String formula = "produto1 + produto2";

    public static double calcularPedido(double produto1, double produto2) {
        String expressao;
        expressao = formula.replace("produto1", Double.toString(produto1));
        expressao = expressao.replace("produto2", Double.toString(produto2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}