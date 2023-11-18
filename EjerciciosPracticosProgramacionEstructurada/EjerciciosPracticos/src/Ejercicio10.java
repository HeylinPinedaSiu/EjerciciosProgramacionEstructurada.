import java.util.Scanner;
public class Ejercicio10{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

    //declaramos las variables 
       double a1;
       double a2;
       double porcentajeGrasa;
       double grasaCorporal;
       char genero;
        int intentos = 3;
        double peso;
        double medidaCintura;
        double medidaAntebrazo;
        double medidaCadera;
        double a3;
        double a4;
        double a5;
        double b;
        double porcentajeGrasaCorporal;

        //pedimos al usuario que ingrese los datos 
        System.out.print("Ingrese su genero(F/M): ");
        genero = lector.next().charAt(0); 
       
        //si su genero es masculino 
        if(genero == 'm'){

            //validamos los intentos 
            while (intentos > 0) {

                //pedimos que ingrese su peso en kilogranmos  
            System.out.print("Ingrese su peso corporal en Kilogramos: ");
            peso = lector.nextDouble();

            if (peso > 0) {
                //ingresamos la medida de la cintura y esta tiene que ser mayor a 0
            System.out.print("Ingrese la Medida de su cintura en Centímetros (mayor de cero):");
             medidaCintura = lector.nextDouble();
                    
             //hacemos las operaciones 
            if (medidaCintura > 0) {
             a1 = (peso * 1.082) + 94.42;
             a2 = medidaCintura * 4.15;
             grasaCorporal = peso - (a1 - a2);
            porcentajeGrasa = (grasaCorporal * 100) / peso;
                        
            //mostramso los resultados
             System.out.println("Su porcentaje de grasa corporal es: " + porcentajeGrasa+ "%");
                 return;

            } else {
                //
                     System.out.println("Medida de cintura no válida. Por favor inetente nuevamente.");
                }
                } else {
                    System.out.println("***Peso no válido. Por favor intente  nuevamente***.");
                }
                
                intentos--;
                }
             }
             if (genero == 'f') {

             while (intentos > 0) {
                //pedimos el peso corporal en kilogram
                 System.out.print("Ingrese su peso corporal en Kilogramo:");
                    peso = lector.nextDouble();

                if (peso > 0) {
                 System.out.print("Ingrese la medida de su muñeca en centimetro: ");
                double medidaMuñeca = lector.nextDouble();
                        
                if (medidaMuñeca > 0) {
                System.out.println("Ingrese la medida de su cintura en centimetro:");
                medidaCintura = lector.nextDouble();
                            
                if (medidaCintura > 0) {
                System.out.print("Ingrese la medida de su cadera en centimetro:");
                medidaCadera = lector.nextDouble();
                                
                 if (medidaCadera > 0) {
                 System.out.print("Ingrese la medida de su antebrazo en centimetro:");
                  medidaAntebrazo = lector.nextDouble();

                  //hacemos las operaciones
                if (medidaAntebrazo > 0) {
                a1 = (peso * 0.732) + 8.987;
                a2 = medidaMuñeca / 3.140;
                a3 = medidaCintura * 0.157;
                a4 = medidaCadera * 0.249;
                 a5 = medidaAntebrazo * 0.434;
                b = a1 + a2 - a3 - a4 + a5;
                grasaCorporal = peso - b;
                porcentajeGrasaCorporal = (grasaCorporal * 100) / peso;

                //mostrasmos los resultados en pantalla                        
                System.out.println("Tu porcentaje de grasa corporal es: " + porcentajeGrasaCorporal + "%");
                     
                 } else {
                    System.out.println("***La medida del antebrazo debe ser mayor a cero.***");
                      
                     }

                 } else {
                 System.out.println("*** medida de la cadera debe ser mayor a cero***.");
                      
                 }
                     } else {
                         System.out.println("**La medida de la cintura debe ser mayor a cero.**");
                                
                            }
                    } else {
                            System.out.println("**La medida de la muñeca debe ser mayor a cero***.");
                            
                        }
                    } else {
                        System.out.println("El peso corporal debe ser mayor a cero.");
                        
                    }
                    intentos--;
                }
             }
             
       lector.close(); 
    }
}
