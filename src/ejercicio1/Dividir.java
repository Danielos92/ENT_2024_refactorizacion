package ejercicio1;

public class Dividir {
	public int dividir(int a, int b) {
	      
    	try {
    		int resultado = a / b;
        }
    	catch(ArithmeticException e){
    		System.out.println("Error: No se puede dividir por cero.");
    	}
   
    	int resultado = a / b;
        return resultado;
    }
}
