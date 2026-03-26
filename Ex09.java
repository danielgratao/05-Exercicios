import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, unidade, dezena, centena, valorInvertido;

        System.out.println("Digite um número entre 100-999 dígitos: ");
        valor = entrada.nextInt();

        unidade = valor % 10;
        dezena = valor / 10 % 10;
        centena = valor / 100;
        valorInvertido = unidade * 100 + dezena * 10 + centena;
        System.out.println(+valorInvertido);


    }
}
