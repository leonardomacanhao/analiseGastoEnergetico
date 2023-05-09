package calculos;

public class CalcularCusto {

	  // Calcula o custo médio de energia com base em uma tarifa
    public static double calcularCusto(double[] valores, double tarifa) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor * tarifa;
        }
        return soma / valores.length;
    }
}
