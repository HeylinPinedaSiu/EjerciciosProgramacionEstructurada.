import java.util.Scanner;
public class Ejercicio3{
    
    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

    //Declaramos las variables a utilizar
    int  Cajas= 24;
    int  CajasDeContenedor = 75;
    int Rosquillas = 0;
    int intentos=3;

    /*int rosquillasCajas;
    int rosquillasSobrantes;
    int Contenedores;
    int cajasSobrantes;*/



    //validamos los intentos para la cantidad de rosquillas 
      while(intentos > 0 ){

        //pedimos los datos al usuario
      System.out.print("Ingrese la cantidad de rosquillas: ");
      Rosquillas = lector.nextInt();

      //si se cumple la condicion y rosquillas es mayor a 0 entonces aplica el return
      if(Rosquillas > 0 ){
        return;

      }else{

        //sino la cantidad de intentos van  a ir disminuyendo 
         intentos--;

        System.out.println("El numero de rosquillas debe ser mayor que cero.");
        }
      } 

      //hacemos las operaciones
      /*Declaramos las variables rosquillascajas, rosquillas sobrantes, contenedores, 
      cajas sobrantes  para poder usarlas en las respectivas operaciones */

      int  rosquillasCajas = (Rosquillas / Cajas);
      int  rosquillasSobrantes = ( Rosquillas % rosquillasCajas);
      int  Contenedores = (rosquillasCajas / CajasDeContenedor);
      int cajasSobrantes = rosquillasCajas % CajasDeContenedor;

     //mostramos los resultados 
    System.out.println("Numero de cajas necesarias: " + rosquillasCajas);
    System.out.println("Numero de rosquillas sobrantes: " + rosquillasSobrantes);
    System.out.println("Numero de contenedores: "+ Contenedores);  
    System.out.println("Numero de cajas sobrantes: " + cajasSobrantes);                   
    
       lector.close();
 }
  
} 
