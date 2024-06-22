package produtos.telefone;

public class Phone implements AparelhoTelefonico {


    public void ligar() {
        System.out.println("Ligando pelo Telefone");
    }


    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Corrio de Voz");
    }
}
