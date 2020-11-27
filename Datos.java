/* INFORMACION DE LOS JUGADORES
*/

/*Este juego fue hecho por 
(LOPEZ SANDOVAL MARIANA), MAR PARA LOS AMIGOS 
*/
//librerias 

import java.util.*;
public class Datos{
    Scanner entrada = new Scanner(System.in);
    //variables
     String nombre1, nombre2; 
     int edad1, edad2;

    public Datos(){
    }
    public void mostrarDatos(){
        System.out.println("Bienvenido al juego AHORCADOS:)");
        System.out.println(" TOMAREMOS LOS DATOS DEL - ");
        System.out.println("JUGADOR NUMERO 1 ");
        System.out.println("Ingresa tu nombre o algun alias: ");
        nombre1 = entrada.nextLine();
        System.out.println("¿Que edad tienes? ");
        edad1 = entrada.nextInt();
        System.out.println("AHORA ES TURNO DEL - ");
        System.out.println("JUGADOR NUEMRO 2 ");
        System.out.println("Ingresa tu nombre o algun alias: ");
        nombre2 = entrada.nextLine();
        System.out.println("¿Que edad tienes? ");
        edad2 = entrada.nextInt();
        System.out.println(" --INSTRUCCIONES-- ");
        
        System.out.println("El jugador 1 ingresara una palabra,"
                         + " mientras que el jugador 2 tratara de"
                         + " adivinarla SOLO TIENE"
                         + " OPORTUNIDAD DE 6 ERRORES");
        
        Ahorcados  juegoss = new Ahorcados(nombre1, nombre2);
        System.out.println("IR AL JUEGO ");
        juegoss.mostrarJuego();

    } 

}    