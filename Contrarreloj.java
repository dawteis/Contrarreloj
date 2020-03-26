/*
 * Vamos a intentar usar GIT  (github) como repositorio del proyecto
 */
package contrarreloj;

import java.util.Scanner;

/**
 * para llevar una contrarreloj ciclista
 *
 * @author C
 */
public class Contrarreloj {

    public static void main(String[] args) {

        //variables globales
        int opcion, dorsal, tiempo , puesto ; 
        
        int llegados = 0;  // corredores llegados
        int ultima= -1;  // ultima celda ocupada del array clasificacion
        
        int comprueba; // para saber si el dorsal es válido

        Corredor acorredores[];
        acorredores = new Corredor[6];   // el array de los corredores inscritos
        
        // el array con la clasificación provisional 
        
        Dorti clasificacion [];
        
        clasificacion = new Dorti [6];
        
        Dorti.inicializar (clasificacion);
        
        
        // cargar los datos de los corredores 

        Corredor.cargarDatos(acorredores); // rellena el array  acorredores
        
        
        Scanner teclado = new Scanner(System.in);
        opcion = Corredor.menu();

        while (opcion != 99) {
            switch (opcion) {

                case 0:  // meter más datos de corredores, opcion oculta
                    break;
                case 1:  // mostrar la clasificación
                        Dorti.mostrarClasificacion(clasificacion, llegados);
                        
                    break;
                case 2: // libre
                    break;
                case 3: // anotar la llegada de un corredor

                    System.out.println(" teclea dorsal : ");
                    dorsal = teclado.nextInt();
                    // comprobar que existe ese dorsal y que no esté ya anotado
                    comprueba = Dorti.comprobarDorsal(dorsal, acorredores , clasificacion);
                    if (comprueba == 0) {
                        // el dorsal es correcto, lo procesamos                       
                        System.out.println(" teclea tiempo  : ");
                        tiempo = teclado.nextInt();
                        llegados++;
                        puesto = Dorti.clasificar(dorsal, tiempo, clasificacion, llegados);
                    } else {
                        // el dorsal no es válido o ya está anotado
                        System.out.println(" * * * dorsal no válido o ya llegó antes  ");
                    }

                    break;
                case 4: // libre
                    break;
                case 5: // mostrar la información de un corredor
                //dorsal = leer dorsal();
                //mostrar_info(dorsal);
                case 6: // libre
                    break;
                case 7: // mostrar la lista de corredores de la carrera
                    Corredor.mostrarDatos(acorredores);
                    break;
                case 8:// mostrar equipos participantes
                    break;
                case 9: // mostrar información de un equipo
                    break;
                default:
                    // podemos mostrar un mensaje de error
                    break;
            } // fin del switch

            opcion = Corredor.menu();

        } // del while 
    } // fin del main

} // fin de la class

