/*Esta es la clase principal 
Se realizara el juego de ahorcado (con 5 oportunidades de errores)
el juego permite hasta 2 jugadores

*/
/*Este juego fue hecho por 
(LOPEZ SANDOVAL MARIANA), MAR PARA LOS AMIGOS 
*/
//librerias
import java.util.*; 
public class Principal{

   //scanner 
   Scanner entrada = new Scanner(System.in);

   //metodo principal de todo el programa 
    public static void main(String[] args){
       //variables
       Scanner entrada = new Scanner(System.in);
        int volverajugar;
    
        do{
            Principal.indice();
                System.out.println("Si quiere volver al menu escribe -6-");
                volverajugar = entrada.nextInt();
        }while (volverajugar == 6);
      
    }

    public static void indice(){
        Scanner entrada = new Scanner(System.in);
        int oh; 
        
     //objetos
       Datos  People = new Datos();
       System.out.println("IR AL REGISTRO DE DATOS ");
       People.mostrarDatos();

    }
}
 