import java.util.Scanner;
public class Ejercicio29 {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);

       //declaramos las variables 
        int Intentos=3;
        int RESIDENCIA;
        int HORAS;
       
        System.out.println("¿En qué tipo de rESIDENCIA vive?");
        System.out.println("1. Apartamento");
        System.out.println("2. Casa");
        System.out.println("3. Dormitorio");
        System.out.println("4.Salir.");
          
       do {
        //declaramos las variables 
        System.out.print("Ingresa una opción: ");
        RESIDENCIA = lector.nextInt();
         

        if (RESIDENCIA <= 0 || RESIDENCIA > 4) {
            Intentos--;
            System.out.println("Opción inválida. Por favor intente nuevamente.");
        }
        
        if (Intentos <= 0) {

            System.out.println("Error! usted alcanzo el límite de Intentos, finalizando el programa.");
            return;
        }
       } while (RESIDENCIA <= 0 || RESIDENCIA > 4);

    
       //pedimos los datos al usuario
       System.out.println("¿Cuántas HORAS está en casa durante el día promedio?");
       System.out.println("1. 18 o más");
       System.out.println("2. 10 - 17");
       System.out.println("3.  8 - 9");
       System.out.println("4. 6 - 7");
       System.out.println("5. 0 - 5");
             
       do {
        //pedimos datos al usuario
        System.out.print("Ingresa una opción: ");
        HORAS = lector.nextInt();
        
        if (HORAS <= 0 || HORAS > 5) {
            Intentos--;
            System.out.println("Opción inválida. Intenta nuevamente.");
        }
        
        if (Intentos <= 0) {
            System.out.println("Has alcanzado el límite de Intentos. Saliendo del programa.");
            return;
        }
       } while (HORAS <= 0 || HORAS > 5);
       

        
        String recomendacion = "";

        
        switch (RESIDENCIA) {
            case 1: 
                switch (HORAS) {
                    case 3: 
                        recomendacion = "Gato";
                        break;
                    default: 
                        recomendacion = "Hamster";
                        break;
                }
                break;
            case 2: 
                switch (HORAS) {
                    case 2: 
                        recomendacion = "Cerdo barrigón";
                        break;
                    case 3: 
                        recomendacion = "Perro";
                        break;
                    default: 
                        recomendacion = "Serpiente";
                        break;
                }
                break;
            case 3: 
                switch (HORAS) {
                    case 1: 
                        recomendacion = "Pez";
                        break;
                    default: 
                        recomendacion = "Granja de hormigas";
                        break;
                }
                break;
            case 4:
                   System.out.println("******Usted ha decidido salir del programa.********");
                break;
        }
        //mostramos resulatdos en pantalla 
        System.out.println("La mascota que le recomiendo es: " + recomendacion);
        
        lector.close();
    }
}
