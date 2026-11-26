
public class Vehiculo {

	String marca;
	String modelo;
	int anio;
	
	public Vehiculo(String marca,String modelo,int anio) {
		this.marca=marca;
		this.modelo=modelo;
		this.anio=anio;
	}
	
	public void imprimirInformacion() {		
		System.out.println("Informacion del vehiculo:");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Año: "+anio);
	}
	
}
