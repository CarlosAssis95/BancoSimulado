import java.util.Objects;
import java.util.Scanner;

public class Fisica extends Pessoa {
    private String dataDeNascimento;

    public Fisica(String nome, String cpf, String dataDeNascimento, String endereco) {
        super(nome, cpf, endereco);
        this.dataDeNascimento = dataDeNascimento;

        if (!ValidarCPF.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }
    }



    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static Fisica criarPessoaFisica() {

        Scanner scan = new Scanner(System.in);

        String nome, cpf, dataDeNascimento, endereco;
        boolean cpfValido = false;

        do {
            Impressora.solicitarNome();
            nome = scan.nextLine();

            Impressora.solicitarDocumentoIdentificacao();
            cpf = scan.nextLine();

            Impressora.solicitarDataDeNascimento();
            dataDeNascimento = scan.nextLine();

            Impressora.solicitarEndereco();
            endereco = scan.nextLine();

            try {
                Fisica pessoaFisica = new Fisica(nome, cpf, dataDeNascimento, endereco);
                cpfValido = true;
                return pessoaFisica;

            } catch (IllegalArgumentException e) {
                Impressora.cpfInvalido();
            }

        } while (!cpfValido);

        return null;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de nascimento: " + getDataDeNascimento();
    }
}