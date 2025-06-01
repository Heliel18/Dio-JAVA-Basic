package poo.iphone.app;

import poo.iphone.modelo.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("\n--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("123-456-7890"); 
        meuIphone.iniciarCorreioVoz();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        
        System.out.println("\n--- Testando funcionalidades sem estado prévio adequado ---");
        Iphone outroIphone = new Iphone();
        outroIphone.tocar(); 
        outroIphone.pausar(); 
        outroIphone.atualizarPagina(); 
        
        
        
        System.out.println("\n--- Testando Atender Chamada (simulação) ---");
        Iphone iphoneParaReceberChamada = new Iphone();
        
        iphoneParaReceberChamada.atender(); 
        
    }

}
