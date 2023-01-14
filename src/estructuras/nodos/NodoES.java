package estructuras.nodos;

import estructuras.datos.DatoProv;

public class NodoES {

    private DatoProv elemento;
    private NodoES siguiente;

    public NodoES() {
        this.siguiente = null;
    }

    public NodoES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoES siguiente) {
        this.siguiente = siguiente;
    }

    public DatoProv getElemento() {
        return elemento;
    }

    public void setElemento(DatoProv elemento) {
        this.elemento = elemento;
    }

}
