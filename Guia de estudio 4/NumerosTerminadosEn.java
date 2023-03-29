import java.util.Scanner;

public class NumerosTerminadosEn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = input.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = input.nextInt();

        int contador = 0;

        for (int i = a; i <= b; i++) {
            if (i % 10 == 2 || i % 10 == 3 || i % 10 == 6) {
                contador++;
            }
        }

        System.out.println(
                "La cantidad de números en el rango [" + a + ", " + b + "] que terminan en 2, 3 o 6 es: " + contador);
    }
}
