import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    Scanner scan = new Scanner(System.in);
    public static List<Pessoa> clientes = new ArrayList<>();

    public void cadastrarCliente() {

        Impressora.solicitarTipoPessoa();
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            clientes.add(Fisica.criarPessoaFisica());
        } else {
            clientes.add(Juridica.criarPessoaJuridica());
        }
    }

    public int criarId(List<Pessoa> clientes) {

        int id = clientes.size();
        for (Pessoa cliente : clientes) {
            if (cliente.getId() > id) {
                id = cliente.getId();
            }
        }
        ++id;
        System.out.println("O id do cliente é: " + id);
        return id;
    }

    public void mostrarCliente() {

        System.out.println("Qual o CPF do cliente que deseja visualizar? ");
        String cpfCliente = scan.next();

        for (int i = 0; i < clientes.size(); ++i) {
            if (clientes.get(i).getDocumentoDeIdentificacao().equals(cpfCliente))
                System.out.println("O cliente é " + clientes.get(i).getNome() + " com o CPF: " + clientes.get(i).getDocumentoDeIdentificacao()
                        + " id: " + clientes.get(i).getId());
        }
    }

    public void listarCliente() {
        System.out.println(clientes.toString());
    }

    public void excluirCliente() {

        Impressora.excluirCliente();
        String cpfExcluido = scan.next();

        for (int i = 0; i < clientes.size(); ++i) {
            if (clientes.get(i).getDocumentoDeIdentificacao().equals(cpfExcluido)) {
                clientes.remove(i);
                Impressora.clienteExcluido();
            }
        }
    }
}
