package com.mycompany.playgt;

public class LibroDigital extends Contenido implements Descargable {
    private int paginas;

    public LibroDigital(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public String tipo() {
        return "Libro digital";
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public double calcularTamanoMB() {
        return paginas * 0.2;
    }
}
