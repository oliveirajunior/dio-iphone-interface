package produtos.musica;

public class IPod implements ReprodutorMusical {

    public void pausar() {
        System.out.println("Música pausada");
    }


    public void tocar() {
        System.out.println("Tocando música");
    }


    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
