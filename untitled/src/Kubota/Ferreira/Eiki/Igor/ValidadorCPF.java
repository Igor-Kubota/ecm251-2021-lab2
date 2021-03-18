package Kubota.Ferreira.Eiki.Igor;

import java.util.Locale;

public class ValidadorCPF {
    private static String[] invalidosConhecidos = {
            "00000000000" , "11111111111" , "22222222222" ,
            "33333333333" , "44444444444" , "55555555555" ,
            "66666666666" , "77777777777" , "88888888888" ,
            "99999999999"
    };

    private static final int[] multiplicadoresPrimeiroDigitos = {
            10,9,8,7,6,5,4,3,2
    };

    private static final int[] MultiplicadoresSegundoDigito = {
            11,10,9,8,7,6,5,4,3,2
    };


    private static final int TamanhoCPF = 11;
    public static boolean ValidarCPF(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        // Valida o tamanho do Cpf
        if (cpf.length() != 11)
            return false;

        //verifica se o cpf esta dentro dos invalidos conhecidos
        for (String cpfInvalido : invalidosConhecidos) {
            if (cpfInvalido.equals(cpf))
                return false;
        }

        //Validacao do primeiro e segundo digito
        if(ValidarDigito(multiplicadoresPrimeiroDigitos,cpf) && ValidarDigito(MultiplicadoresSegundoDigito,cpf))

            return true;






        return true;
    }
    private static boolean ValidarDigito(int[] multiplicadores , String cpf){
        int somatoria = 0;
        for (int i = 0; i <multiplicadores.length ; i++){
            somatoria += multiplicadores[i] * Integer.parseInt("" + cpf.charAt(i));
        }
        return ("" + ((somatoria*10)%11)%10).equals(""+
                cpf.charAt(multiplicadores.length));
    }

}
