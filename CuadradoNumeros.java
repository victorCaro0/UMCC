import java.util.Scanner;

public class CuadradoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (o escriba 'salir' para terminar): ");
            String entrada = input.nextLine();

            if (entrada.equals("salir")) {
                break;
            }

            try {
                int num = Integer.parseInt(entrada);
                int cuadrado = num * num;
                System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero o escribir 'salir'.");
            }
        }

        System.out.println("¡Hasta luego!");
    }
}