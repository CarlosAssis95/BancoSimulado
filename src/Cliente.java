import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    Scanner scan = new Scanner(System.in);
    Conta conta = new Conta();

    static List<Fisica> listaPessoaFisica = new ArrayList<>();
    static List<Juridica> listaPessoaJuridica = new ArrayList<>();

    public void cadastrarCliente() {

        System.out.println("Qual o tipo de pessoa? \n[1]FISICA: \n[2]JURIDICA:");
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            listaPessoaFisica.add(Fisica.criarPessoaFisica());
        } else {
            listaPessoaJuridica.add(Juridica.criarPessoaJuridica());
        }
        conta.criarConta();
    }

    public void listarCliente() {

        System.out.println("Qual o tipo de cliente deseja consultar? \n[1]FISICA: \n[2]JURIDICA:");
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            System.out.println(listaPessoaFisica.toString());
        } else {
            System.out.println(listaPessoaJuridica.toString());
        }
    }

}
