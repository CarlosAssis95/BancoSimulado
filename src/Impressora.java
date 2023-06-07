public class Impressora {

    public static void solicitarNome() {
        System.out.println("Digite o nome do titular: ");
    }

    public static void solicitarDocumentoIdentificacao() {
        System.out.println("Digite o numero do Documento sem pontos e traços: ");
    }

    public static void solicitarDataDeAbertura() {
        System.out.println("Digite a data de abertura da empresa: ");
    }

    public static void solicitarDataDeNascimento() {
        System.out.println("Digite a data de nascimento: ");
    }

    public static void solicitarEndereco() {
        System.out.println("Digite o endereço: ");
    }

    public static void solicitarValorDeposito() {
        System.out.println("Qual valor gostaria de depositar? ");
    }

    public static void solicitarTipoPessoa() {
        System.out.println("Qual o tipo do pessoa? \n[1]FISICA: \n[2]JURIDICA:");
    }

    public static void digitarNumeroConta() {
        System.out.println("Digite o numero de conta com 4 numeros e 1 digito ");
    }

    public static void digitarNumeroAgencia() {
        System.out.println("Digite o numero da Agencia com 3 numeros ");
    }

    public static void escolherTipoConta() {
        System.out.println("Escolha o tipo de conta [Poupança ou Corrente] ");
    }

    public static void opcoesMenu() {
        System.out.println("[1]CADASTRAR CLIENTES \n[2]LISTAR CLIENTES \n[3]EFETUAR DEPOSITO \n[4]EXIBIR SALDO \n[5]EFETUAR SAQUE  "
                + "\n[6]DAR BAIXA EM CLIENTES \n[7]ABRIR CLIENTE \n[8]MOSTRAR CONTA \n[9]TRANSFERENCIA \n[10]SAIR");
    }

    public static void despedidaMenu() {
        System.out.println("Obrigado por visitar nosso banco");
        System.out.println("Nos vemos na proxima");
    }

    public static void opcaoInvalida() {
        System.out.println("Opção invalida");
    }

    public static void cpfInvalido() {
        System.out.println("CPF inválido. Digite novamente sem pontos e traços.");
    }

    public static void cnpjInvalido() {
        System.out.println("CNPJ inválido. Digite novamente sem pontos e traços.");
    }

    public static void pedirValorSaque() {
        System.out.println("Qual valor deseja sacar ?");
    }

    public static void saqueEfetuado() {
        System.out.println("Saque efetuado com sucesso");
    }

    public static void semLimite() {
        System.out.println("Sem limite disponivel para saque \nTente outro valor");
    }

    public static void excluirCliente() {
        System.out.println("Qual o CPF do cliente que deseja excluir? ");
    }

    public static void buscarClienteEConta() {
        System.out.println("Qual o digito identificador do cliente e conta? ");
    }

    public static void clienteExcluido() {
        System.out.println("Cliente excluido ");
    }

}

