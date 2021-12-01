package model;

public class Persona {
	private String nombre;
	private int edad;
	private String estado;
	private String sexo;

	public Persona(String nombre, int edad, String estado, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				", estado='" + estado + '\'' +
				", sexo='" + sexo + '\'' +
				'}';
	}
}