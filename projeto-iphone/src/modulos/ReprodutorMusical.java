package modulos;

public interface ReprodutorMusical {
    public void tocarMusica(String musica);
    public void pausar();
    public void aumentarVolume();
    public void baixarVolume();
    public void avaliarMusica(int nota);
}
