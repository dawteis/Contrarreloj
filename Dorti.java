
package contrarreloj;

/**
 * declaramos aquí un nuevo objeto dorti  ( dorsal-tiempo)
 * y la tabla de clasificacion que es un array de dortis
 */
public class Dorti {

    // atributos
    int dorsal;
    int tiempo;

    // metodo constructor 
    public Dorti(int dorsal, int tiempo) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public static void inicializar(Dorti aaa[]) {

        /* le paso un dorsal, un tiempo, y lo pone en el array de clasificacion en la última celda libre */
        for (int i = 0; i < aaa.length; i++) {

            aaa[i] = new Dorti(888, -1);

        }
    }

    public static int clasificar(int dorsal, int tiempo, Dorti aaa[], int llegados) {

        /* le paso un dorsal, un tiempo, y lo pone en el array de clasificacion en la última celda libre */
        aaa[llegados].dorsal = dorsal;

        aaa[llegados].tiempo = tiempo;

        /* ahora ordena el array por el tiempo , método de los jugadores de cartas 
        /* y devuelve en que puesto quedó */
        /* aun no está implementado la ordenación */ 
        
        
        return (llegados);

    }

    public static void mostrarClasificacion(Dorti aaa[], int llegados) {

        for (int p = 0; p <= llegados; p ++) {
            System.out.println(" * - * - * - * ");
            System.out.println(p +" : " + aaa[p].dorsal + " >> " + aaa[p].tiempo);
        }
        System.out.println(" * - * - * - * ");

    }


}
