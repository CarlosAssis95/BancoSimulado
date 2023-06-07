import java.util.Scanner;

public class Operacoes extends Conta {

    Scanner scan = new Scanner(System.in);
    private double deposito;
    private double saldo;
    private double saque;
    private double transferencia;

    public Operacoes(){
        this.deposito = 0;
        this.saldo = 0;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public void efetuarDeposito() {

        Impressora.solicitarValorDeposito();
        this.setDeposito(scan.nextDouble());
        this.setSaldo(this.saldo += this.deposito);
    }

    public void efetuarSaque() {
        Impressora.pedirValorSaque();
        this.setSaque(scan.nextDouble());

        if (this.getSaque() < this.getSaldo()) {
            Impressora.saqueEfetuado();
            this.setSaldo(this.saldo -= this.saque);
        } else {
            Impressora.semLimite();
        }

    }

    public void efetuarTransferencia(){

        System.out.println("Qual valor deseja transferir? ");
        this.setTransferencia(scan.nextDouble());

        if (this.getTransferencia() < getSaldo()){
            System.out.println("O Saldo está disponivel para transferir ");
            this.setSaldo(this.saldo -= this.transferencia);
        } else {
            System.out.println("Você não tem saldo suficiente ");
        }

        // System.out.println("Para quem deseja transferir ? ");

    }

    public void exibirSaldo() {
        System.out.println("O saldo na conta é de " + this.getSaldo() + " reais");
    }
}
