import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x;
        System.out.println("Digite o valor de x na expressão matemática: y = √(³√(x - 0.5)) ");
        x = entrada.nextDouble();
        double y = Math.sqrt(Math.cbrt(x - 0.5));
        System.out.printf("Valor de y =%.3f", y);


    }
}
