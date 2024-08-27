package iPhone;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class IPhoneMain implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar () {
        System.out.println ("TOCANDO MÚSICA");
    }

    public void pausar () {
        System.out.println ("MÚSICA PAUSADA");
    }

    public void selecionarMusica (String musica) {
        System.out.println ("SELECIONANDO A MÚSICA: "+ musica);
    }


    public void ligar (String numero) {
        System.out.println ("LIGANDO PARA O NÚMERO: "+ numero);
    }

    public void atender () {
        System.out.println ("ATENDENDO TELEFONE");
    }

    public void iniciarCorreioVoz () {
        System.out.println ("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina (String url) {
        System.out.println ("PÁGINA EXIBIDA: "+url);
    }

    public void adicionarNovaAba () {
        System.out.println ("ADICIONANDO NOVA PÁGINA");
    }

    public void atualizarPagina () {
        System.out.println ("ATUALIZANDO PÁGINA");
    }




    
}
