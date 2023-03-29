import java.util.Scanner;

public class ConteoRegresivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número para comenzar el conteo regresivo: ");
        int num = input.nextInt();

        while (num >= 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("Kboom!!!!!!");
    }
}