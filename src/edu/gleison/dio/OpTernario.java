package edu.gleison.dio;

import java.beans.PropertyEditorSupport;

public class OpTernario {
    public static void main(String[] args) {


        final int a = 7;
        int b;
        b = 5;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

       if (resultado == "verdadeiro"){
           System.out.println("você passou!");
       } else {
           System.out.println("você ficou abaixo da média!");
       }
       if (a > b){
           System.out.println("mas foi aprovado");
       } else {
           System.out.println("mas foi reprovado!");
       }

       int numero = 1;
       int numero1 = 2;

       boolean simNao = numero == numero1;

        System.out.println("o numero é diferente do numero1? \n" + simNao);

        if (simNao == false){
            System.out.println("sim, é diferente!");
        } else {
            System.out.println("é igual");
        }


    }
}
