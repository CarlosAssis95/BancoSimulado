import java.util.Scanner;

public class Juridica extends Pessoa{

    private String dataDeAbertura;

    public Juridica(String nome, String documentoDeIdentificacao, String dataDeAbertura, String endereco) {
        super(nome, documentoDeIdentificacao, endereco);
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public static Juridica criarPessoaJuridica() {

        Scanner scan = new Scanner(System.in);

        Impressora.solicitarNome();
        String nome = scan.nextLine();

        Impressora.solicitarDocumentoIdentificacao();
        String cnpj = scan.nextLine();

        Impressora.solicitarDataDeAbertura();
        String dataDeAbertura = scan.nextLine();

        Impressora.solicitarEndereco();
        String endereco = scan.nextLine();

        return new Juridica(nome, cnpj, dataDeAbertura, endereco);
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de abertura: " + getDataDeAbertura();

    }
}
