package calculos;

public class CalcularCusto {

	 
    public static double calcularCustoPonta(double[] valores, double tarifa) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor * tarifa;
        }
        return soma / valores.length;
    }
    
    
    public static double calcularCustoForaPonta (double[] valores, double tarifa) {
    	 
    	double soma = 0;
         for (double valor : valores) {
             soma += valor * tarifa;
         }
         return soma / valores.length;
    }
    
    public static double calcularCustoEnergiaExcedente(double[] valores, double tarifa) {
   	 
   	double soma = 0;
        for (double valor : valores) {
            soma += valor * tarifa;
        }
        return soma / valores.length;
   }
    
    public static double demandaDePotenciaMedidaForaPonta(double[] valores, double tarifa) {
      	 
       	double soma = 0;
            for (double valor : valores) {
                soma += valor * tarifa;
            }
            return soma / valores.length;
       }
    
    public static double demandaDePotenciaNaoConsumida(double[] valores, double tarifa) {
     	 
       	double soma = 0;
            for (double valor : valores) {
                soma += valor * tarifa;
            }
            return soma / valores.length;
       }
}
