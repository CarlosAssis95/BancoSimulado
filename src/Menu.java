import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    static Operacoes operacoes = new Operacoes();
    static Cliente cliente = new Cliente();
    static Conta conta = new Conta();
    static boolean exibirMenu = true;

    public static void executarMenu() {

        while (exibirMenu) {

            Impressora.opcoesMenu();
            int option = scan.nextInt();

            switch (option) {

                case 1:
                    cliente.cadastrarCliente();
                    conta.criarConta();
                    break;

                case 2:
                    cliente.listarCliente();
                    conta.toString();
                    break;

                case 3:
                    operacoes.efetuarDeposito();
                    break;

                case 4:
                    operacoes.exibirSaldo();
                    break;

                case 5:
                    operacoes.efetuarSaque();
                    break;

                case 6:
                    exibirMenu = false;
                    Impressora.despedidaMenu();
                    break;

                default:
                    Impressora.opcaoInvalida();
                    break;

            }
        }
    }
}
