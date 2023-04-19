import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {

    Scanner scan = new Scanner(System.in);
    static List<Conta> contas = new ArrayList<>();

    Conta conta;
    String numeroConta;
    String agencia;
    String tipoDeConta;

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void criarConta() {

        Impressora.digitarNumeroConta();
        numeroConta = scan.nextLine();

        Impressora.digitarNumeroAgencia();
        agencia = scan.nextLine();

        Impressora.escolherTipoConta();
        tipoDeConta = scan.nextLine();

        Conta Conta;
        contas.add(conta);

    }

    @Override
    public String toString() {

        return "Numero da conta: " + getNumeroConta() + "\nAgencia: " + getAgencia() + "\nTipo de conta: " + getTipoDeConta();

    }

}
