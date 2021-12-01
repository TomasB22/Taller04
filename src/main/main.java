package main;

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
        System.out.println ("3. Agregar persona a lista de desaparecidas.");
        System.out.println ("4. Salir.");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenu() {
        int opcionSwitch = -1;
        do {
            opcionSwitch = validarMenu(5);
            switch (opcionSwitch) {
                case 1 :
                    mostrarMenu();

                case 2 :


                case 3 :
                    mostrarMenu();
                case 4 :
                    finalizarPrograma();

                case 5 :

            }
        } while (opcionSwitch<5);
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
