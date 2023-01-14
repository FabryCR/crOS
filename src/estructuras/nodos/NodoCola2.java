package estructuras.nodos;

import estructuras.datos.DatoProv;

public class NodoCola2 {

    private DatoProv elemento;
    private NodoCola2 siguiente;

    public NodoCola2() {
        this.siguiente = null;
    }

    public DatoProv getElemento() {
        return elemento;
    }

    public void setElemento(DatoProv elemento) {
        this.elemento = elemento;
    }

    public NodoCola2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola2 siguiente) {
        this.siguiente = siguiente;
    }

}
