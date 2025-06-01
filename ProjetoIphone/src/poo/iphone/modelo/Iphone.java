package poo.iphone.modelo;

import poo.iphone.interfaces.AparelhoTelefonico;
import poo.iphone.interfaces.NavegadorInternet;
import poo.iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String paginaAtual;
    private boolean emChamada;

    // Construtor
    public Iphone() {
        this.musicaAtual = null;
        this.paginaAtual = null;
        this.emChamada = false;
        System.out.println("iPhone iniciado.");
    }

  
    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            System.out.println("Tocando música: " + musicaAtual + " 🎶");
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    
    public void pausar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            System.out.println("Música '" + musicaAtual + "' pausada. ⏸️");
        } else {
            System.out.println("Nenhuma música tocando para pausar.");
        }
    }

    
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica + " 🎵");
    }

    public void ligar(String numero) {
        if (emChamada) {
            System.out.println("Já existe uma chamada em andamento.");
            return;
        }
        System.out.println("Ligando para: " + numero + "... 📞");
        this.emChamada = true;
    }

    
    public void atender() {
        if (emChamada) {
             System.out.println("Chamada já atendida ou em andamento.");
        } else {
            
            System.out.println("Chamada atendida. 📱");
            this.emChamada = true;
        }
    }

    
    public void iniciarCorreioVoz() {
        if (emChamada) {
            System.out.println("Não é possível iniciar o correio de voz durante uma chamada.");
        } else {
            System.out.println("Iniciando correio de voz... 🗣️");
        }
    }
    
    
    public void encerrarChamada() {
        if (emChamada) {
            System.out.println("Chamada encerrada. 📵");
            this.emChamada = false;
        } else {
            System.out.println("Nenhuma chamada em andamento para encerrar.");
        }
    }


    
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url + " 🌐");
    }

    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador. ➕");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null && !paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual + " 🔄");
            exibirPagina(paginaAtual); 
        } else {
            System.out.println("Nenhuma página para atualizar. Abra uma página primeiro.");
        }
    }
    
}