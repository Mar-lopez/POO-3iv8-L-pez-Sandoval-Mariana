/*
Esta clase es parte de la principal 
Este programa esta hecho por Lopez Sandoval Mariana
*/

//Librerias
import java.util.Scanner ;

//Clase

public class Formulas{
    //objeto del metodo Scanner
    Scanner entrada = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);

    //variables 
    private int base, altura, opcion; 
    private double resultadoA, resultadoB;
    private char letra;

    public void menuB(){
        System.out.println("Figuras");
        System.out.println("Ingresa la opcion que quieres saber");
        System.out.println("Areas  y Perimetros"); 
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("CIRCULO");
                System.out.println("Ingresa el valor de la radio");
                 base = entrada.nextInt();
                 resultadoA = 3.1416*base*base;
                 resultadoB = 3.1416*(2*base);

                System.out.println("El area del CIRCULO es de: "+resultadoA);
                System.out.println("El perimetro del CIRCULO es de: "+resultadoB);
                 
                 break;
            case 2:
                System.out.println("CUADRADO");
                System.out.println("Ingresa el valor del lado");
                 base = entrada.nextInt();
                 resultadoA = base*base;
                 resultadoB = 4*base;

                System.out.println("El area del CUDRADO es de: "+resultadoA);
                System.out.println("El perimetro del CUADRADO es de: "+resultadoB);
                 
                 break;
            case 3:
                System.out.println("RECTANGULO");
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();
                System.out.print("Ingresa el valor de la altura");
                altura = entrada2.nextInt();
                resultadoA = altura*base;
                resultadoB = (2*altura)+(2*base);

                System.out.println("El area del RECTANGULO es de: "+resultadoA);
                System.out.println("El perimetro del RECTANGULO es de: "+resultadoB);
                 
                 break;
            case 4:
    
                System.out.println("TRIANGULO");
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.print("Ingresa el valor de la altura");
                altura = entrada2.nextInt();
                resultadoA = (base*altura)/2;
                resultadoB = base*3;

                System.out.println("El area del TRIANGULO es de: "+resultadoA);
                System.out.println("El perimetro del TRIANGULO es de: "+resultadoB);
        }
        
        
    }
            
}