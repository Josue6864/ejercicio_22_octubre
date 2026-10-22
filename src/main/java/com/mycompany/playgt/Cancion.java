
package com.mycompany.playgt;

/**
 *
 * @author david_oavv7c4
 */
public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() {
        return "Cancion:";
    }

    @Override
    public void reproducir() {
        System.out.println("La cancion que se esta reproduciendo es: " + getTitulo());
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg / 60.0 * 1.5;
    }
}
