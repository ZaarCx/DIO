package edu.gleison.tv;

public class smartTV {
    public static boolean ligada = false;
    public static int canal = 1;
    public static int volume = 25;

    public static void ligar() {
       ligada = true;
    }
    public static void desligar() {
        ligada = false;
    }

    public static void aumentarVolume(){
        //volume = volume +1;
        volume++;
        System.out.println("volume aumentado para: " + volume);
    }
    public static void diminuirVolume(){
        //volume = volume -1;
        volume--;
        System.out.println("volume diminuido para: " + volume);
    }
    public static void aumentarCanal(){
        canal++;
    }
    public static void diminuirCanal(){
        canal--;
    }
    public static void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }
}

