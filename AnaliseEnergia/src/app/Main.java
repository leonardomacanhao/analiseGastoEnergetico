package app;
import calculos.*;

public class Main {

	public static void main(String[] args) {
		
			// Array de consumo de energia em kWh
	    	double[] consumoPonta = {3798.27 , 4302.27 , 3410.61 , 3108.21 ,  2922.15 , 2,648.31 , 2894.22 , 3340.26 , 3011.61 , 3180.03 , 2447.34 , 1768.41};
	    	double[] consumoForaPonta = { 11614.05 , 14167.23 , 12301.8 , 9810.57 , 9412.2 , 9008.58 , 9077.88 , 9776.55 , 9262.05 , 8392.02 , 8306.34 , 7802.76 };
	    	double[] consumoEnergiaExcedente = {11.97 , 8.82 , 9.24 ,  0.63 , 3.15 , 3.36 , 16.80 , 12.18 , 2.52 , 26.25 , 16.80 , 0.21 };
	    	double[] energiaMedidaForaPonta = {115.080 , 118.440 , 99.96 , 84.84 , 83.16 , 95.76 , 72.24 , 89.04 , 100.8 , 101.64 , 115.08 , 75.60 };
	    	double[] potenciaNaoConsumida = {29.92 , 20.56 , 39.04 , 54.16 , 55.84 ,  43.24 , 66.76 , 49.96 , 38.20 , 37.36 , 23.92 , 67.40};
	    	
	    	//variaveis de energia injetada
	    	double[] energiaInjetadaOpT = {1743.297 , 4302.27 , 1981.04 ,1429.57 , 3108.21 , 2922.15 , 2648.31 , 2894.22 , 3340.26 , 3.011,61 , 3180.03 , 2447.34 , 1768.41};
	    	double[] energiaInjetadaMpT = {2054.973 , 3826.2 ,  0 , 0 , 0 , 0 , 0 , 0 , 0 ,0 , 0 , 0};
	    	double[] energiaInjetadaForaPonta = {11614.05 , 10341.03 , 12301.8 , 9.810,57 , 9412.20 , 9008.58 , 9077.88 , 9776.55 , 9262.05 , 8392.02 , 8306.34 , 7802.76};
	    	
	    	
	    	//calculo das médias em kw anual, desconsiderando o menor valor e maior
	    	CalcularMediaConsumo mediaPonta = new CalcularMediaConsumo();
	    	double mc1 = mediaPonta.calcularMediaConsumoPonta(consumoPonta);
	    	CalcularMediaConsumo mediaForaPonta = new CalcularMediaConsumo();
	    	double mc2 = mediaForaPonta.calcularMediaConsumoForaPonta(consumoForaPonta);
	    	CalcularMediaConsumo mediaEnergiaReativa = new CalcularMediaConsumo();
	    	double mc3 = mediaEnergiaReativa.calcularMediaEnergiaReativa(consumoEnergiaExcedente);
	    	CalcularMediaConsumo demandaPotenciaMedidaPonta = new CalcularMediaConsumo();
	    	double mc4 = demandaPotenciaMedidaPonta.calcularMediaDemandaPotenciaMedidaPonta(energiaMedidaForaPonta);
	    	CalcularMediaConsumo demandaPotenciaNaoConsumida = new CalcularMediaConsumo();
	    	double mc5 = demandaPotenciaNaoConsumida.calcularMediaDemandaPotenciaNaoConsumida(potenciaNaoConsumida);
	    	
	    	//calculo das médias em kw anual, desconsiderando o menor valor e maior
	    	CalcularMediaInjetada mediaInjetadaOPT = new CalcularMediaInjetada();
	    	double mi1 = mediaInjetadaOPT.calcularMediaEnergiaInjetadaOPT(energiaInjetadaOpT);
	    	CalcularMediaInjetada mediaInjetadaForaPonta = new CalcularMediaInjetada();
	    	double mi2 = mediaInjetadaForaPonta.calcularMediaEnergiaInjetadaMPT(energiaInjetadaForaPonta);
	    	CalcularMediaInjetada mediaInjetadaMPT = new CalcularMediaInjetada();
	    	double mi3 = mediaInjetadaMPT.calcularMediaEnergiaInjetadaMPT(energiaInjetadaMpT);
	    	
	       
	        System.out.printf("Média de consumo Ponta: \t\t\t%.2f%s\n" , mc1 , "KwH");
	        System.out.printf("Média de consumo Fora Ponta: \t\t\t%.2f%s\n" , mc2 , "KwH");
	        System.out.printf("Média de consumo Energia Reativa: \t\t%.2f%s\n" , mc3 , "KwH");
	        System.out.printf("Média de consumo Demanda Medida - Fora Ponta: \t%.2f%s\n" , mc4 , "KwH");
	        System.out.printf("Média de consumo Demanda Potência não Consumida:%.2f%s\n" , mc5 , "KwH");
	        System.out.println("");
	        System.out.printf("Média de Energia Injetada OpT: \t\t\t%.2f%s\n" , mi1 , "KwH");
	        System.out.printf("Média de Energia Injetada Fora Ponta: \t\t%.2f%s\n" , mi2 , "KwH");
	        System.out.printf("Média de Energia Injetada MpT: \t\t\t%.2f%s\n" , mi3 , "KwH");
	        System.out.println("");
	 

	        

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
