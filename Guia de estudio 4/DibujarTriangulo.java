import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la longitud de un lado del triangulo: ");
        int longitud = input.nextInt();

        // Triangulo rectangulo
        System.out.println("Triangulo rectangulo:");
        for (int i = 1; i <= longitud; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Triangulo isosceles
        System.out.println("Triangulo isosceles:");
        for (int i = 1; i <= longitud; i++) {
            for (int j = longitud - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}