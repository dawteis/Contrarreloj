
package contrarreloj;

import java.util.Scanner;

public class Corredor {

    // atributos
    int dorsal;
    String nombre;
    String equipo;
    String pais;

    // metodo constructor
    public Corredor(int dorsal, String nombre, String equipo, String pais) {

        this.dorsal = dorsal;
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais= pais;
    }

    public static void mostrarDatos(Corredor aaa[]) {

        for (int d = 0; d < aaa.length; d++) {
            System.out.println(" * - * - * - * ");
            System.out.println("Corredor : " + aaa[d].dorsal + " >> " + aaa[d].nombre + " >> " + aaa[d].equipo+ " >> " + aaa[d].pais);
        }
        System.out.println(" * - * - * - * ");

    }

    public static void cargarDatos(Corredor aaa[]) {

        // Corredor uno;  se pueden pedir que tecleen los datos de los corredores
        // Corredor uno = new Corredor(dorsal, nombre, equipo, pais);

        // o podemos generarlo así 
        aaa [0] = new Corredor(10,"Peter","Saxo","Eslovenia");
        aaa[1] = new Corredor(20,"Alberto","Trek","España");
        aaa[2] =new Corredor(30,"Joaquin","Movistar","Eslovenia");
        aaa[3]= new Corredor(40,"Alejandro","Euskaltel","España");     
        aaa[4] = new Corredor(50,"Nairo","Movistar","Colombia");
        aaa[5]= new Corredor(60,"Cadel","Sky","Eslovenia");
    }

    public static int menu() {

        int leido;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("1 : Mostrar la clasificación ");
        System.out.println("2 : ");
        System.out.println("3 : Llegada de un corredor ");
        System.out.println("5 : ");
        System.out.println("7 : Mostrar los participantes ");
        System.out.println("8 : Mostrar los datos de un corredor ");
        System.out.println("9 : ");
        System.out.println("99 : Salir");

        leido = entradaTeclado.nextInt();
        return (leido);
    } // fin del método menu

    public static void mostrarUno(int dorsal, Corredor aaa []) {

        // muestra los datos de un corredor
        for (int i=0; i<aaa.length; i++)
            if ( aaa[i].dorsal == dorsal )
                
                 System.out.println(" . . .  " + aaa[i].dorsal + " .. " + aaa[i].nombre + ".. " + aaa[i].equipo + ".." +aaa[i].pais);

    }

    public static String buscaN (int dorsal, Corredor aaa []) {
        /* busca el nombre a partir de un dorsal */
        String nombre=" ";
        for (int i=0; i<aaa.length; i++)
            if ( aaa[i].dorsal == dorsal )
                nombre= aaa[i].nombre;
        
        return nombre;
    }
    public static  String buscaE (int dorsal, Corredor aaa []) {
        /* busca el equipo a partir de un dorsal */
        String equipo=" ";
        for (int i=0; i<aaa.length; i++)
            if ( aaa[i].dorsal == dorsal )
                equipo= aaa[i].equipo  ;
        
        return equipo ;
    }
} // fin de la class corredor
