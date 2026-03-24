import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double $hora, horatrab, $bruto, $inss, $desc, $final;

        System.out.printf("Para calcular seu salário mensal, informe as horas trabalhadas no mês:");
        horatrab = entrada.nextDouble();
        System.out.println("Informe o valor da hora trabalhada:");
        $hora = entrada.nextDouble();
        System.out.printf("Por fim, digite o valor percentual do desconto de INSS:");
        $inss = entrada.nextDouble();

        $bruto = $hora * horatrab;
        $desc = ($inss / 100) * $bruto;
        $final = $bruto - $desc;

        System.out.printf("Salário bruto: R$%.2f\n", $bruto);
        System.out.printf("Desconto INSS: R$-%.2f\n", $desc);
        System.out.printf(">>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        System.out.printf("Salário líquido: R$%.2f\n", $final);
        System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

    }
}
