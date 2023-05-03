package edu.gleison.tv;

public class Application {
    public static void main(String[] args) throws Exception {

        smartTV smartTV = new smartTV();



        edu.gleison.tv.smartTV.mudarCanal(13);


        System.out.println("TV Ligada ? " + edu.gleison.tv.smartTV.ligada);

        System.out.println("Canal atual: " +edu.gleison.tv.smartTV.canal);

        edu.gleison.tv.smartTV.aumentarVolume();
        edu.gleison.tv.smartTV.aumentarVolume();
        System.out.println("Volume atual: " +edu.gleison.tv.smartTV.volume);
        edu.gleison.tv.smartTV.diminuirVolume();
        edu.gleison.tv.smartTV.diminuirVolume();
        edu.gleison.tv.smartTV.diminuirVolume();

        edu.gleison.tv.smartTV.mudarCanal(15);
        System.out.println("Canal atual: " +edu.gleison.tv.smartTV.canal);

        edu.gleison.tv.smartTV.mudarCanal(99);
        System.out.println("Canal atual: " +edu.gleison.tv.smartTV.canal);



        edu.gleison.tv.smartTV.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + edu.gleison.tv.smartTV.ligada);
        edu.gleison.tv.smartTV.mudarCanal(15);
        edu.gleison.tv.smartTV.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + edu.gleison.tv.smartTV.ligada);
    }
}
