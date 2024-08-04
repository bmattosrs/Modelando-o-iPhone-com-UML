package aparelho;
import modulos.*;

public class Iphone implements ReprodutorMusical, Telefone, Navegador, Sistema {

    //Parametros
    boolean aparelhoLigado = false;
    boolean internet = false;

    public void mensagemAparelhoDesligado(){
        System.out.println("APARELHO DESLIGADO. Ligue o aparelho chamando o método ligarAparelho() ou definindo o parametro aparelhoLigado como true");
    }

    public void mensagemSemConexaoInternet(){
        System.out.println("SEM CONEXÃO COM A INTERNET. Conecte a internet chamando o método conectarInternet() ou definindo o parametro internet como true");
    }


    
    //Sistema
    public void ligarAparelho(){
        this.aparelhoLigado = true;
        System.out.println("APARELHO LIGADO");
    }
    public void conectarInternet(){
        this.internet = true;
        System.out.println("CONECTADO A INTERNET");
    }

    //Reprodutor Musical
    public void tocarMusica(String musica){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("TOCANDO MÚSICA " + musica);
    }

    public void pausar(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("MÚSICA PAUSADA");
    }

    public void aumentarVolume(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("VOLUME AUMENTADO");
    }

    public void baixarVolume(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("VOLUME DIMINUÍDO");
    }

    public void avaliarMusica(int nota){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("MÚSICA AVALIADA. NOTA: " + nota);
    }


    //Telefone
    public void fazerLigacao(String numero){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("LIGANDO PARA " + numero);
    }

    public void atenderLigacao(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("LIGAÇÃO ATENDIDA");
    }

    public void recusarLigacao(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("LIGAÇÃO RECUSADA");
    }

    public void finalizarChamada(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else System.out.println("CHAMADA FINALIZADA");
    }

    public void sincronizarContatosMac(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else if (!internet) mensagemSemConexaoInternet();
        else System.out.println("CONTATOS SINCRONIZADOS COM O MAC");
    }


    //Navegador
    public void acessarPagina(String url){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else if (!internet) mensagemSemConexaoInternet();
        else System.out.println("ACESSANDO PÁGINA: " + url);
    }

    public void atualizarPagina(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else if (!internet) mensagemSemConexaoInternet();
        else System.out.println("PÁGINA ATUALIZADA");
    }

    public void fecharPagina(){
        if(!aparelhoLigado) mensagemAparelhoDesligado();
        else if (!internet) mensagemSemConexaoInternet();
        else System.out.println("PÁGINA FECHADA");
    }
}
