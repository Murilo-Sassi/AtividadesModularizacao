import java.util.Scanner;

public class UniparCoins {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SaldoWrapper saldoWrapper = new SaldoWrapper(); // Usando um wrapper para o saldo

        while (true) {
            System.out.println("Escolha uma opção:  1- Adicionar dinheiro  2- Realizar pagamento  3 - Verificar saldo  4- Sair");
            String opcao = scanner.nextLine(); // Captura a opção do usuário
            String resposta = analisarPergunta(opcao, saldoWrapper, scanner); // Passa o saldo wrapper e o scanner
            System.out.println(resposta);

            // Verifica se o usuário deseja sair
            if (opcao.equals("4")) {
                System.out.println("Saindo...");
                break;
            }
        }
        scanner.close(); // Fecha o scanner
    }

    public static String analisarPergunta(String opcao, SaldoWrapper saldoWrapper, Scanner scanner) {
        switch(opcao) {
            case "1":
                System.out.print("Digite o valor que você quer adicionar: ");
                double adicionar = scanner.nextDouble();
                saldoWrapper.saldo += adicionar; // Adiciona o valor ao saldo do wrapper
                scanner.nextLine(); // Limpa a linha do scanner
                return "Valor adicionado com sucesso! Saldo atual: R$ " + saldoWrapper.saldo;

            case "2":
                System.out.print("Digite o valor do pagamento: ");
                double pagamento = scanner.nextDouble();
                if (pagamento <= saldoWrapper.saldo) {
                    saldoWrapper.saldo -= pagamento; // Deduz o pagamento do saldo do wrapper
                    scanner.nextLine(); // Limpa a linha do scanner
                    return "Pagamento realizado com sucesso! Saldo atual: R$ " + saldoWrapper.saldo;
                } else {
                    scanner.nextLine(); // Limpa a linha do scanner
                    return "Saldo insuficiente para realizar o pagamento.";
                }

            case "3":
                return "Saldo atual: R$ " + saldoWrapper.saldo;

            case "4":
                return "Encerrando a carteira digital.";

            default:
                return "Opção inválida! Por favor, escolha uma opção entre 1 e 4.";
        }
    }
}

class SaldoWrapper {
    public double saldo = 0.0;
}