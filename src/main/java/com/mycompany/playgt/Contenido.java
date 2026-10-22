
package com.mycompany.playgt;

/**
 *
 * @author david_oavv7c4
 */
abstract class Contenido {
    private String titulo;
    private String autor;

    public Contenido() {
    }

    public Contenido(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public abstract String tipo();

    @Override
    public String toString() {
        return tipo() + "Titulo: " + titulo + " Autor: " + autor;
    }

}
