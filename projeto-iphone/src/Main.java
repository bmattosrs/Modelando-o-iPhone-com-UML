import aparelho.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        //ao tentar utilizar algum método do iPhone sem ligar o aparelho, retornará erro.
        System.out.println("TENTATIVA 1");
        
        iphone.fazerLigacao("51991496074");

        //agora sim...
        System.out.println("\nTENTATIVA 2");

        iphone.ligarAparelho();
        iphone.fazerLigacao("51991496074");

        //da mesma forma, ao tentar usar alguma opção que utilize internet sem antes ligá-la retornará erro...
        System.out.println("\nTENTATIVA 3");

        iphone.sincronizarContatosMac();
        iphone.acessarPagina("www.google.com");

        //agora sim...
        System.out.println("\nTENTATIVA 4");

        iphone.conectarInternet();
        iphone.sincronizarContatosMac();
        iphone.acessarPagina("linkedin.com.br/bmattosrs");

    }
}
