import java.math.RoundingMode;
import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class victor {

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        double peso, altura, complexion;

        System.out.print("Por favor digite su peso en kg:");
        peso = entrada.nextDouble();

        System.out.println(
                "Declare su estatura en metros\nNOTA:Tenga en cuenta que el valor debe escribirse unido por punto(.) y no por coma (,)");
        altura = entrada.nextDouble();

        complexion = peso / (altura * altura);

        DecimalFormat redondeo = new DecimalFormat("##.#");
        String redondeado = redondeo.format(complexion);

        System.out.println("Su indice de masa corporal es de:" + redondeado);

        if (complexion < 18.5) {
            System.out.println("Usted es una persona delgada");
        }

        else if (complexion > 18.5 && complexion < 24) {
            System.out.println("Usted es una persona con un peso adecuado");
        }

        else {

            System.out.println("Usted es una persona con sobrepeso");

        }

    }
}