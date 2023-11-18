import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
        double TOTAL = 0;
        double Cprecio;
        int intentos=3;
        int opciones;

        //Mostramos el menu de opcionesiones 
        System.out.println("***** Bienvenidos a McDonald's ********");
        System.out.println("***Menu:****");
        System.out.println("Combo 1: Hamburguesa Big Mac + Papas + Coca-Cola - $8.49");
        System.out.println("Combo 2: Hamburguesa Quarter Pounder + Nuggets + Sprite - $10.00");
        System.out.println("Combo 3: Cheeseburger + Papas + Agua - $7.00");
        System.out.println("Combo 4: Hamburguesa McChicken + Ensalada + Coca-Cola - $8.00");
        System.out.println("Combo 5: Hamburguesa Filet-O-Fish + Nuggets + Sprite - $8.99");
        System.out.println("Combo 6: Hamburguesa Cheeseburger + Papas + Agua - $5.99");
        System.out.println("Combo 7: Hamburguesa Big Mac + Sundae + Coca-Cola - $9.99");
        System.out.println("Combo 8: Hamburguesa Quarter Pounder + McFlurry + Sprite - $10.50");
        System.out.println("Combo 9: Cheeseburger + Apple Pie + Agua - $6.00");
        System.out.println("Combo 10: Hamburguesa McChicken + Ensalada + Agua - $7.49");
        System.out.println("11.Salir");

           do {
            //pdimos los datos al usuario 
          System.out.print("Ingresa el combo que quiere agregar a la orden: ");
         opciones = lector.nextInt();
        
        if (opciones <= 0 || opciones > 11) {
            intentos--;
            System.out.println("opcionesión inválida. Por favor intente nuevamente.");
        }
        
        if (intentos <= 0) {
            System.out.println("usted  alcanzo el límite de intentos, finalizando el programa.");
            return;
        }
        //validamos a cantidad de opcionesiones 
        } while (opciones <= 0 || opciones > 11);
        

            switch (opciones) {
                case 1:

                    Cprecio = 8.49;
                    TOTAL += Cprecio;
                    System.out.println("Combo 1 - Hamburguesa Big Mac + Papas + Coca-Cola agregado a la orden.");
                    break;

                case 2:

                    Cprecio = 10.00;
                    TOTAL += Cprecio;
                    System.out.println("Combo 2 - Hamburguesa Quarter Pounder + Nuggets + Sprite agregado a la orden.");
                    break;

                case 3:
                    Cprecio = 7.00;
                    TOTAL += Cprecio;
                    System.out.println("Combo 3 - Cheeseburger + Papas + Agua agregado a la orden.");
                    break;

                case 4:
                    Cprecio = 8.00;
                    TOTAL += Cprecio;
                    System.out.println("Combo 4 - Hamburguesa McChicken + Ensalada + Coca-Cola agregado a la orden.");
                    break;

                case 5:
                    Cprecio = 8.99;
                    TOTAL += Cprecio;
                    System.out.println("Combo 5 - Hamburguesa Filet-O-Fish + Nuggets + Sprite agregado a la orden.");
                    break;

                case 6:
                    Cprecio = 5.99;
                    TOTAL += Cprecio;
                    System.out.println("Combo 6 - Hamburguesa Cheeseburger + Papas + Agua agregado a la orden.");
                    break;

                case 7:
                    Cprecio = 9.99;
                    TOTAL += Cprecio;
                    System.out.println("Combo 7 - Hamburguesa Big Mac + Sundae + Coca-Cola agregado a la orden.");
                    break;

                case 8:
                    Cprecio = 10.50;
                    TOTAL += Cprecio;
                    System.out.println("Combo 8 - Hamburguesa Quarter Pounder + McFlurry + Sprite agregado a la orden.");
                    break;

                case 9:
                    Cprecio = 6.00;
                    TOTAL += Cprecio;
                    System.out.println("Combo 9 - Cheeseburger + Apple Pie + Agua agregado a la orden.");
                    break;

                case 10:
                    Cprecio = 7.49;
                    TOTAL += Cprecio;
                    System.out.println("Combo 10 - Hamburguesa McChicken + Ensalada + Agua agregado a la orden.");
                    break;
                    
                 case 11:
                    System.out.println("Salir");
                    break;
            }
 
            //mostramos los resultados en patantalla 
              System.out.println("*****Detalle de la factura:********");
              System.out.println("Tipo de Cambio  de dollar C$ 36");
              System.out.println("TOTAL a pagar en: dolares " + TOTAL);
              System.out.println("TOTAL a pagar en: Cordobas " + TOTAL*36);
        
       
      
        lector.close();
    }
}  
  
