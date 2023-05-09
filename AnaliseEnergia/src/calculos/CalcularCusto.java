package calculos;

public class CalcularCusto {

	 
    public double calcularCustoPonta(double[] valores, double tarifa) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor * tarifa;
        }
        return soma / valores.length;
    }
    
    
    public double calcularCustoForaPonta (double[] valores, double tarifa) {
    	 
    	double soma = 0;
         for (double valor : valores) {
             soma += valor * tarifa;
         }
         return soma / valores.length;
    }
    
    public double calcularCustoEnergiaExcedente(double[] valores, double tarifa) {
   	 
   	double soma = 0;
        for (double valor : valores) {
            soma += valor * tarifa;
        }
        return soma / valores.length;
   }
    
    public double demandaDePotenciaMedidaForaPonta(double[] valores, double tarifa) {
      	 
       	double soma = 0;
            for (double valor : valores) {
                soma += valor * tarifa;
            }
            return soma / valores.length;
       }
    
    public double demandaDePotenciaNaoConsumida(double[] valores, double tarifa) {
     	 
       	double soma = 0;
            for (double valor : valores) {
                soma += valor * tarifa;
            }
            return soma / valores.length;
       }
    
    public double custoTotalConsumido (double ponta ,double foraPonta , double excedente, double potMedForaPonta , double naoConsumida ) {
    	
    	
    	double soma = ponta + foraPonta + excedente + potMedForaPonta + naoConsumida ;
    	
    	return soma;
    }
}
