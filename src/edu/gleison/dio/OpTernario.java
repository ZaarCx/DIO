package edu.gleison.dio;

import java.beans.PropertyEditorSupport;

public class OpTernario {
    public static void main(String[] args) {

        int a,b;
        a = 5;
        b = 5;
        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }
}
