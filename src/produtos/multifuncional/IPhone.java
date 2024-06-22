package produtos.multifuncional;

import produtos.internet.NavegadorInternet;
import produtos.musica.ReprodutorMusical;
import produtos.telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void exibirPagina() {
        System.out.println("Exibindo página pelo iPhone");
    }


    public void adicionarNovaAba() {
        System.out.println("Adicionado nova aba pelo iPhone");
    }


    public void atualizarPagina() {
        System.out.println("Autalizando página pelo iPhone");
    }


    public void tocar() {
        System.out.println("Tocando música pelo iPhone");
    }


    public void pausar() {
        System.out.println("Pausando a música pelo iPhone");
    }


    public void selecionarMusica() {
        System.out.println("Selecionando música pelo iPhone");
    }


    public void ligar() {
        System.out.println("Ligando pelo iPhone");
    }


    public void atender() {
        System.out.println("Atendendo ligação pelo iPhone");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do iPhone");
    }
}
