package equipamentos.apple;

import equipamentos.genericos.IAparelhoTelefonico;
import equipamentos.genericos.INavegadorInternet;
import equipamentos.genericos.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    //Funções Telefônicas
    public void ligar() {
        System.out.println("Efetuar Ligação Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz Iphone");
    }

    @Override
    public void enviarSMS() {
        System.out.println("Enviar SMS Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina Iphone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página Iphone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música Iphone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música Iphone.");
    }
}
