package app;
import calculos.*;

public class Main {

	public static void main(String[] args) {
		// Array de consumo de energia em kWh
	    double[] consumoEnergia = { 4434.57};

	    	/*Instanciação dos objetos
	    	 * passando os valores de forma fixa pra validar a funcionalidade dos métodos
	    	 * aguardando avaliar como sao taxadas as contas para continuar  as classes
	    	 * */
	    
	        // Calcula o consumo médio de energia
	    	CalcularMedia calcularMedia = new CalcularMedia();
	    	double mediaConsumo = CalcularMedia.calcularMedia(consumoEnergia);
	        System.out.println("Média de consumo de energia: " + mediaConsumo + " kWh");

	        // Calcula o custo médio de energia
	        CalcularCusto calcularCusto = new CalcularCusto();
	        double custoMedio = CalcularCusto.calcularCustoPonta(consumoEnergia, 3.454840);
	        System.out.println("Custo médio de energia: R$ " + custoMedio);

	        // Calcula a economia feita através da geração de energia renovável
	        CalcularEconomiaRenovavel calcularEconomiaRenovavel = new CalcularEconomiaRenovavel();
	        double geracaoRenovavel = 4434.57 + 9960.51 + 4997.37;
	        double economiaRenovavel = CalcularEconomiaRenovavel.calcularEnergiaInjetadaPonta(geracaoRenovavel, 3.454840);
	        System.out.println("Economia feita através da geração de energia renovável: R$ " + economiaRenovavel);

	        // Projeção de gastos futuros
	        CalcularGastoFuturo calcularGastoFuturo = new CalcularGastoFuturo();
	        int mesesProjetados = 12;
	        double gastoFuturo = CalcularGastoFuturo.calcularGastoFuturo(consumoEnergia, mesesProjetados, 0.8764);
	        System.out.print("Gasto projetado para os próximos " + mesesProjetados + " "); 
	        System.out.printf("meses: R$ %.2f" , gastoFuturo);

	}

}
