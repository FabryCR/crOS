package estructuras.nodos;

import estructuras.datos.DatoGeneral;

public class NodoPila {

    private DatoGeneral elemento;
    private NodoPila siguiente;

    public NodoPila() {
        this.siguiente = null;
    }

    public DatoGeneral getElemento() {
        return elemento;
    }

    public void setElemento(DatoGeneral elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

}
