package edu.gleison.dio;

import java.beans.PropertyEditorSupport;

public class OpTernario {
    public static void main(String[] args) {

        int a,b;
        a = 5;
        b = 5;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

       if (resultado == "verdadeiro"){
           System.out.println("você passou!");
       } else {
           System.out.println("você reprovou!");
       }
       if (a > b){
           System.out.println("Aprovado");
       } else {
           System.out.println("mas foi reprovado!");
       }

    }
}
