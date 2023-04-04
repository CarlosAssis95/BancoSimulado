import java.util.Scanner;

public class Operacoes extends Conta {

    private double deposito = 0;
    //private double saque;
    private double saldo = 0;

    public Operacoes() {
    }

    public void efetuarDeposito() {

        Impressora.solicitarValorDeposito();
        Scanner scan = new Scanner(System.in);
        deposito = scan.nextDouble();
        saldo += deposito;
    }

    public void exibirSaldo() {
        System.out.println("O saldo na conta é de " + saldo + " reais");
    }
}
