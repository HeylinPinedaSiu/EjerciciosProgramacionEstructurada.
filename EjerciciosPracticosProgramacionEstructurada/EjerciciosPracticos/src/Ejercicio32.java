import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Declaramos las variables 
        int Numero1;
        int Numero2;
        int sumaDePares = 0;
        boolean esnumeroprimo;
        int sumaDivisores = 0;
        int sumadeCuadradosImpares = 0;


    do {
        //pedimos los datos del primer numero
     System.out.print("Ingrese el primer número entero: ");
     Numero1 = lector.nextInt();

    } while (Numero1 < 0);

    do {
            //pedi os los datos del segundo numero 
     System.out.print("Ingrese el segundo número entero: ");
     Numero2 = lector.nextInt();

    } while (Numero2 < 0);

     if (Numero1 >= Numero2) {
     System.out.println("****El primer número debe ser menor que el segundo****.");
     return; 
    }

   System.out.println("Números impares entre " + Numero1 + " y " + Numero2 + ":");

   for (int i = Numero1; i <= Numero2; i++) {
     if (i % 2 != 0) {

         System.out.println(i);
         sumadeCuadradosImpares += i * i;
     }
   }
   System.out.println("Suma de los cuadrados de los números impares: " + sumadeCuadradosImpares);

   System.out.println("Números perfectos entre " + Numero1 + " y " + Numero2 + ":");
   for (int i = Numero1; i <= Numero2; i++) {
   
     for (int j = 1; j < i; j++) {
         if (i % j == 0) {
             sumaDivisores += j;
         }
     }
     if (sumaDivisores == i) {
         System.out.println(i);
     }
 }

 System.out.println("Números primos entre " + Numero1 + " y " + Numero2 + ":");
 for (int i = Numero1; i <= Numero2; i++) {
     esnumeroprimo = true;

     for (int j = 2; j <= Math.sqrt(i); j++) {
         if (i % j == 0) {

             esnumeroprimo = false;
             break;
         }
     }
     if (esnumeroprimo) {
         System.out.println(i);
     }
 }

 System.out.println("Suma de los números pares entre " + Numero1 + " y " + Numero2 + ":");
 
 for (int i = Numero1; i <= Numero2; i++) {
     if (i % 2 == 0) {
         sumaDePares += i;
     }
 }
 System.out.println(sumaDePares);
 lector.close();
        
    }
}
