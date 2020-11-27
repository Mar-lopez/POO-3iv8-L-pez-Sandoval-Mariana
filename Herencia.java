//vamos a crear una clase de persona general para
//los jugadores 
/*Este juego fue hecho por 
(LOPEZ SANDOVAL MARIANA), MAR PARA LOS AMIGOS 
*/

public class Herencia{

    //encapsulamiento
    //para poder proteger el acceso a las variables de la clase
    private String nombre1, nombre2;
    private int edad1, edad2; 

    //ahora vamos crear el constructor
    public Herencia(){

    }

    //acceder a los datos
    public Herencia(String nombre1, String nombre2, int edad1, int edad2){
        
        this.nombre1 = nombre1;
        this.edad1 = edad1;
        this.nombre2 = nombre2;
        this.edad2 = edad2;   
    }
    
    //recibe obtiene
    public String getNombre1(){
        return nombre1;
    }
   //envia u establecer
    public void setNombre1(String nombre1){
        this.nombre1 = nombre1;
    }
     //recibe obtiene
    public int getEdad1(){
        return edad1;
    }
    //envia u establecer
    public void setEdad1(int edad1){
        this.edad1 = edad1;
    }
    
    //recibe obtiene
    public String getNombre2(){
        return nombre2;
    }
   //envia u establecer
    public void setNombre2(String nombre2){
        this.nombre2 = nombre2;
    }
     //recibe obtiene
    public int getEdad2(){
        return edad2;
    }
    //envia u establecer
    public void setEdad2(int edad2){
        this.edad2 = edad2;
    }


}
