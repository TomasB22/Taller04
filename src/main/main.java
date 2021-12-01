package main;

import gui.VentanaLista;
import model.DesastreBio;
import model.Persona;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma() {
        mostrarMenu ();
        switchesMenu ();
    }
    private static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Mostrar datos del desastre biologico.");
        System.out.println ("2. Mostrar lista de personas desaparecidas.");
        System.out.println ("3. Mostrar lista de personas desaparecidas mediante JFrame");
        System.out.println ("4. Agregar persona a lista de desaparecidas.");
        System.out.println ("5. Salir.");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenu() {
        DesastreBio d1 = new DesastreBio("Chile",2020,987451651,38346,agregarPersonasDefault());
        int opcionSwitch = -1;
        do {
            opcionSwitch = validarMenu(5);
            switch (opcionSwitch) {
                case 1 :
                    d1.detalleDesastre();
                    mostrarMenu();
                case 2 :
                    d1.listaDesaparecidos();
                    mostrarMenu();
                case 3 :
                    VentanaLista ventanaLista =  new VentanaLista(d1);
                    ventanaLista.setVisible(true);
                case 4 :
                    d1.actualizarListaDesaparecidos();
                    mostrarMenu();
                case 5 :
                    finalizarPrograma();
            }
        } while (opcionSwitch<5);
    }

    private static ArrayList<Persona> agregarPersonasDefault() {
        ArrayList<Persona> listPersonas = new ArrayList<>();
        listPersonas.add(new Persona("Tomas Baeza",20,"desaparecido","Masculino"));
        listPersonas.add(new Persona("Manlet Sanchez",21,"desaparecido","Femenino"));
        listPersonas.add(new Persona("Gonzalo Caniupan",21,"desaparecido","Masculino"));
        return listPersonas;
    }

    private static void finalizarPrograma() {
        System.out.println ("Programa finalizado.");
    }

    public static int validarMenu ( int x){
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt ();
            } catch (Exception e) {
                System.out.println ("Error");
            }
            if (n < 0  ||n > x) {
                System.out.println ("ingrese un numero valido");
            }
        } while (n < 0  ||n > x);
        return n;
    }
}
