import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.print("Proporciona valor operando1: ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;
        System.out.println("El resultado es: " + resultado);
    }
}