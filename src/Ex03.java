import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        double t, vm, l, kml;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular a quantidade de combustível gasta, digite abaixo o tempo de viagem em minutos:");
        t = entrada.nextDouble();
        System.out.println("Informe a velocidade média durante o trajeto:");
        vm = entrada.nextDouble();
        System.out.println("Por fim, informe a relação Km/L do seu automóvel:");
        kml = entrada.nextDouble();

        l = ((t / 60) * vm) / kml;
        System.out.printf("Litro(s) gastos:%.2f", l);

    }
}
