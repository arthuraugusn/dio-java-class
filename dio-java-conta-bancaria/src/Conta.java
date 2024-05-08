
public class Conta {
  private String agencia, nome_cliente;
  private int numero_conta;
  private float saldo;

  public void getConta() {
    Conta conta = new Conta();
    conta.agencia = this.agencia;
    conta.nome_cliente = this.nome_cliente;
    conta.saldo = this.saldo;
    conta.numero_conta = this.numero_conta;
    System.out
        .printf(
            "\nOlá ".concat(conta.nome_cliente)
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    .concat(conta.agencia)
                + ", conta número %d e seu saldo %.2f já está disponível para saque.",
            conta.numero_conta, conta.saldo);
  }

  public void insertAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void insertCliente(String cliente) {
    this.nome_cliente = cliente;
  }

  public void insertConta(int conta) {
    this.numero_conta = conta;
  }

  public void insertSaldo(float saldo) {
    this.saldo = saldo;
  }

}
