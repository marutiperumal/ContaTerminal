import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
 Scanner sc = new Scanner(System.in);

        // Inicializar saldo da conta
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            // Exibir menu de opções
            System.out.println("Bem-vindo ao Banco!");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Ler opção do usuário
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Consultar Saldo
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;

                case 2:
                    // Depositar
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Você depositou R$ %.2f%n", deposito);
                    } else {
                        System.out.println("Valor de depósito inválido!");
                    }
                    break;

                case 3:
                    // Sacar
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Você sacou R$ %.2f%n", saque);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        System.out.println("Valor de saque inválido!");
                    }
                    break;

                case 4:
                    // Sair
                    continuar = false;
                    System.out.println("Obrigado por usar nosso banco. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println(); // Linha em branco para melhor legibilidade
        }

        sc.close();
    }
}


