import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Conta minhaConta = null;

        do {
            System.out.println("\n----------- MENU -----------");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Consultar Conta Cadastrada");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = scanner.nextLine();

                    int numeroAgencia = 1;

                    System.out.println("Escolha o tipo da conta:");
                    System.out.println("[1] Conta Corrente | [2] Conta Poupanca");
                    int tipoConta = scanner.nextInt();

                    if (tipoConta == 1) {
                        minhaConta = new ContaCorrente(nomeTitular, numeroAgencia, 0, 200);
                        System.out.println("Conta Corrente criada!");
                    } else if (tipoConta == 2) {
                        minhaConta = new ContaPoupanca(nomeTitular, numeroAgencia, 0);
                        System.out.println("Conta Poupança criada!");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    if (minhaConta != null) {
                        minhaConta.exibirDados();
                    } else {
                        System.out.println("Nenhuma conta cadastrada ainda.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}

