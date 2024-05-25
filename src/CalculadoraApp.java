import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        //Iniciamos las entradas por consola con la funcion Scanner
       Scanner consola = new Scanner(System.in);
       while (true) {

           System.out.println("**** Aplicacion Calculadora ****");
//Mostramos el menu
           mostrarMenu();
           try{
           var operacion = Integer.parseInt(consola.nextLine());
           //Revisar que este dentro de las opciones dadas
           if (operacion >= 1 && operacion <= 4) {
               //Ejecutar operacion
              ejecutarOperacion(operacion,consola);
           } else if (operacion == 5) {// Salir
               System.out.println("Hasta prono...");
               break;
           } else {
               System.out.println("Opcion erronea: " + operacion);
           }
           //Imprimimos un salto de linéa antes de repetir el ciclo
           System.out.println();
       }//fin del try
        catch (Exception e){
            System.out.println("Ocurrio un error: "+ e.getMessage());
        }
       }//fin de while
    }//fin de main
    private static void mostrarMenu(){

        System.out.println("""
                   1. Suma
                   2. Resta
                   3. Multiplicacion
                   4. Division
                   5. Salir
                   """);
        //Elegir operacion que realizaremos
        System.out.print("¿Operacion a realizar? ");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {//Suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado + ".");
            }
            case 2 -> {//Resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado + ".");
            }
            case 3 -> {//Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es: " + resultado + ".");
            }
            case 4 -> {//Division
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es: " + resultado + ".");
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }

    }
}//fin de clase
