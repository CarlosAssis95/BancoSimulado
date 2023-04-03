import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    private String endereco;
    private String nome;
    private String documentoDeIdentificacao;

    static List<Fisica> listaPessoaFisica = new ArrayList<>();
    static List<Juridica> listaPessoaJuridica = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Pessoa() {
    }

    public Pessoa(String nome, String documentoDeIdentificacao, String endereco) {
        super();
        this.endereco = endereco;
        this.nome = nome;
        this.documentoDeIdentificacao = documentoDeIdentificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoDeIdentificacao() {
        return documentoDeIdentificacao;
    }

    public void setDocumentoDeIdentificacao(String documentoDeIdentificacao) {
        this.documentoDeIdentificacao = documentoDeIdentificacao;
    }

    public void cadastrarPessoa() {

        System.out.println("Qual o tipo de pessoa? \n[1]FISICA: \n[2]JURIDICA:");
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            Fisica fisica = new Fisica();
            listaPessoaFisica.add(fisica.criarPessoaFisica());
        } else {
            Juridica juridica = new Juridica();
            listaPessoaJuridica.add(juridica.criarPessoaJuridica());
        }
    }

    public void listarPessoa() {

        System.out.println("Qual o tipo de pessoa deseja consultar? \n[1]FISICA: \n[2]JURIDICA:");
        int tipoPessoa = scan.nextInt();

        if (tipoPessoa == 1) {
            System.out.println(listaPessoaFisica.toString());
        }
        else {
            System.out.println(listaPessoaJuridica.toString());
        }
    }
}