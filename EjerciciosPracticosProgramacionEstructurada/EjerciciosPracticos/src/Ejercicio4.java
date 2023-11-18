import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        
        //declaramos las variables 
        double discriminante;
        double g;
        double h;
        double j;
        double raiz;
        double Raiz1;
        double Raiz2;

        //pedimos los datos al usuario
        System.out.print("Ingrese el valor de g(el coeficiente de x²): ");
         g = lector.nextDouble();

         System.out.print("Ingrese el valor de h(el coeficiente de x): ");
         h = lector.nextDouble();
         System.out.print("Ingrese el valor de j(el termino constante): ");
         j = lector.nextDouble();


         //hacemos las devidas opperaciones  para encontrar el discriminante 
         discriminante = (g*g-4*g*j);

         //si se cumple la condicion 

         if(discriminante > 0 ){

            //hacemos las operaciones
            Raiz1 = (-h+ Math.sqrt(discriminante))/(2*g);
            Raiz2 = (-h- Math.sqrt(discriminante))/(2*g);

            System.out.println("****Las Raices son Reales y Diferentes.******");
            System.out.println("Raiz 1: "+Raiz1);
            System.out.println("Raiz 2: "+Raiz2);


            }else if(discriminante == 0){
                 raiz = -h/(2*g);

                 //mostramos resultados 
                 System.out.println("**La ecuacion tiene una sola raiz (repetida)****.");
                 System.out.println("Raiz: " +raiz);

            }else{
                //hacemos ls operaciones
                double parteReal = -h/(2*g);
                double parteImaginaria = Math.sqrt(-discriminante)/(2*g);

                //mostramos resultados
                System.out.println("La Raices son Complejas.");
                System.out.println("Raiz 1: "+ parteReal  + "+" + parteImaginaria + "¡");
                System.out.println("Raiz 2: "+ parteReal + "+" + parteImaginaria + "¡");
                        
            }
       
         lector.close();        
         
    }
}

