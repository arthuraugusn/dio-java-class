import java.util.Scanner;

public class Conta {
  String agencia, nome_cliente;
  int numero_conta;
  float saldo;

  public void insertAgencia() {
    Scanner read = new Scanner(System.in);
    System.out.print("Insira seu nome: ");
    nome_cliente = read.next();
    System.out.print("\nInsira sua agência: ");
    agencia = read.next();
  }

  public void mostrarAgencia() {
    System.out.printf("Seu nome: %s\nSua agência: %s", nome_cliente, agencia);
  }

}
