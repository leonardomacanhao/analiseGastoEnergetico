package calculos;

public class CalcularMediaConsumo {

	//calculo das médias desconsiderando o maior e menor valor
    public double calcularMediaConsumoPonta(double[] valores) {
        
    	
        double menor = valores[0];
        double maior = valores[0];
        double soma = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        return (soma - menor - maior) / (valores.length - 2);
    	
      
    }
    
    public double calcularMediaConsumoForaPonta(double[] valores) {
    	
        double menor = valores[0];
        double maior = valores[0];
        double soma = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        return (soma - menor - maior) / (valores.length - 2);
    }
    
    public double calcularMediaEnergiaReativa(double[] valores) {
    	
        double menor = valores[0];
        double maior = valores[0];
        double soma = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        return (soma - menor - maior) / (valores.length - 2);
    }
    
    public double calcularMediaDemandaPotenciaMedidaPonta(double[] valores) {
    	
        double menor = valores[0];
        double maior = valores[0];
        double soma = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        return (soma - menor - maior) / (valores.length - 2);
    }
    
    public double calcularMediaDemandaPotenciaNaoConsumida(double[] valores) {
    	
        double menor = valores[0];
        double maior = valores[0];
        double soma = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        return (soma - menor - maior) / (valores.length - 2);
    }
}
