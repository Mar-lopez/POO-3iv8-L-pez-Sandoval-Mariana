  
/*
Esta clase es parte de la principal 
Este programa esta hecho por Lopez Sandoval Mariana
*/

//Librerias
import java.util.Scanner;

//Clase
public class Anyos{
    //Objeto del metodo Scanner
    Scanner otravez = new Scanner(System.in);
    Scanner entrada = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
    Scanner entrada3 = new Scanner(System.in);
	//Variables 
	
	
	private int  hoy, anyo, edad=0;
    private char letra2;
    
   public void menuA(){
        
        do{
            System.out.print("CUANTOS ANYOS TIENES");
            
            System.out.println("AÑO DE NACIMIENTO ");
            anyo = entrada2.nextInt();
            System.out.println("QUE ANYO ES ");
            hoy = entrada.nextInt();
            edad = hoy-anyo;
            if(edad>18){
                System.out.println("TE VES MAS JOVEN");
            }
            else{
                
                System.out.println("Usted tiene "+edad+ " anyos");
            }
            System.out.println("Escribe una s si quieres volver a repetir este programa");
            letra2=otravez.next().charAt(0);
        } while(letra2=='s');

    }

}