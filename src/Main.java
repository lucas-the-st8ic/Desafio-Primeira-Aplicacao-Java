
void main() {
    Scanner leitura = new Scanner(System.in);

    //Variáveis
    String nomeCliente = "Lucas Silva";
    String tipoDeConta = "Corrente";
    double saldoInicial = 3000.00;
    double recebimento = 0;
    double transferencia = 0;
    int opcao = 0;

    System.out.println("==============================");
    System.out.println("-======Dados da conta-======");
    System.out.println("\tNome: " + nomeCliente);
    System.out.println("\tTipo da conta: " +tipoDeConta);
    System.out.println("\tSaldo da conta: R$ " +saldoInicial);
    System.out.println("==============================\n");

    while (opcao != 4) {
        System.out.println("-======Operações-======");
        System.out.println("""
        1-Consultar saldos
        2-Receber Valor
        3-Transferir Valor
        4- Sair
        =====================""");
        System.out.println("Digite a opção desejada:");
        opcao = leitura.nextInt();
        
        if (opcao == 1) {
            System.out.println("Seu saldo atual é de: R$ " +saldoInicial+ "\n");
        } else if (opcao == 2) {
            System.out.println("Informe o valor a receber:");
            recebimento = leitura.nextDouble();
            saldoInicial += recebimento;
            System.out.println("Saldo atualizado R$ " +saldoInicial);
        } else if (opcao == 3) {
            System.out.println("Informe o valor que deseja transferir:");
            transferencia = leitura.nextDouble();
            if (transferencia > saldoInicial) {
                System.out.println("Não há saldo suficiente para fazer essa transferência!!");
            } else {
                saldoInicial -= transferencia;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
            }
        } else if (opcao == 4) {
            System.out.println("====VOLTE SEMPRE====");
            break;
        } else {
            System.out.println("\t!!!!Opção inválida!!!!");
            System.out.println("\tTente novamente.");
        }
    }
}
