import java.util.Scanner;
public class EjemplosEscenario2 {

	public static void main(String[] args) {
		// Asegurar datos de entrada:
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite el radio de la base: ");
		double r=teclado.nextDouble();
		System.out.println("Digite la altura: ");
		double h=teclado.nextDouble();
		// Invocar a otros métodos:
		double v=calcular_volumen(r,h);
		// Reportar los resultados:
		System.out.println("El volumen del cilindro es: " + v);
		
		// Para el segundo ejercicio de Arte ASCII:
		// Asegurar datos de entrada:
		// Invocar a otros métodos:
		dibujar_ASCII();
		// Reportar los resultados: ninguno
	}
		// 1. Dado el radio de la base circular de una cilindro 
		// y la altura del cilindro, calcule su volúmen.
		
		// Empezar analizando las: Entradas y las Salidas
		// Entradas: Radio (double) y Altura (double)
		// Salidas: Volúmen
		
		//Empiezo a escribir Static porque es método. Y luego el
		// tipo de dato.
		
		static double calcular_volumen(double radio, double altura){
		// Volumen del cilindro: area del cilindro x altura
		// Area de la base = PI * r*r
			double area_circulo=3.14*radio*radio;
			double volumen=area_circulo*altura;
			return volumen;
		
		}
		
		// 2. Haga un programa que dibuje, usando arte ASCII.
		// NOTA: NO es un problema, es un ejercicio.
		// Entrada: ninguna
		// Salidas: ninguna
		static void dibujar_ASCII( ) {
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
		}
	}			
