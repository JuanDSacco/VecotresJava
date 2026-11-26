import java.util.Scanner;

public class Array {

	int[] valores;
	Scanner teclado;
	
	public Array() {
		valores = new int[6];
		teclado = new Scanner(System.in);
	}
	
	public void cargarArray() {
		for(int i = 0;i<valores.length;i++) {
			System.out.println("Ingrese un valor");
			valores[i]=teclado.nextInt();
		}
	}
	
	public void imprimirArray() {
		System.out.println("Valores ingresados del Array: ");
		for(int i = 0;i<valores.length;i++) {
			System.out.print(+valores[i]+"-");
		}
		System.out.println();
	}
	
	public double calcularPromedio() {
		double total = 0;
		double promedio;
		for(int i = 0;i<valores.length;i++) {
			total += valores[i];
		}
		promedio = total / valores.length;
		return promedio;
	}
	
	public int contarValoresPares() {
		int contador = 0;
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]%2==0) {
				contador++;
			}
		}
		return contador;	
	}
	
	public static void main(String[] args) {
		
		Array valor = new Array();
		
		valor.cargarArray();
		valor.imprimirArray();
		System.out.println("El promedio de valores es: "+valor.calcularPromedio());
		System.out.println("La cantidad de valores pares son: "+valor.contarValoresPares());
	}
	
}
