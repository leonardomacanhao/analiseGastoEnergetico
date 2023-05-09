package calculos;

public class CalcularMedia {

	   // Calcula a média de um array de valores
    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}
