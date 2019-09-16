package model;

public class Documento {
    private int id;
    private String tipo;
    private String path;

    public Documento(String tipo, String path) {
        this.tipo = tipo;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
