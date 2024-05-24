import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        //Iniciamos las entradas por consola con la funcion Scanner
       Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicacion Calculadora ****");
        //Mostramos el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        //Elegir operacion que realizaremos
        System.out.print("¿Operacion a realizar?");
        var operacion = Integer.parseInt(consola.nextLine());
        //Revisar que este dentro de las opciones dadas
        if(operacion >= 1 && operacion <= 4){
            System.out.print("Proporciona valor operando1: ");
            var operando1 = Integer.parseInt(consola.nextLine());
            System.out.print("Proporciona valor operando2: ");
            var operando2 = Integer.parseInt(consola.nextLine());
            int resultado;
            switch (operacion){
                case 1 -> {//Suma
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la suma es: " + resultado+ ".");
                }
                case 2 -> {//Resta
                    resultado = operando1 - operando2;
                    System.out.println("El resultado de la resta es: "+resultado+".");
                }
                case 3 -> {//Multiplicacion
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la multiplicacion es: "+resultado+".");
                }
                case 4 -> {//Division
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de la division es: "+resultado+".");
                }
                default -> System.out.println("Opcion erronea: " + operacion);
            }
        } else if (operacion == 5){// Salir
            System.out.println("Hasta prono...");
        } else {
            System.out.println("Opcion erronea: "+ operacion);
        }
    }
}
