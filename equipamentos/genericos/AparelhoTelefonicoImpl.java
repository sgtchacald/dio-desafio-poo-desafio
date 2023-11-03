package equipamentos.genericos;

public class AparelhoTelefonicoImpl implements IAparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Efetuar Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");
    }

    @Override
    public void enviarSMS() {
        System.out.println("Enviar SMS");
    }
}
