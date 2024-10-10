package entity;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {



    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero );
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Encerrando Chamada");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo Pagina Web: " + url );
    }

    @Override
    public void navegarParaUrl(String url) {
        System.out.println("Navegando na Pagina Web: " + url );
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina Web");

    }

    @Override
    public void play() {
        System.out.println("Inciando Música");
    }

    @Override
    public void pause() {
        System.out.println("Pausando Música");
    }

    @Override
    public void stop() {
        System.out.println("Stop na Música");

    }

    public void ligacao(String numero){
        fazerChamada(numero);
        receberChamada();
        finalizarChamada();
    }

    public void navegacaoWeb(String url){
        abrirPagina(url);
        navegarParaUrl(url);
        atualizarPagina();
    }

    public void musica(){
       play();
       pause();
       stop();
    }


}
