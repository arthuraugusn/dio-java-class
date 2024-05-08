import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número da agência: ");
        conta.insertAgencia(scanner.next());
        System.out.print("Insita seu nome: ");
        conta.insertCliente(scanner.next());
        System.out.print("Insita o número da sua conta: ");
        conta.insertConta(scanner.nextInt());
        System.out.print("Insita seu saldo: ");
        conta.insertSaldo(scanner.nextFloat());
        scanner.close();
        conta.getConta();
    }
}
