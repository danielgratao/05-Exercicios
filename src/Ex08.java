import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, valorfinal;

        System.out.println("Digite um número de 3 dígitos:");
        valor = entrada.nextInt();

        valorfinal = valor % 100;
        valorfinal = valorfinal % 10;
        System.out.println(+valorfinal);
    }
}
