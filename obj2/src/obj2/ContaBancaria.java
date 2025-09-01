
package obj2;


public class ContaBancaria {
        String titular;
    double saldo;
    String numeroConta;

    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
    }
}


