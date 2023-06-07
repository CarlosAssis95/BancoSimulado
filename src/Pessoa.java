import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String endereco;
    private String nome;
    private String documentoDeIdentificacao;
    public int id;

    public Pessoa() {
    }

    public Pessoa(String nome, String documentoDeIdentificacao, String endereco, int id) {
        super();
        this.endereco = endereco;
        this.nome = nome;
        this.documentoDeIdentificacao = documentoDeIdentificacao;
        this.id = id;
    }


    public String getEndereco() {
        return endereco;
    }

    public String getNome() {

        return nome;
    }

    public int getId() {

        return id;
    }

    public String getDocumentoDeIdentificacao() {

        return documentoDeIdentificacao;
    }
}