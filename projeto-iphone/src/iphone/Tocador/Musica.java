package iphone.Tocador;

public class Musica {
    public String titulo;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Musica: " + titulo;
    }
}
