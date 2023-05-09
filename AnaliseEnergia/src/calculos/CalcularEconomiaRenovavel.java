package calculos;

public class CalcularEconomiaRenovavel {

	 
    public static double calcularEnergiaInjetadaPonta(double geracaoRenovavel, double tarifa) {
        return geracaoRenovavel * tarifa;
    }
    
    
    public static double calcularEnergiaInjetadaForaPonta (double geracaoRenovavel, double tarifa) {
    	return geracaoRenovavel * tarifa;
    }
    
    public static double calcularEnergiaInjetadaMPT (double geracaoRenovavel, double tarifa) {
    	return geracaoRenovavel * tarifa;
    }
}
