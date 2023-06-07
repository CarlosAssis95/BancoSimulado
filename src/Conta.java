import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {
    public static List<Conta> contas = new ArrayList<>();
    
    String numeroConta;
    String agencia;
    String tipoDeConta;

    int idCliente;

    public Conta (){}

    public Conta(String numeroConta, String agencia, String tipoDeConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public int getIdCliente(){ return idCliente; }


    public static Conta criarConta() {

        Scanner scan = new Scanner(System.in);

        Impressora.digitarNumeroConta();
        String numeroConta = scan.nextLine();

        Impressora.digitarNumeroAgencia();
        String agencia = scan.nextLine();

        Impressora.escolherTipoConta();
        String tipoDeConta = scan.nextLine();


        Conta conta = new Conta(numeroConta, agencia, tipoDeConta);
        contas.add(conta);
        return conta;

    }

    @Override
    public String toString() {

        return "Numero da conta: " + getNumeroConta() + "\nAgencia: " + getAgencia() + "\nTipo de conta: " + getTipoDeConta();

    }

    public void mostrarConta() {

        System.out.println("Qual o numero da conta que deseja visualizar ");
        Scanner scan = new Scanner(System.in);
        String numeroConta = scan.next();

        for (int i = 0; i < contas.size(); ++i) {
            if (contas.get(i).getNumeroConta().equals(numeroConta))
                System.out.println("A conta é " + contas.get(i).getNumeroConta() + " Agencia : " + contas.get(i).getAgencia()
                        + " id: " + contas.get(i).getIdCliente());
        }

    }
}