import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double $h, ht, $b, $i, $d, $f;

        System.out.printf("Para calcular seu salário mensal, informe as horas trabalhadas no mês:");
        ht = entrada.nextDouble();
        System.out.println("Informe o valor da hora trabalhada:");
        $h = entrada.nextDouble();
        System.out.printf("Por fim, digite o valor percentual do desconto de INSS:");
        $i = entrada.nextDouble();

        $b = $h * ht;
        $d = ($i / 100) * $b;
        $f = $b - $d;

        System.out.println("Salário bruto: R$"+$b);
        System.out.println("Desconto INSS: R$"+$d);
        System.out.printf("Salário líquido: R$"+$f);

    }
}
