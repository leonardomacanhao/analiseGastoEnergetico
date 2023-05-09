package app;
import calculos.*;

public class Main {

	public static void main(String[] args) {
		// Array de consumo de energia em kWh
	    double[] consumoEnergia = { 4434.57 , 14957.88 , 130.20 , 8.8};

	    
	        // Calcula o consumo médio de energia
	    	CalcularMedia calcularMedia = new CalcularMedia();
	    	double mediaConsumo = CalcularMedia.calcularMedia(consumoEnergia);
	        System.out.println("Média de consumo de energia: " + mediaConsumo + " kWh");

	        // Calcula o custo médio de energia
	        CalcularCusto calcularCusto = new CalcularCusto();
	        double custoMedio = CalcularCusto.calcularCusto(consumoEnergia, 3.454840);
	        System.out.println("Custo médio de energia: R$ " + custoMedio);

	        // Calcula a economia feita através da geração de energia renovável
	        CalcularEconomiaRenovavel calcularEconomiaRenovavel = new CalcularEconomiaRenovavel();
	        double geracaoRenovavel = 4434.57 + 9960.51 + 4997.37;
	        double economiaRenovavel = CalcularEconomiaRenovavel.calcularEconomiaRenovavel(geracaoRenovavel, 3.454840);
	        System.out.println("Economia feita através da geração de energia renovável: R$ " + economiaRenovavel);

	        // Projeção de gastos futuros
	        CalcularGastoFuturo calcularGastoFuturo = new CalcularGastoFuturo();
	        int mesesProjetados = 12;
	        double gastoFuturo = CalcularGastoFuturo.calcularGastoFuturo(consumoEnergia, mesesProjetados, 0.8764);
	        System.out.print("Gasto projetado para os próximos " + mesesProjetados + " "); 
	        System.out.printf("meses: R$ %.2f" , gastoFuturo);

	}

}
