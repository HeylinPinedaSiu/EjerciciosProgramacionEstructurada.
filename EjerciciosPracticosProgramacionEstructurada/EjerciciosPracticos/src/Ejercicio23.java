import java.util.Scanner;
public class Ejercicio23{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //delcaramos las  variables 
        int intentos = 3;
        int OPCIONES;
        boolean SEGUIR = true;
        int DIMENSIONES;
        double v_1_x;
         double  v_1_y;
         double v_1_z;
        double v_2_x;
        double  v_2_y;
        double  v_2_z;


            while (SEGUIR){
                //peddimos los datos al usuario 
            System.out.print("Ingrese la dimensión de los vectores (2D o 3D):");
            DIMENSIONES = lector.nextInt();

            System.out.print("Ingrese las coordenadas del primer vector x:");
            v_1_x = lector.nextDouble();

            System.out.print("Ingrese las coordenadas del primer vector y:");
            v_1_y = lector.nextDouble();

            if (DIMENSIONES == 3) {
                  System.out.print("Ingrese las coordenadas del primer vector z:");
                v_1_z = lector.nextDouble();

            } else {
                v_1_z = 0;
            }

            System.out.print("Ingrese las coordenadas del segundo vector x:");
            v_2_x = lector.nextDouble();

            System.out.print("Ingrese las coordenadas del segundo vector y:");
            v_2_y = lector.nextDouble();
            
            if (DIMENSIONES == 3) {
                 System.out.print("Ingrese las coordenadas del segundo vector z:");
                v_2_z = lector.nextDouble();
            } else {
                v_2_z = 0;
            }

            /*mostrasmos el enu de operaciones */
            System.out.println("Ingrese la operación que desea realizar:");
            System.out.println("1. Suma de vectores");
            System.out.println("2. Resta de vectores");
            System.out.println("3. Opuesto de un vector");
            System.out.println("4. Producto de un escalar por un vector");
            System.out.println("5. Producto punto (escalar) entre vectores");
            System.out.println("6. Determinar si son vectores paralelos");
            System.out.println("7. Determinar si son vectores ortogonales");
            System.out.println("8. Determinar la proyección de un vector sobre otro vector");
            System.out.println("9. Producto vectorial (cruz) entre vectores");
            System.out.println("10.Salir");
        
            do {
                System.out.print("Ingresa una OPCIONESión: ");
                OPCIONES = lector.nextInt();
                
                if (OPCIONES <= 0 || OPCIONES > 10) {
                    intentos--;
                    System.out.println("OPCIONESión inválida. Intenta nuevamente.");
                }
                
                if (intentos <= 0) {
                    System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
                    return;
                }
               } while (OPCIONES <= 0 || OPCIONES > 10);

            switch (OPCIONES) {
                case 1:
                    double sumaX = v_1_x + v_2_x;
                    double sumaY = v_1_y + v_2_y;
                    double sumaZ = v_1_z + v_2_z;
                    System.out.println("La suma de los vectores es: (" + sumaX + ", " + sumaY + ", " + sumaZ + ")");
                    break;
                case 2:
                    double restaX = v_1_x - v_2_x;
                    double restaY = v_1_y - v_2_y;
                    double restaZ = v_1_z - v_2_z;
                    System.out.println("La resta de los vectores es: (" + restaX + ", " + restaY + ", " + restaZ + ")");
                    break;
                case 3:
                    double opuestoX = -v_1_x;
                    double opuestoY = -v_1_y;
                    double opuestoZ = -v_1_z;
                    System.out.println("El opuesto del vector es: (" + opuestoX + ", " + opuestoY + ", " + opuestoZ + ")");
                    break;
                case 4:
                    System.out.print("Ingrese el escalar:");
                    double escalar = lector.nextDouble();
                    double productoEscalarX = escalar * v_1_x;
                    double productoEscalarY = escalar * v_1_y;
                    double productoEscalarZ = escalar * v_1_z;
                    System.out.println("El producto del escalar por el vector es: (" + productoEscalarX + ", " + productoEscalarY + ", " + productoEscalarZ + ")");
                    break;
                case 5:
                    double productoPunto = v_1_x * v_2_x + v_1_y * v_2_y + v_1_z * v_2_z;
                    System.out.println("El producto punto entre los vectores es: " + productoPunto);
                    break;
                case 6:
                    boolean paralelos = (v_1_x / v_2_x == v_1_y / v_2_y) && (v_1_y / v_2_y == v_1_z / v_2_z);
                    System.out.println("Los vectores son paralelos: " + paralelos);
                    break;
                case 7:
                    boolean ortogonales = (v_1_x * v_2_x + v_1_y * v_2_y + v_1_z * v_2_z) == 0;
                    System.out.println("Los vectores son ortogonales: " + ortogonales);
                    break;
                case 8:
                    double proyeccionX = (v_1_x * v_2_x + v_1_y * v_2_y + v_1_z * v_2_z) / (v_2_x * v_2_x + v_2_y * v_2_y + v_2_z * v_2_z) * v_2_x;
                    double proyeccionY = (v_1_x * v_2_x + v_1_y * v_2_y + v_1_z * v_2_z) / (v_2_x * v_2_x + v_2_y * v_2_y + v_2_z * v_2_z) * v_2_y;
                    double proyeccionZ = (v_1_x * v_2_x + v_1_y * v_2_y + v_1_z * v_2_z) / (v_2_x * v_2_x + v_2_y * v_2_y + v_2_z * v_2_z) * v_2_z;
                    System.out.println("La proyección del vector sobre otro vector es: (" + proyeccionX + ", " + proyeccionY + ", " + proyeccionZ + ")");
                    break;
                case 9:
                    if (DIMENSIONES != 3) {
                        System.out.println("Error: el producto vectorial solo está definido para vectores triDIMENSIONESales.");
                        break;
                    }
                    double productoCruzX = v_1_y * v_2_z - v_1_z * v_2_y;
                    double productoCruzY = v_1_z * v_2_x - v_1_x * v_2_z;
                    double productoCruzZ = v_1_x * v_2_y - v_1_y * v_2_x;
                    System.out.println("El producto vectorial entre los vectores es: (" + productoCruzX + ", " + productoCruzY + ", " + productoCruzZ + ")");
                    break;
                case 10:
                System.out.println("Usted ha decidido salir de este programa.");
                break;
            }

            System.out.print("¿Desea SEGUIR? (S/N)");
            String respuesta = lector.next();
          }
          lector.close();
      }  
}
