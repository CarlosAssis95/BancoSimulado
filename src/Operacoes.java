import java.util.Scanner;

public class Operacoes extends Conta {

    private double deposito;
    private double saque;
    private double saldo;

    public Operacoes() {
    }

    public Operacoes(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void getSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void efetuarDeposito() {

        System.out.println("Qual valor gostaria de depositar? ");
        Scanner scan = new Scanner(System.in);
        double deposito = scan.nextDouble();
        saldo += deposito;

        System.out.println("O valor depositado foi de R$ " + deposito + " Reais");
    }

    public void exibirSaldo() {
        System.out.println("O saldo na conta é de " + saldo + " reais");
    }
}
