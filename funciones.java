package prog2;
import java.util.*;
public class funciones {

	public static void main(String[] args) {
	
		var nombre = "Juan"; // "var" es palabra reservada
		var edad = 25;
		saludar(nombre, edad);
		//var suma = sumar(20, 4);
		System.out.println("la suma es: "+ sumar(20 , 4));
		System.out.println(saludar(nombre, edad));
}

	static int sumar(int a, int b) {
		return a + b;
		
		
	}
	
	
	
	
	static String saludar(String nombre, int edad){
		return "su nombre es "+nombre+" y su edad es "+edad;
		//System.out.printf("Hola %s tu edad es %d \n", nombre, edad);
	}
	
	
	
	
	
	
	
	
	
	
	
}
