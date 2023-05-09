package calculos;

public class CalcularGastoFuturo {

	// Projeção de gastos futuros com base em um histórico de consumo
    public static double calcularGastoFuturo(double[] valores, int meses, double tarifa) {
        double consumoTotal = 0;
        for (double valor : valores) {
            consumoTotal += valor;
        }
        double consumoMedio = consumoTotal / valores.length;
        return consumoMedio * meses * tarifa;
    }
}
