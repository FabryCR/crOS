package estructuras.nodos;

import estructuras.datos.DatoProv;

public class NodoSC {

    private DatoProv elemento;
    private NodoSC siguiente;

    public NodoSC() {
        this.siguiente = null;
    }

    public DatoProv getElemento() {
        return elemento;
    }

    public void setElemento(DatoProv elemento) {
        this.elemento = elemento;
    }

    public NodoSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }

}
