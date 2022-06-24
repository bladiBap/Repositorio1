package inter;

public class Archivo extends ArchivoCarpeta{
    

    private String tipoNombre;
    private String tipo;
    private String direccion;
    @Override
    public String toString() {
        return this.getNombre();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setTamaño(long tamaño) {
        super.setTamaño(tamaño);
        convertir(tamaño);
    }

    public void convertir (long bytes){
        if (bytes>=0 && bytes <= 1000){
            this.tamaño = bytes;
            tipoNombre =  "bytes";
        } else if (bytes>1000 && bytes <= 1000000) {
            this.tamaño = bytes/1000;
            tipoNombre =  "Kb";
        }
    }

    public String getTipoNombre() {
        return tipoNombre;
    }

    public void setTipoNombre(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }
}
