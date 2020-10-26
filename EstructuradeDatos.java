// este trabajo pertenece a 3IV8 Lopez Sandoval Mariana

import java.util.Scanner;

class EstructuradeDatos{

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner digito = new Scanner(System.in);
        Scanner inicio = new Scanner(System.in);
        Scanner iniciacion = new Scanner(System.in);
        Scanner comienzo = new Scanner(System.in);
        
    
        //variables
        long factorial=1;
        int num, edad, socios, valorfinal, f, n, a, b, grados, seleccion, opcion;
        int positivos = 0;
        int negativos = 0;
        int total = 0;
        int pteclado=777;
        int pmouse=560;
        int numtotal;
        char letras,operador;
        
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado, base, altura, radio, area, perimetro, temperatura,teclado,mouse,valor,abono, producto, leer;
    do{

        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Bonos, Descuentos por edad ");
        System.out.println("2.- Convertir un numero decimal a binario ");
        System.out.println("3.- Convercion de temperatura, CELSIUS, KELVINE Y RANKINE. ");
        System.out.println("4.- Numeros positivos y negativos ");
        System.out.println("5.- Tienda ");
        System.out.println("6.- Area y Perimentro de figuras geometricas ");
        System.out.println("7.- Tabla ");
        System.out.println("8.- Factorial ");
        System.out.println("9.- Dibujos en codigos ");
        System.out.println("10.- Figuras huecas en codigos ");
        System.out.println("11.- Patrones en codigos ");
        System.out.println("12.- Diamante en  codigos  ");
        System.out.println("13.- Calculadora ");
        System.out.println("14.- Salir ");


        //asignar la opcion

        opcion = entrada.nextInt();
        seleccion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:

                System.out.println("Ingresa tu bono: ");
                abono = entrada.nextInt();
                System.out.println("Ingresa tu edad");
                edad = entrada.nextInt();
                if (edad >= 65){

                   abono = abono*.6;
                   System.out.println("Su descuento fue del 40% ");
                   System.out.println("Total a pagar: " + abono);
                }
                if (edad <= 21){
                System.out.println("Si tus padres son socios, ingresa 1, si no lo son ingresa 2.");

               socios = entrada.nextInt();

                    switch (socios){
                        case 1: 
                        abono = abono*.55;
                        System.out.println("Su descuento fue del 45% ");
                        System.out.println("El total a pagar es:" + abono);

                        break;
                        case 2:
                        abono = abono*.75;

                        System.out.println("Su descuento fue del 25%");
                        System.out.println("El total a pagar es: " + abono);
                    
                        break;
                        default:
                    }

                }

                 System.out.println("Tu edad es: " + edad); 
                 System.out.println("El total a pagar es: " + abono); 

                break;

            case 2:
            
                    System.out.println("Ingrese un numero positivo");
                    int numero = scanner.nextInt();
                    String binario = "";
                    if (numero > 0) {
                        while (numero > 0) {
                            if (numero % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numero = (int) numero / 2;
                        }
                    } else if (numero == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el numero. Por favor solo ingrese numeros positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                
                break;
            
        
            case 3:

                    System.out.println("Ingrese su temperatura en grados Farenheit");
                    grados = entrada.nextInt();

                    System.out.println("Escoja a que grados quiere convertir ");
                    System.out.println("1.- Celsius ");
                    System.out.println("2.- Kelvine ");
                    System.out.println("3.- Rankine ");

                    f = entrada.nextInt();

                    switch (f){

                        case 1: 
                            valor = (grados-32)*5/9;
                            System.out.println(grados + " farehnheit es igual a " + valor + " en celsius ");
                         break;
                        case 2:
                            valor = ((grados-32)*5/9)+273.15;
                            System.out.println(grados + " farehnheit es igual a " + valor + " en kelvine ");
                         break;
                        case 3:
                           valor = grados+459.67;
                           System.out.println(grados + " farehnheit es igual a " + valor + " en rankine ");
                          break;
                    }      
                break;
                
                     
                
                
                

            case 4:
                System.out.println("Inserte cuantos numeros quiere digitar ");

                total = entrada.nextInt();

                 do{
                        System.out.println("inserte el numero ");

                            numtotal = entrada.nextInt();

                        if(numtotal == 0){
                            positivos = positivos+0;
                        } else { 
                        if(numtotal>0){
                            positivos = positivos +1;
                        }else{
                        negativos = negativos+1;
                         }

                        }

                        total = total-1;

                    }while (total!=0);

                  System.out.println("El total de positivos son: " + positivos);

                  System.out.println("El total de negativos son: " + negativos);


                 
                break;

            case 5:
                 
                     {
                    System.out.println("¿Cuantos teclados lleva? ");
                        teclado = entrada.nextInt();
                    System.out.println("¿Cuantos mouse lleva? ");
                        mouse = entrada.nextInt();
                        producto=(teclado*pteclado)+(mouse*pmouse);
                    System.out.println("Los productos adquiridos son: "+producto);
                        resultado=producto*.16;
                        resultado=producto+resultado;
                    System.out.println("El total de su compra es de: "+resultado);
                     }    
                
                break;

            case 6:
                System.out.println("Seleccione una figura ");
                System.out.println("1: Rectangulo ");
                System.out.println("2: Triangulo ");
                System.out.println("3: Esfera ");
                System.out.println("4: Cilindro ");

                seleccion = entrada.nextInt();

                switch(seleccion){

                    case 1:
                        System.out.println("RECTANGULO ");
                        System.out.println("Ingrese la altura ");
                        altura = entrada.nextDouble();

                        System.out.println("Ingrese la base ");
                        base = entrada.nextDouble();
                        perimetro = (base*2)+(altura*2);
                        area = base * altura;
                        System.out.println("Con los datos proporcionados de la altura: " + altura);
                        System.out.println("y la base: " + base); 
                        System.out.println("El Perimetro del rectangulo es: " + perimetro);
                        System.out.println("El Area del rectangulo es: " + area);

                    break;

                    case 2:
                        System.out.println("TRIANGULO ");
                        System.out.println("Ingrese la altura ");
                        altura = entrada.nextDouble();

                        System.out.println("Ingrese la base ");
                        base = entrada.nextDouble();

                        perimetro = (base*3);
                        area = (base * altura)/2;
                        System.out.println("Con los datos porporcionados de la altura: " + altura);
                        System.out.println("y la base: " + base);
                        System.out.println("El Perimetro del triangulo es: " + perimetro);
                        System.out.println("El Area del triangulo es: " + area);

                    break;

                    case 3:
                        System.out.println("ESFERA ");
                        System.out.println("Ingrese el radio ");
                        base = entrada.nextDouble();

                        area = (3/4)*3.1415926*(base*base*base);

                        System.out.println("Con el dato proporcionado de el radio: " + base);
                        System.out.println("El volumen de la esfera es: " + area);

                    break;

                    case 4:
                        System.out.println("CILINDRO ");
                        System.out.println("Ingrese el radio ");
                        base = entrada.nextDouble();

                        System.out.println("Ingrese la altura ");
                        altura = entrada.nextDouble();

                        area = 3.1415926*base*base*altura;

                        System.out.println("Con los datos proporcionados de el radio: " +base);
                        System.out.println("y de la altura: " +altura);
                        System.out.println("El volumen del cilindro es: " + area);

                    default: 

                     System.out.println("Gracias ");
                }    
 
                break;
            case 7:
                 for(n=1; n<=10; n=n+1){

                 System.out.println(n+" "+(n*10)+" "+(n*100)+" "+(n*1000));
                 }
                break;
                

            case 8:
                System.out.println("Introduce un numero: ");
                num = digito.nextInt();
                    for (int i = num; i > 0; i--) {
                    factorial = factorial * i;
                    }
                System.out.println("El factorial de " + num + " es: " + factorial);

                break;

            case 9:
                 System.out.println("CUADRADO ");
                 System.out.print("Inserta el lado ");
                 n = entrada.nextInt();
                 if(n>=1 && n<=20){
                    for (int i = 1; i<=n; i++){
                        for(int j = 1; j<=n; j++){
                            System.out.print("*  ");
                        }
                    System.out.println(" ");
                    }    
                }else {
                    System.out.println("Error. El dato a ingresar de "
                    + "estar entre 1 y 20"); 
                 
                }

                break;

            case 10: 
                    System.out.println("CUADRADO HUECO como tu ex XD ");
                    System.out.print("Inserta el lado ");
                    n = entrada.nextInt();
            
                    if(n>=1 && n<=20){
                        //linea superior
                       for (int i = 0; i < n; i++){
                    
                         System.out.print(" * ");
                        }
                        System.out.println( );

                        //centro de la forma
                        for(int i = 0; i < n-2; i++){
                          System.out.print(" * ");
                          for(int j = 0; j < n-2; j++){
                           System.out.print("   ");
                          }
                        System.out.println(" * ");   
                        }
                         
                         //linea inferior
                        for (int i = 0; i<n; i++){
                        
                        System.out.println(" * ");
                        }
                        System.out.println( );
                    }else {
                    System.out.println("Error. El dato a ingresar de "
                    + "estar entre 1 y 20");

                    }
            
                break;
            case 11:
                System.out.println("PATRON ");
                System.out.println("Seleccione una figura ");
                System.out.println("1: . ");
                System.out.println("2: * ");
                System.out.println("3: - ");
                
                seleccion = entrada.nextInt();

                switch(seleccion){
                  
                    case 1:
                           System.out.println("Ingresa un numero entre 1 y 20  ");
                           n = entrada.nextInt();
                           if(n>=1 && n<=20){
                               for (int i = 1; i<=n; i++){
                                   for(int j = 1; j<=n; j++){
                                        System.out.print(" . ");
                                    }
                                System.out.println("  ");
                                }    

                                 
                            }
                              
                        break;
                        case 2:
                        System.out.println("Ingresa un numero entre 1 y 20  ");
                           n = entrada.nextInt();
                           if(n>=1 && n<=20){
                                for (int i = 1; i<=n; i++){
                                   for(int j = 1; j<=n; j++){
                                     System.out.print(" * ");
                                    }
                                System.out.println("  ");
                                }    

                            
                            }

                        break;
                        case 3:
                        System.out.println("Ingresa un numero entre 1 y 20  ");
                          n = entrada.nextInt();
                            if(n>=1 && n<=20){
                                for (int i = 1; i<=n; i++){
                                    for(int j = 1; j<=n; j++){
                                     System.out.print(" - ");
                                    }
                                System.out.println(" ");
                                }    

                            
                            }
   
                    }
                    break;

            case 12:
                System.out.print("           *     ");
                System.out.println(" ");
                System.out.print("         *****     ");
                System.out.println(" ");
                System.out.print("       *********     ");
                System.out.println(" ");
                System.out.print("      ***********     ");
                System.out.println(" ");
                System.out.print("      ***********     ");
                System.out.println(" ");
                System.out.print("       *********     ");
                System.out.println(" ");
                System.out.print("         *****   ");
                System.out.println(" ");
                System.out.print("           *     ");
                System.out.println(" ");

                break;

            case 13:


                    System.out.println("CALCULADORA");
                    System.out.print("Ingresar un numero ");
                     a = entrada.nextInt();
                    System.out.print("Ingresar otro numero: ");
                     b = entrada.nextInt();
                    System.out.print("Ingresar que oparacion quieres realizar(-,+,*,/):" );
                    operador = entrada.next().charAt(0);
                    switch(operador){
                        case '-':
                        valorfinal = a-b;
                        System.out.println("La resta es:"  + valorfinal);
                        break;
                        case '+':
                        valorfinal = a+b;
                        System.out.println("La suma es: " + valorfinal);
                        break;
                        case '*':
                        valorfinal = a*b;
                        System.out.println("La multiplicación es: " + valorfinal);
                        break;
                        case '/':
                            if(b!=0){
                              valorfinal = a/b;
                               System.out.println("La división es :" + valorfinal);
                            }
                            else
                            System.out.println("no se puede dividir entre cero");
                        break;
                    default:
                    System.out.println("resultado no valido");
                }
              break;
            
            
            default:
                System.out.println("Gracias por participar ");

        
        }
       System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letras = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letras == 's');

        //System.out.println(letra);

    }
}  

