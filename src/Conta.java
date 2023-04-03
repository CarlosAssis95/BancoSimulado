import java.util.Scanner;

public class Conta extends Banco {

    Scanner scan = new Scanner(System.in);

    String numeroConta;
    String agencia;
    String tipoDeConta;


    public Conta() {
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void criarConta() {

        System.out.println("Escolha um numero de conta com 4 numeros e 1 digito ");
        numeroConta = scan.nextLine();

        System.out.println("Escolha o numero da Agencia com 3 numeros ");
        agencia = scan.nextLine();

        System.out.println("Escolha o tipo de conta Poupança ou Corrente ");
        tipoDeConta = scan.nextLine();

    }
}
