
public class Auto extends Vehiculo {

	int cantidadPuertas;
	int velocidadMaxima;
	
	public Auto(String marca,String modelo, int anio, int cantidadPuertas, int velocidadMaxima) {
		super(marca, modelo, anio);
		this.cantidadPuertas=cantidadPuertas;
		this.velocidadMaxima=velocidadMaxima;
	}
	
	@Override public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println("Cantidad de puertas: "+cantidadPuertas);
		System.out.println("Velocidad máxima: "+velocidadMaxima+" km/h");
	}
}
