/*Es es la clase principal
se realizara
los siguientes programas 
edad (calculara la edad de una persona)
figuras(se calculara el area y perimetro de: circulo, rectangulo, triangulo, cuadrado)
telefono(calcula el costo de llamadas de telefono nacionales, internacionales y celulares)
*/
//este programa fue hecho por Lopez Sandoval Mariana 
import java.util.Scanner;
public class Principal{
    //metodo principal
    public static void main(String[] args) {
        char repetir;
        //Objeto de la clase menu
        Menu menup = new Menu();
        //objeto del metodo Scanner
        Scanner leer = new Scanner(System.in);

        do{
            //mandamos a llamar al metodo indice
            menup.menu();

            System.out.println("Si desea repetir los programas digite 'r', de lo contraio digite 's'.");
            repetir = leer.next().charAt(0);
        }while(repetir != 's');
    }
}