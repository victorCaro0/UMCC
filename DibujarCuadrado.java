import java.util.Scanner;

public class DibujarCuadrado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del lado del cuadrado: ");
        int lado = sc.nextInt();
        
        for(int i=0; i<lado; i++) {
            for(int j=0; j<lado; j++) {
                if(i==0 || i==lado-1 || j==0 || j==lado-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}