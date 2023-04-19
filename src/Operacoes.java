import java.util.Scanner;

public class Operacoes extends Conta {

    Scanner scan = new Scanner(System.in);
    private double deposito = 0;
    //private double saque;
    private double saldo = 0;

    private double saque;

    public Operacoes() {
    }

    public void efetuarDeposito() {

        Impressora.solicitarValorDeposito();
        deposito = scan.nextDouble();
        saldo += deposito;
    }

    public void efetuarSaque(){
        Impressora.pedirValorSaque();
        saque = scan.nextDouble();

        if ( saque < saldo ){
            Impressora.saqueEfetuado();
            saldo -= saque;
        } else {
            Impressora.semLimite();
        }

    }

    public void exibirSaldo() {
        System.out.println("O saldo na conta é de " + saldo + " reais");
    }
}
