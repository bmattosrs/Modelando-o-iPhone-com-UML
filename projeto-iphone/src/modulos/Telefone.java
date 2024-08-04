package modulos;

public interface Telefone {
    public void fazerLigacao(String numero);
    public void atenderLigacao();
    public void recusarLigacao();
    public void finalizarChamada();
    public void sincronizarContatosMac();
}
