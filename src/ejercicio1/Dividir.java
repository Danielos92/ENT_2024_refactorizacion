package ejercicio1;

public class Dividir {
	public int dividir(int dividendo, int divisor) {
	      
    	try {
    		int resultado = dividendo / divisor;
        }
    	catch(ArithmeticException e){
    		System.out.println("Error: No se puede dividir por cero.");
    	}
   
    	int resultado = dividendo / divisor;
        return resultado;
    }
}
