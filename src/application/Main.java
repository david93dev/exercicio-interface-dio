package application;

import entity.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone =  new Iphone();

        iphone.ligacao("(83)99999-9999");
        iphone.navegacaoWeb("https://www.google.com.br");
        iphone.musica();
    }
}