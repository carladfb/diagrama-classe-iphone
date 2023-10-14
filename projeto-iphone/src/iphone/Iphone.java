package iphone;

import java.util.ArrayList;
import java.util.List;

import iphone.Navegador.NavegadorInternet;
import iphone.Telefone.AparelhoTelefonico;
import iphone.Tocador.Musica;
import iphone.Tocador.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<Musica> musicas;
    private List<String> chamadas;
    private List<String> abas;


    public Iphone() {
        this.musicas = new ArrayList<>();
        this.chamadas = new ArrayList<>();
        this.abas = new ArrayList<>();
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página atual: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        abas.add(url);
        System.out.println("Nova aba adicionada: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void ligar(String numero) {
       chamadas.add(numero);
       System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Oi! no momento não posso atender, tente ligar mais tarde.");
    }

    @Override
    public void tocar(Musica musica) {
        musicas.add(musica);
        System.out.println("Tocando música: " + musica.getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada.");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Música selecionada: " + musica.getTitulo());
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Tocador de música: ");
        Musica musica1 = new Musica("Loves to lay");
        iphone.selecionarMusica(musica1);
        iphone.tocar(musica1);
        iphone.pausar();
        

        System.out.println("\nTelefone: ");
        iphone.ligar("995846823");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nNavegador: ");
        iphone.exibirPagina("wwww.carla.com");
        iphone.adicionarNovaAba("www.carla2.com");
        iphone.atualizarPagina();
    }
}
