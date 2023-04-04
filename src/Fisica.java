import java.util.Objects;
import java.util.Scanner;

public class Fisica extends Pessoa {

    private String dataDeNascimento;

    public Fisica(String nome, String documentoDeIdentificacao, String dataDeNascimento, String endereco) {
        super(nome, documentoDeIdentificacao, endereco);
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static Fisica criarPessoaFisica() {

        Scanner scan = new Scanner(System.in);

        Impressora.solicitarNome();
        String nome = scan.nextLine();

        Impressora.solicitarDocumentoIdentificacao();
        String documentoDeIdentificacao = scan.nextLine();

        Impressora.solicitarDataDeNascimento();
        String dataDeNascimento = scan.nextLine();

        Impressora.solicitarEndereco();
        String endereco = scan.nextLine();

        return new Fisica(nome, documentoDeIdentificacao, dataDeNascimento, endereco);
    }

    public String toString() {

        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de nascimento: " + getDataDeNascimento();

    }

}