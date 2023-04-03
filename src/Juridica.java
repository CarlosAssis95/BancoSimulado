import java.util.Scanner;
public class Juridica extends Pessoa {

    Scanner scan = new Scanner(System.in);
    private String dataDeAbertura;

    public Juridica() {}

    public Juridica(String nome, String documentoDeIdentificacao, String dataDeAbertura, String endereco) {
        super(nome, documentoDeIdentificacao, endereco);
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Juridica criarPessoaJuridica() {

        System.out.println("Digite o nome do titular: ");
        String nome = scan.nextLine();

        System.out.println("Digite o numero do CNPJ: ");
        String documentoDeIdentificacao = scan.nextLine();

        System.out.println("Digite a data de abertura da empresa: ");
        String dataDeAbertura = scan.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scan.nextLine();

        return new Juridica(nome ,documentoDeIdentificacao, dataDeAbertura, endereco);
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de abertura: " + getDataDeAbertura();

    }
}
