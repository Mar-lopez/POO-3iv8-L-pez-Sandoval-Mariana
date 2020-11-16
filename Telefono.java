/*
Esta clase es parte de la principal 
Este programa esta hecho por Lopez Sandoval Mariana
*/

//Librerias
import java.util.Scanner;

//Clase
public class Telefono{
    //Objetos
    Scanner entrada = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
    Scanner entradaT2 = new Scanner(System.in);
    Scanner entradaT = new Scanner(System.in);
//Variables 

	private int  resultado, opcion, aumento,  minutos;
	private double credito, tucel;
	

    public void menuC(){
        System.out.println("COMPANIA TELEFONICA");
        System.out.println("selecione la opcion deseada"); 
        System.out.println("1.- registro de cel");
        System.out.println("2.-anadir credito");
        System.out.println("3.- consultar credito"); 
        System.out.println("4.- hacer llamada");
        opcion = entrada.nextInt();
				
			switch(opcion){
				case 1:
				 registro();
				 break;
				case 2:
				 consultar();
				 break;
				case 3:
				  llamada();
				  break;
                
					
				}
    }

	public void registro(){

		System.out.println("Introduce tu numero celular: ");
		tucel = entradaT.nextDouble();
		System.out.println("cuanto saldo tienes");
		credito = entradaT2.nextInt();
	}

	public void consultar(){

		System.out.println("Usted tiene un saldo de:"+credito+"pesos");

	}

	public void llamada(){

		System.out.println("El costo por media hora en cada caso es de:");
        System.out.println("LOCAL A NACIONAL:       $0.5");
        System.out.println("LOCAL A INTERNACIONAL:  $0.6");
        System.out.println("A CELULAR:              $0.2");
		System.out.println("¿Que tipo de llamada quiere realizar?:");
        System.out.println("1. LOCAL A NACIONAL");
        System.out.println("2. LOCAL A INTERNACIONAL");
        System.out.println("3. A CELULAR");
		opcion = entrada.nextInt();
		
		switch(opcion){
			case 1:
                System.out.println("¿De cuantos minutos fue la llamada?: ");
		        minutos = entrada2.nextInt();
				tucel = minutos/60;
                System.out.println("El nuevo saldo a deber es de : " +tucel+"pesos");
				break;
			case 2:
                System.out.println("¿De cuantos minutos fue la llamada?: ");
		        minutos = entrada2.nextInt();
				tucel = minutos/50;
                System.out.println("El nuevo saldo es de: " +tucel+ "pesos");
				break;
			case 3:
                System.out.println("¿De cuantos minutos fue la llamada?: ");
		        minutos = entrada2.nextInt();
				tucel = minutos/150;
                System.out.println("El nuevo saldo es de: " +tucel+ "pesos");
				break;
			
		}
        

	}
}