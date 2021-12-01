package model;

import java.util.ArrayList;
import java.util.Scanner;

public class DesastreBio {
	private String lugar;
	private int año;
	private long impactoEconomico;
	private int cantidadPersonasAfect;
	public ArrayList<Persona> personasDesaparecidas;

	public DesastreBio(String lugar, int año, int impactoEconomico, int cantidadPersonasAfect, ArrayList<Persona> personasDesaparecidas) {
		this.lugar = lugar;
		this.año = año;
		this.impactoEconomico = impactoEconomico;
		this.cantidadPersonasAfect = cantidadPersonasAfect;
		this.personasDesaparecidas = personasDesaparecidas;
	}

	public DesastreBio() {
	}

	public void listaDesaparecidos() {
		System.out.println(personasDesaparecidas.toString());
	}

	public void detalleDesastre() {
		System.out.println(toString());
	}

	public void actualizarListaDesaparecidos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		String nombre = teclado.next();
		System.out.println("Edad: ");
		int edad = validarInt();
		System.out.println("Sexo: ");
		String sexo = teclado.next();
		personasDesaparecidas.add(new Persona(nombre,edad,sexo,"desaparecido"));
	}

	public static int validarInt (){
		int n = -1;
		do {
			//Scanner ponerlo dentro del DO, y dentro de una funcion
			Scanner teclado = new Scanner (System.in);
			//System.out.println("ingrese otro numero");
			try {
				n = teclado.nextInt ();
			} catch (Exception e) {
				System.out.println ("Error");
			}
			if (n < 0 ) {
				System.out.println ("ingrese un numero valido");
			}
		} while (n < 0 );
		return n;
	}

	@Override
	public String toString() {
		return "DesastreBio:" + lugar +";"+ año +";"+ impactoEconomico +";"+ cantidadPersonasAfect +";"+ personasDesaparecidas;
	}
}

