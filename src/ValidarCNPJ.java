import java.util.InputMismatchException;

public class ValidarCNPJ {

    public static boolean validaCNPJ(String CNPJ){

        // Verifica se são CNPJ's formados por uma sequencia de numeros iguais e retorna falso caso seja
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
                CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
                CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
                CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
                CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
                (CNPJ.length() != 14))

            return (false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {
            // Calculo do primeiro digito verificador
            sm = 0;
            peso = 2;

            for (i = 11; i >= 0; i--){

                // Transforma o i-ésimo caractere do CNPJ em um número
                num = (int)(CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;

                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)){
                dig13 = '0';
            }
            else {
                dig13 = (char)((11 - r) + 48);
            }

            // Calculo do segundo digito Verificador
            sm = 0;
            peso = 2;

            for ( i = 12; i >= 0; i--){
                num = (int)(CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;

                if ( peso == 10){
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)){
                dig14 = '0';
            }
            else {
                dig14 = (char)((11 - r) + 48);
            }

            // Verifica se os dígitos calculados conferem com os dígitos informados
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))){
                return (true);
            }
            else{
                return (false);
            }
        }
        catch (InputMismatchException erro){
            return (false);
        }

    }


}
