package edu.gleison.dio;

public class Main {
    public static void main(String[] args) {

        String primeiroNome = "Gleison";
        String segundoNome = "Borges";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}