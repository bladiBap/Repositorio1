import otros.Arbol;

public class ArbolArchivos extends Arbol.Nodo <ArchivoCarpeta>  {

    private Arbol.Nodo <ArchivoCarpeta> raiz;

   // public ArbolArchivos (){
       // super();
     //   this.raiz= null;
    //}
    public ArbolArchivos(ArchivoCarpeta c, String id) {
        super(c, id);
    }
    public void insertar( ArchivoCarpeta o, String id, String idPadre) {
        Arbol.Nodo<ArchivoCarpeta> nuevo = new Arbol.Nodo<>(o, id);

        if (raiz == null && idPadre == null) {
            raiz = nuevo;
            return;
        }
        Arbol.Nodo<ArchivoCarpeta> aux = buscar(idPadre);
        aux.getHijos().adicionar(nuevo);
    }
    public Arbol.Nodo<ArchivoCarpeta> buscar(String id) {
        return raiz.encontrar(id);
    }
    public Arbol.Nodo<ArchivoCarpeta> encontrar(String id) {
        if (this.id.equalsIgnoreCase(id)) {
            return this;
        }
        for (Arbol.Nodo<ArchivoCarpeta> hijo :
                hijos) {
            Arbol.Nodo<ArchivoCarpeta> encontrado = hijo.encontrar(id);
            if (encontrado != null) {
                return encontrado;
            }
        }
        return null;
    }
}
