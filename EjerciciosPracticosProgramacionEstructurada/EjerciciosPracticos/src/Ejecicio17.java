import java.util.Scanner;
 public class Ejecicio17 {
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
  
      //declaramos las variables
      int intentos = 0;
      int cantidad_1 = 0;
      int cantidad_2 = 0;
      int cantidad_3 = 0;
      int cantidad_4 = 0;
      double valor_1;
      double valor_2;
      double valor_3;
      double valor_4;
      double totaldeventas  ;
      double comision;
      
      while (intentos < 3) {
        //pedios los datos al usuario
        System.out.print("Ingrese la cantidad de artículos 1 vendidos: ");
        cantidad_1 = lector.nextInt();
          
        if (cantidad_1 >= 0) {
           break;
        }
          
        intentos++;

        System.out.println("La cantidad no puede ser negativa. Por favor intente nuevamente: ");
      }
      
      /*Si se cumple a condicion de que los 
      intentos debe ser igual a 3
        * 
        */
      if (intentos == 3 && cantidad_1 < 0) {
      System.out.println("*****Has acabado tu cantidad de  intentos. Programa terminado.******");
       return;

      }
      
      intentos = 0;
      
      while (intentos < 3) {
        
      //pedimos los datos al usuario
       System.out.print("Ingrese la cantidad del 2 articulo vendidos: ");
      cantidad_2 = lector.nextInt();
          
      if (cantidad_2 >= 0) {
         break;
      }
          
       intentos++;
       System.out.println("La cantidad no puede ser negativa.  Por favor intente nuevamente: ");
      }
      
      if (intentos == 3 && cantidad_2 < 0) {
      System.out.println("****Has agotado tus intentos. Programa terminado.***");
        return;
      }
      
      intentos = 0;
      
      while (intentos < 3) {

      //pedimos la cantidad del 3 articulo vendido
      System.out.print("Ingrese la cantidad del 3 articulo vendidos: ");
      cantidad_3 = lector.nextInt();
          
      if (cantidad_3 >= 0) {
           break;
      }
          
        intentos++;
        System.out.println("La cantidad no puede ser negativa. Por favor intente nuevamente: " );
      }
      
      if (intentos == 3 && cantidad_3 < 0) {
       System.out.println("****Has agotado tus intentos. Programa terminado.***");
       return;
      }
      
      intentos = 0;
      
      while (intentos < 3) {
      //pedimos las cantidad deo 4 articulo
      System.out.print("Ingrese la cantidad del 4 articulo vendido: ");
        cantidad_4 = lector.nextInt();
          
        if (cantidad_4 >= 0) {
             break;
         }
          
        intentos++;
        System.out.println("La cantidad no puede ser negativa. Por favor intente nuevamente: " );
      }
      
      if (intentos == 3 && cantidad_4 < 0) {
        System.out.println("****Has agotado tus intentos. Programa terminado.***");
         return;
      }
      
      //hacemos las debidas operaciones 
      valor_1 = 239.99;
      valor_2 = 129.75;
      valor_3 = 99.95;
      valor_4 = 350.89;
      

     totaldeventas  = cantidad_1 * valor_1 + cantidad_2 * valor_2 + cantidad_3 * valor_3 + cantidad_4 * valor_4;
     comision = totaldeventas  * 0.09 + 200;
  
     //mostramos los resultados
      System.out.println("Ingresos del vendedor: " + comision);

      lector.close();
    }
  }
