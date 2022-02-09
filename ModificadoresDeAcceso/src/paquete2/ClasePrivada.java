package paquete2;

public class ClasePrivada {
	//atributos
	public String nombre;
	public int edad;
	
	//métodos
	public void setSaludar(String nombre) {//fijar o modificar un valo
		this.nombre = nombre;
	}
	
	public String getSaludar() {
		return this.nombre;
	}
}
