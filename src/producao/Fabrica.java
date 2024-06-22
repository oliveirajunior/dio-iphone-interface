package producao;

import produtos.multifuncional.IPhone;

public class Fabrica {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        // Navegador
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        // Tocador
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        // Telefone
        iPhone.ligar();
        iPhone.iniciarCorreioVoz();
        iPhone.atender();

    }
}
