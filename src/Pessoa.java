import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String endereco;
    private String nome;
    private String documentoDeIdentificacao;

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

    public String getNome() {

        return nome;
    }

    public String getDocumentoDeIdentificacao() {

        return documentoDeIdentificacao;
    }
}