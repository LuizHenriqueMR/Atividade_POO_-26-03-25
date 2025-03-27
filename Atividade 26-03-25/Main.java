import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Dono da Conta 1", "123.456.789-00", 12345, 1000.0, "Agência 001");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Quanto você quer sacar, Conta 1?");
        double valorDoSaque = entradaDoUsuario.nextDouble();

        if (conta1.sacarDinheiro(valorDoSaque)) {
            System.out.println("Saque feito! Seu saldo agora é: R$ " + conta1.pegarSaldo());
        } else {
            System.out.println("Não deu pra sacar. Você não tem dinheiro suficiente.");
        }

        System.out.println("Quanto você quer depositar, Conta 1?");
        double valorDoDeposito = entradaDoUsuario.nextDouble();

        conta1.depositarDinheiro(valorDoDeposito);
        System.out.println("Depósito feito! Seu saldo agora é: R$ " + conta1.pegarSaldo());

        ContaCorrente conta2 = new ContaCorrente("Dono da Conta 2", "987.654.321-00", 54321, 500.0, "Agência 002");

        System.out.println("Quanto você quer transferir para a Conta 2, Conta 1?");
        double valorDaTransferencia = entradaDoUsuario.nextDouble();

        if (conta1.transferirDinheiro(conta2, valorDaTransferencia)) {
            System.out.println("Transferência feita!");
            System.out.println("Saldo da Conta 1: R$ " + conta1.pegarSaldo());
            System.out.println("Saldo da Conta 2: R$ " + conta2.pegarSaldo());
        } else {
            System.out.println("Não deu pra transferir. Veja se você tem dinheiro suficiente.");
        }

        entradaDoUsuario.close();
    }
}
