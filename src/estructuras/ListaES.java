package estructuras;

import estructuras.datos.DatoProv;
import estructuras.nodos.NodoES;

public class ListaES {

    private NodoES inicio;
    public String reportes = "";

    public ListaES() {
        this.inicio = null;
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarES(char sexo, String apariencia, String delito, String ubicacion) {

        DatoProv d = new DatoProv();
        d.setSexo(sexo);
        d.setApariencia(apariencia);
        d.setDelito(delito);
        d.setUbicacion(ubicacion);

        NodoES nuevo = new NodoES();
        nuevo.setElemento(d);

        if (esVacia()) {
            inicio = nuevo;
        } else if (d.getUbicacion().compareTo(inicio.getElemento().getUbicacion()) < 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            NodoES aux = inicio;
            while ((aux.getSiguiente() != null) && (aux.getSiguiente().getElemento().getUbicacion()).compareTo(d.getUbicacion()) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public String mostrarES() {
        if (!esVacia()) {
            NodoES aux = inicio;
            while (aux != null) {
                reportes = reportes + "[" + "Sexo: " + aux.getElemento().getSexo() + " - " + "Apariencia: " + aux.getElemento().getApariencia() 
                        + " - " + "Delito: " + aux.getElemento().getDelito() + " - " + "Ubicación: " + aux.getElemento().getUbicacion() + "] <-- ";
                aux = aux.getSiguiente();
            }
        } else {
            reportes = "No hay datos";
        }
        return reportes;
    }
}
