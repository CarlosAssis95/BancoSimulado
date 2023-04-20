public class ValidarCPF {

    public static boolean validarCPF(String cpf){
        if (cpf == null || cpf.length() != 11){
            return false;
        }

        // Transforma a String capturada em um Array de inteiros
        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++){
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }

        // Calculo do primeiro digito verificador
        int primeiroDigito = 0;
        for (int i = 0; i < 9; i++ ){
            primeiroDigito += numeros[i] * (10 - i);
        }

        primeiroDigito = 11 - (primeiroDigito % 11);
        if (primeiroDigito != numeros[9]){
            primeiroDigito =0;
        }

        if (primeiroDigito != numeros[9]){
            return false;
        }

        // Calculo do segundo digito verificador
        int segundoDigito = 0;
        for ( int i = 0; i < 10; i++){
            segundoDigito += numeros[i] * ( 11 - i);
        }

        segundoDigito = 11 - (segundoDigito % 11);
        if (segundoDigito > 9){
            segundoDigito = 0;
        }

        if (segundoDigito != numeros[10]){
            return false;
        }

        return true;
    }
}
