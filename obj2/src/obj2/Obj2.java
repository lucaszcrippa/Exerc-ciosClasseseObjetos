
package obj2;


public class Obj2 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Lucas", "12345-6", 500.0);

        conta1.depositar(200.0);
        conta1.sacar(100.0);
        conta1.sacar(700.0);

        conta1.exibirSaldo();
    }
}