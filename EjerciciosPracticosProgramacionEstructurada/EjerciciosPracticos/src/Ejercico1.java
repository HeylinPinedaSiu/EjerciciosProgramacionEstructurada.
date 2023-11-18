import java.util.Scanner;
public class Ejercico1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Declaramos las variables 
        byte edad;
        char weapons;
        char genero;

        //pedimos los datos de entrada
        System.out.println("Ingrese su edad: ");
        edad =lector.nextByte();
 
        /* decimos en if que la edad no puede ser menor de 18 */
        if(edad < 18){
            System.out.println("Es menor de edad no puiede pasar: ");
            //indicamos salir del ciclo con un system exit
            System.exit(0);
        }

        //declaramos una variable i la cual debe ser menor que 3 y esta ira incrementando
        for(int i = 0; i <3; i++){
         System.out.println("Ingrese su genero (femenino / masculino)");
         genero = lector.next().charAt(0);

         // su genero es femenina
         if(genero == 'F'){

            /*si se cumple la condicion y si su edad es mayor de 18 entonces puede entrar 
            y consumir bebidas alcoholicas*/
            if(edad <= 20){ 

                System.out.println("Bienvenida puede pasar y consumir bebidas alcoholicas: ");

            } else{
            /*Si no puede pasar y no conssumir bebidas alcoholicas */
            System.out.println("Bienvenida puede pasar, pero no podra consumir bebidas alcoholicas");

         }
        } 
        //si su genero es masculino
         if(genero == 'm'){
          System.out.println("¿Porta armas? (yes/ not)");
          weapons = lector.next().charAt(0);

         if (weapons == 's'){
            System.out.println("***No se permite portar armas en el local***");
         } 

         if( edad <= 20){

            /*Si se cumple la condicion como su edad 
            es menor de 20 no podra consumir bebidas alcoholicas */
            System.out.println("Bienvenido puede pasar, pero no podra consumir bebidas alcoholicas");

         }else{
         /*si no se cumple la condicion
          entonces podra tomar bebidas alcolicas*/
          System.out.println("Bienvenido puede pasar y tomar bebidas alcolicas: ");
         }
         } else{
            System.out.println("*****Opcion invalida.Verifique lo que ingreso******");

         }
}
    lector.close();
}
}