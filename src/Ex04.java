import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        double $qw, $res, $desc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular o valor da conta de luz de uma residência, informe o valor do salário mínimo atual:");
        $qw = entrada.nextDouble() / 7 / 100;

        System.out.println("Por fim, informe quantos quilowatts foram gastos no mês:");
        $res = entrada.nextDouble() * $qw;
        $desc = $res * 0.9;

        System.out.printf("Valor do quilowatt: %.2f\n", $qw);
        System.out.printf("Valor bruto da conta: R$%.2f\n", $res);
        System.out.printf("Valor com desconto de 10%%: R$%.2f\n", $desc);

    }
}
