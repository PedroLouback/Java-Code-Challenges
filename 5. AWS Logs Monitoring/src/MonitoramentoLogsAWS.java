import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        String servicoMaisLogs = eventosPorServico.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum servico registrado");

        String servicoMenosLogs = eventosPorServico.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum servico registrado");

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, quantidade) -> {
            System.out.println(servico + ":" + quantidade);
        });

        System.out.println("Maior:" + servicoMaisLogs);
        System.out.println("Menor:" + servicoMenosLogs);
    }
}