package loja;

import equipamentos.apple.Iphone;
import equipamentos.genericos.AparelhoTelefonicoImpl;

public class Comprador {
    public static void main(String[] args) {
        Iphone i = new Iphone();

        System.out.println("Iphone \n");

        System.out.println("Iphone - Ativando Funcionalidades de Telefone");
        i.iniciarCorreioVoz();
        i.atender();
        i.ligar();
        i.enviarSMS();

        System.out.println("\n");

        System.out.println("Iphone - Ativando Funcionalidades de Player Musical");
        i.selecionarMusica();
        i.pausar();
        i.tocar();

        System.out.println("\n");

        System.out.println("Iphone - Ativando Funcionalidades de Navegador web");
        i.adicionarNovaAba();
        i.atualizarPagina();
        i.exibirPagina();

    }
}
