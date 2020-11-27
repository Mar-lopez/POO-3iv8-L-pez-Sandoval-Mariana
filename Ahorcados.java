/*Este juego fue hecho por 
(LOPEZ SANDOVAL MARIANA), MAR PARA LOS AMIGOS 
*/
//librerias 
import java.util.*;
import java.io.IOException;
import static java.lang.System.*;
public class Ahorcados extends Herencia{


    // variables globales 
    Scanner entrada = new Scanner(System.in);
    int oportunidades=6, X=0;  
    boolean V=true, z=true;
    boolean aviso=false; 
    int otravez=0;
    String palabra;
    

    public void mostrarJuego(){
        //palabra 

        System.out.println("JUGADOR" + nombre1);
        System.out.println("Ingrese una palabra"); 
        palabra = entrada.nextLine(); 
        System.out.println("\n\n"); 
        String letra[]=new String[6]; 

        //separando de las letras 
        String [] letras = palabra.split(""); 
        String oportunidades[] = new String[letras.length];
        String entrada[] = new String[letras.length]; 

        //longitud de las letras (a variable X)
        X=letras.length; 

        for(int i=0;i<25;i++){
                System.out.println("");
        }

        for(int i=0;i<letras.length;i++){ 
                 oportunidades[i]="_";
        }

        while(oportunidades>0)
        {
            System.out.println("JUGADOR" +nombre2 );
            System.out.println("Ingrese una letra"); 
            for(int i=0;i<letras.length;i++){ 
                     System.out.print(oportunidades[i]); 
            } 
                System.out.println(""); 
                letra[0]=entrada.nextLine(); otravez=0;boolean aviso=true; 
                    for(int i=0;i<letras.length;i++){ 
                 z=true;
            }
            if(letras[i].equals(letra[0])){
                if(!oportunidades[i].equals(letra[0])){ 
                     oportunidades[i]=letra[0];
                     V=false; 
                     otravez++; entrada[i]=letras[0];  

                }else{aviso=false;V=false;} 
            }
        } 
            if(aviso==false){
                System.out.println(" Aviso:YA LA HABIAS PUESTO, MEJOR PRUEBA CON OTRA");
            } 
               aviso=true;        
            if(V==true){ 
               oportunidades--; 
            } 
            else{X=X-otravez;} 

            System.out.println(" \nQuedan: "+oportunidades+" oprtunidades"); 
             
            muertito(oportunidades); 
            
            if(oportunidades ==0){ 
                System.out.println("\nsuerte para la proxima \n PERO NO LLORES ERA UNA PALABRA DIFICIL" +palabra );
            } 
            if(X<=0){
                System.out.println("\n Tu tiene buena suerte, GANASTE"); oportunidades==0;}
                 V=true; otravez=0;
            }
            
        

        static void muertito(int V){ 
            if(V==6){
                
                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i            ");
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 

            }
            if(V==5){
                
                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 

            }
            if(V==4){

                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i        s   "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 

            }
            if(V==3){
                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i        s   "); 
                System.out.println("    i      l   l "); 
                System.out.println("    i     d     b"); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 
           
            }
            if(V==2){
                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i        s   "); 
                System.out.println("    i      l t l "); 
                System.out.println("    i     d  l  b"); 
                System.out.println("    i        l   "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 
           

            }
            if(V== 1){
                
                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i        s   "); 
                System.out.println("    i      l t l "); 
                System.out.println("    i     d  l  b"); 
                System.out.println("    i        l   "); 
                System.out.println("    i      j     "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 

            }
            if(V==0){

                System.out.println("    kkkkkkkkkk   "); 
                System.out.println("    i        i   ");
                System.out.println("    i        i   "); 
                System.out.println("    i        0   ");
                System.out.println("    i        s   "); 
                System.out.println("    i      l t l "); 
                System.out.println("    i     d  l  b"); 
                System.out.println("    i        l   "); 
                System.out.println("    i      j   g "); 
                System.out.println("    i            "); 
                System.out.println("    i            "); 
                System.out.println("wwwwwwwwwwwwwwww "); 

            }
    }  
        

    
} 
