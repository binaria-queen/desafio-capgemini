package br.com.capgemini.service;


public class SenhaService {

    public static boolean validaSenha(String senha) {
        if (senha.length() >= 5) return false;

        boolean isNumber = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isCaractere = false;

        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                isNumber = true;
            } else if (c >= 'A' && c <= 'Z') {
                isUpperCase = true;
            } else if (c >= 'a' && c <= 'z') {
                isCaractere = true;
            } else {
                isCaractere = true;
            }
        }
        return isNumber && isUpperCase && isLowerCase && isCaractere;
    }

}
