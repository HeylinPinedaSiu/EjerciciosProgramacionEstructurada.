import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        int intento = 3;
        double lado1;
        double lados2;
        double lado3;

        for(int i=0; i < 3; i++){

       do{
        //pedimos los datos al usuario
        System.out.println("Ingrese la longitud del primer lado");
       lado1 = lector.nextDouble();
       
       //
       if(lado1 <= 0){
        System.out.println("El valor debe ser mayor de 0. Intente de nuevo ");
        //los intentos iran decrementando
        intento--;

       }
       return; 

       while(intento > 0){

        if(intento == 0){
            System.out.println("Error! Supero el numero maximo de intentos. El programa se cerrara");
             return;

            }else{
                intento = 3;
            }}

            do{
                System.out.println("Ingrese la longitud del segundo lado: ");
                lados2 = lector.nextDouble();

                if(lados2 <= 0){
                    System.out.println("El valor ingresado debe ser mayor a 0. Intente de nuevo");
                    //la cantidad de intentoss va ir decrementando
                    intento--;
                } 
                return;

            while (intento > 0){ 

              if(intento == 0 ){
                System.out.println("Error! Supero el numero maximo de intentos el programa se cerrara");
               return;

            }else{
                intento =3;
            } }}
           
            
            do{
                System.out.println("Ingrese la longitud del tercer lado: ");
                lado3 = lector.nextDouble();

                if(lado3 <= 0){
                    System.out.println("El valor ingresado debe ser mayor de 0. Intetnte de nuevo");
                    //los intentos iran disminuyendo
                    intento--;
                }  
                return;
         
         while(intento > 0);

         if(intento == 0){
            System.out.println("Error! supero el numero maximo de intentos. El programa se cerrara");
            return;
         } else{
            intento = 3;
         }
        }
         if(lado1 == lados2 || lados2 == lado3 || lado1 == lado3){
                 //
            if(lado1 == lados2 && lados2 == lado3){
                System.out.println("El Triangulo es Equilatero");
                return;
            }
            //
            if(lado1 == lados2 || lados2 == lado3 || lado1 == lado3){
                System.out.println("El Triangulo es Isosceles");
                return;

                //
            } else{
                System.out.println("El Triangulo es Escaleno");
                return;
            }
         } else{
            System.out.println("No se puede formar un triangulo con todos sus lados proporcionales");
         }
         } 
       
        }
        lector.close();
    }}
