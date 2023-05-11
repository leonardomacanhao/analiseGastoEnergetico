package calculos;

public class CalcularMediaInjetada {


	//calculo das médias desconsiderando o maior e menor valor
    public double calcularMediaEnergiaInjetadaOPT(double[] valores) {
    	
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
    
    public double calcularMediaEnergiaInjetadaForaPonta(double[] valores) {
    	
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
    
    public double calcularMediaEnergiaInjetadaMPT(double[] valores) {
    	
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
