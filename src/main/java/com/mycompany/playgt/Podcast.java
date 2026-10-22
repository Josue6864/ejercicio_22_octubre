package com.mycompany.playgt;

public class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;
    private String episodio;

    public Podcast(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public String tipo() {
        return "Podcast:";
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg / 60.0 * 1.5;
    }

    @Override
    public void reproducir() {
        System.out.println("La cancion que se esta reproduciendo es: " + getTitulo());
    }

}
