import java.util.Scanner;

public class SimulacaoBancaria 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("");
        System.out.println("### Opções de Conta ###");
        System.out.println("");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Encerrar");
        System.out.println("");
        System.out.println("Digite um número para concluir a ação:");

        while (continuar) 
        {

            int opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Valor a ser depositado: ");
                    double valorDepositado = scanner.nextDouble();
                    saldo = saldo + valorDepositado;
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Valor a ser sacado: ");
                    double valorDeSaque = scanner.nextDouble();
                    if (valorDeSaque > saldo) 
                    {
                        System.out.println("Saldo insuficiente");
                    }
                    else
                    {
                        saldo = saldo - valorDeSaque;
                        System.out.println("Saldo Atual: " + saldo);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

