package estructuras.nodos;

import estructuras.datos.DatoProv;

public class NodoCola {

    private DatoProv elemento;
    private NodoCola siguiente;

    public NodoCola() {
        this.siguiente = null;
    }

    public DatoProv getElemento() {
        return elemento;
    }

    public void setElemento(DatoProv elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

}
