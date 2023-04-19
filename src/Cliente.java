import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cliente {
    Scanner scan = new Scanner(System.in);
    public List<Pessoa> clientes;

    public Cliente() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente() {

        Impressora.solicitarTipoPessoa();
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            clientes.add(Fisica.criarPessoaFisica());
        } else {
            clientes.add(Juridica.criarPessoaJuridica());
        }
    }

    public void listarCliente(){
        System.out.println(clientes.toString());
    }
}
