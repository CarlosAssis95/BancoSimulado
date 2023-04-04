import java.util.Scanner;

public class Conta {

    Scanner scan = new Scanner(System.in);

    String numeroConta;
    String agencia;
    String tipoDeConta;


    public Conta() {
    }

    public void criarConta() {

        Impressora.digitarNumeroConta();
        numeroConta = scan.nextLine();

        Impressora.digitarNumeroAgencia();
        agencia = scan.nextLine();

        Impressora.escolherTipoConta();
        tipoDeConta = scan.nextLine();

    }
}
