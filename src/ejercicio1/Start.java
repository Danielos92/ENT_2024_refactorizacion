package ejercicio1;

public class Start {

	public static void main(String[] args) {
	
	        Sumar suma = new Sumar();
	        Restar resta = new Restar();
	        Dividir division = new Dividir();
	        Multiplicar multiplicacion = new Multiplicar();
	        System.out.println("Suma: " + suma.sumar(10, 5));
	        System.out.println("Resta: " + resta.restar(10, 5));
	        System.out.println("Multiplicación: " + multiplicacion.multiplicar(10, 5));
	        System.out.println("División: " + division.dividir(10, 5));
	    

	}

}
