import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência (como inteiro)
        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt(); // Espera um número inteiro
        scanner.nextLine(); // Limpar o buffer do scanner

        // Solicita o número da conta (como String para lidar com hífens)
        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = scanner.nextLine(); // Agora é uma string

        // Solicita o nome do titular da conta
        System.out.println("Por favor, digite o nome do titular!");
        String titular = scanner.nextLine();

        // Solicita o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble(); // Espera um número decimal (saldo)

        // Exibe as informações
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);

        scanner.close();
    }
}