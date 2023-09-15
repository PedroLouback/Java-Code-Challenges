import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);

        int quantidadeServidores = scanner.nextInt();

        int quantidadeBancosDados = scanner.nextInt();

        double custoTotalServidor = (quantidadeServidores * custoPorHoraServidor);
        double custoTotalBancosDados = (quantidadeBancosDados * custoPorHoraBancoDados);
        double custoTotal = (custoTotalServidor + custoTotalBancosDados);

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}