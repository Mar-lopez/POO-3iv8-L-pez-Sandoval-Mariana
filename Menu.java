/*Es es la clase principal
se realizara
los siguientes programas 
edad (calculara la edad de una persona)
figuras(se calculara el area y perimetro de: circulo, rectangulo, triangulo, cuadrado)
telefono(calcula el costo de llamadas de telefono nacionales, internacionales y celulares)
*/
//este programa fue hecho por Lopez Sandoval Mariana 
//librerias
import java.util.Scanner;

//Clase principal

public class Menu{


    //objetos
    Scanner entrada = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
	private Anyos edad = new Anyos();
	private Formulas figuras = new Formulas();
	private Telefono llamadas = new Telefono();

    //vamos a crear un metodo menu
    public void menu(){
        int opcion;
        System.out.println("Este programa fue hecho por:");
        System.out.println("Lopez Sandoval Mariana");
        System.out.println("1.- Calcular tu edad");
        System.out.println("2.- Area y Perimetro de Figuras Geometricas");
        System.out.println("3.- Costo de llamadas telefonicas ");
        opcion = entrada.nextInt();
        //switch
        switch(opcion){
            case 1:
                //vamos a crear el metodo de calcular tu edad 
                edad.menuA();
                break;
            case 2:
                //vamos a crear el metodo de Area y Perimetro de Figuras Geometricas
                figuras.menuB();
                break;  
            case 3:
                //vamos a crear el metodo de Costo de llamadas telefonicas 
                llamadas.menuC();
                break;
        }
    }

    
}