package inter;

import inter.ArchivoCarpeta;

public class Archivo extends ArchivoCarpeta {

    private String tipo = "";
    @Override
    public String toString() {
        return this.getNombre();
    }

    public void tipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
