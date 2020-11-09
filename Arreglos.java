//Arreglos
//Lopez Sandoval Mariana
//libreria

import java.util.*;

//clase
public class Arreglos{
    //variables globales 
    int numeros[] = new int [10];
    int opcion; 
    float Promedio = 0; 
    char repetir; 
    Arreglos trial = new Arreglos();
    Scanner input = new Scanner(System.in);
    
    public void main(String args[]){
       
        
            do{
            
                trial.menu();

                System.out.println("Desesa repetir el programa ingrese s: ");
                repetir = input.next().charAt(0);
            }while(repetir=='s');
            }
           //Método menu para la ejecución
        public void menu(){
        Scanner input = new Scanner(System.in);

         int seleccion;
        
         System.out.println("ARREGLOS ");           
         System.out.println("Este programa fue hecho por: ");
         System.out.println("LOPEZ SANDOVAL MARIANA ");
         System.out.println("Ingresar la ocion deseada:");
         System.out.println("1.- Promedio de numeros positivos y negativos ");
         System.out.println("2.- Promedio de numeros en posiciones pares ");
         System.out.println("3.- Calificaciones ");
         System.out.println("4.- Matrices ");
           opcion = input.nextInt();

        
        switch(opcion){
            case 1:
                PromePOyNE();
                break;
            case 2:
                PromeA();
                break;
            case 3:
                Calificaciones();
                break;
            case 4:
                MatriceS();
                break;
            default:
                System.out.println("ERROR EL VALOR ES INACEPTABLE ");
            
        }
        

        
    }

    public void PromePOyNE(){
        Scanner input = new Scanner(System.in);
         float PromedioMAS = 0;
         float PromedioMENOS = 0;
         int CalificacionMAS = 0;
         int CalificacionMENOS = 0;

        for(int i = 0; i < numeros.length;i++){
            System.out.println("PROMEDIOS DE POSITIVOS Y NEGATIVOS ");
            System.out.println("Introducir un valor " +(i+1)+ ":");
            numeros[i] = input.nextInt();

            if(numeros[i] < 0){
                PromedioMENOS += numeros[i];
                CalificacionMENOS++;
            }else{
                PromedioMAS += numeros[i];
                CalificacionMAS++;
            }
        }

        PromedioMAS = PromedioMAS/CalificacionMAS;
        PromedioMENOS = PromedioMENOS/CalificacionMENOS;

        System.out.println(String.format("El promedio Positivo es: %.1f", PromedioMAS));
        System.out.println(String.format("El promedio Negativo es: %.1f", PromedioMENOS));
    }

    public void PromeA(){
        Scanner entrada = new Scanner(System.in);
        int i;
        double PPar = 0;
        System.out.println("PROMEDIO DE PARES");
        System.out.println("Ingrese diez numeros enteros");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                PPar = PPar + numeros[i];
            }
        }

        System.out.println("Promedio de los pares " + PPar/5 + ".");              
    }


    public void Calificaciones(){

        Scanner input = new Scanner(System.in);

        int Panzaron = 0;
        int NOPanzaron = 0;
        int ESTUDIO = 0;
        int BYE = 10;
        int HELLO = 0;

        for(int i = 0; i < numeros.length;i++){
            System.out.println("CALIFICACIONES");
            System.out.println("Introduce un valor "+(i+1)+":");
            numeros[i] = input.nextInt();
            Promedio += numeros[i];

            if(numeros[i] > HELLO){
                HELLO = numeros[i];
            }
            if(numeros[i] < BYE){
                BYE = numeros[i];
            }
            if(numeros[i] >= 6){
                Panzaron++;
            }
        }

        NOPanzaron = 10 - Panzaron;
        Promedio /= 10;

        for(int i = 0; i < 10;i++){
            System.out.println(String.format("La calificacion numero %d es: %d",i+1,numeros[i]));
            if(numeros[i] > Promedio){
                ESTUDIO++;
            }
        }

        System.out.println(String.format("El Promedio del Grupo es: %.1f",Promedio));
        System.out.println(String.format("La Calificacion MAS ALTA es: %d",HELLO));
        System.out.println(String.format("La Calificacion MAS BAJA es: %d",BYE));
        System.out.println(String.format("Las Cantidad de calificaciones superiores al promedio es de: %d",ESTUDIO));
        System.out.println(String.format("Los Alumnos que SI pasaron  son: %d",Panzaron));
        System.out.println(String.format("Los Alumnos que NO pasaron son: %d",NOPanzaron));

    }
    public void MatriceS(){

        Scanner entrada = new Scanner(System.in);

        int aa1[][] = new int [3][3];
        int bb2[][] = new int [3][3];
        int cc3[][] = new int [3][3];
        int i, j;

        System.out.println("Matriz 1");
        System.out.println("Datos ");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
            System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
            aa1[i][j] = entrada.nextInt();
            }
        }
            
        System.out.println("Matriz 2");
        System.out.println("\nDatos ");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
            System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
            bb2[i][j] = entrada.nextInt();
            }
        }

        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
            cc3 [i][j] = aa1[i][j] + bb2[i][j];
            }
        }
    
        
        System.out.println("SUMA");
        System.out.println("DE LA");
        System.out.println("MATRIZ RESULTANTE es: ");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
            System.out.print(cc3[i][j] + " ");
            }
        }   

        //obtiene el tamaño de la matriz
            System.out.println();     
    }
}