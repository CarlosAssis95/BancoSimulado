import java.util.Scanner;
public class Fisica extends Pessoa {

    Scanner scan = new Scanner(System.in);
    private String dataDeNascimento;

    public Fisica() {}

    public Fisica(String nome, String documentoDeIdentificacao, String dataDeNascimento, String endereco) {
        super(nome, documentoDeIdentificacao, endereco);
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Fisica criarPessoaFisica() {

        System.out.println("Digite o nome do titular: ");
        String nome = scan.nextLine();

        System.out.println("Digite o numero do CPF: ");
        String documentoDeIdentificacao = scan.nextLine();

        System.out.println("Digite a data de nascimento: ");
        String dataDeNascimento = scan.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scan.nextLine();

        return new Fisica(nome, documentoDeIdentificacao, dataDeNascimento, endereco);
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de nascimento: " + getDataDeNascimento();

    }

}