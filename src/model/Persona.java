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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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