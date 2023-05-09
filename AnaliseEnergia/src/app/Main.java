package app;
import calculos.*;

public class Main {

	public static void main(String[] args) {
		// Array de consumo de energia em kWh
		
	    	double[] consumoPonta = { 4434.57};
	    	double[] consumoForaPonta = { 14957.88};
	    	double[] consumoEnergiaExcedente = { 3.57};
	    	double[] energiaMedidaForaPonta = { 130.20};
	    	double[] potenciaNaoConsumida = { 8.80};

	    	/*Instanciação dos objetos
	    	 * passando os valores de forma fixa pra validar a funcionalidade dos métodos
	    	 * aguardando avaliar como sao taxadas as contas para continuar  as classes
	    	 * */
	    
	        // Calcula o consumo total
	    	//CalcularMedia calcularMedia = new CalcularMedia();
	    	//double mediaConsumo = CalcularMedia.calcularMedia(consumoEnergia);
	        //System.out.println("Média de consumo de energia: " + mediaConsumo + " kWh");

	        // Calcula o custo médio de energia
	        CalcularCusto custoPonta = new CalcularCusto();
	        double c1 = custoPonta.calcularCustoPonta(consumoPonta, 3.454840);
	        CalcularCusto custoForaPonta = new CalcularCusto();
	        double c2 = custoForaPonta.calcularCustoForaPonta(consumoForaPonta, 0.483800);
	        CalcularCusto custoEnergiaExcedente = new CalcularCusto();
	        double c3 = custoEnergiaExcedente.calcularCustoEnergiaExcedente(consumoEnergiaExcedente, 0.349910);
	        CalcularCusto custoEnergiaMedidaForaPonta = new CalcularCusto();
	        double c4 = custoEnergiaMedidaForaPonta.demandaDePotenciaMedidaForaPonta(energiaMedidaForaPonta, 40.447130);
	        CalcularCusto custoPotenciaNaoConsumida = new CalcularCusto();
	        double c5 = custoPotenciaNaoConsumida.demandaDePotenciaNaoConsumida(potenciaNaoConsumida, 40.447130);
	        
	        
	        
	        //calculo do valor total consumido, chamando a o metodo custoTotalConsumido da classe Calcular Custo
	        CalcularCusto calcularCustoTotal = new CalcularCusto();
	        double valorTotalConsumido = calcularCustoTotal.custoTotalConsumido(c1 , c2 , c3 , c4 , c5);
	        
	        System.out.printf("Consumo total: R$ %.2f" , valorTotalConsumido);

	        /*
	        // Calcula a economia feita através da geração de energia renovável
	        CalcularEconomiaRenovavel calcularEconomiaRenovavel = new CalcularEconomiaRenovavel();
	        double geracaoRenovavel = 4434.57 + 9960.51 + 4997.37;
	        double economiaRenovavel = CalcularEconomiaRenovavel.calcularEnergiaInjetadaPonta(geracaoRenovavel, 3.454840);
	        System.out.println("Economia feita através da geração de energia renovável: R$ " + economiaRenovavel);

	        // Projeção de gastos futuros
	       
	        * CalcularGastoFuturo calcularGastoFuturo = new CalcularGastoFuturo();
	        int mesesProjetados = 12;
	        double gastoFuturo = CalcularGastoFuturo.calcularGastoFuturo(consumoEnergia, mesesProjetados, 0.8764);
	        System.out.print("Gasto projetado para os próximos " + mesesProjetados + " "); 
	        System.out.printf("meses: R$ %.2f" , gastoFuturo);
	        */

	}

}
