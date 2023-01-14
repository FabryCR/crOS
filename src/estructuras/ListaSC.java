package estructuras;

import estructuras.datos.DatoProv;
import estructuras.nodos.NodoSC;

public class ListaSC {

    private NodoSC inicio;
    private NodoSC fin;
    public String reportes = "";

    public ListaSC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaSC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarSC(char sexo, String apariencia, String delito, String ubicacion) {

        DatoProv d = new DatoProv();
        d.setSexo(sexo);
        d.setApariencia(apariencia);
        d.setDelito(delito);
        d.setUbicacion(ubicacion);

        NodoSC nuevo = new NodoSC();
        nuevo.setElemento(d);

        if (esVaciaSC()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
        } else if (d.getUbicacion().compareTo(inicio.getElemento().getUbicacion()) < 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
        } else if (d.getUbicacion().compareTo(fin.getElemento().getUbicacion()) >= 0) {
            fin.setSiguiente(nuevo);
            fin = nuevo;
            fin.setSiguiente(inicio);
        } else {
            NodoSC aux = inicio;
            while (aux.getSiguiente().getElemento().getUbicacion().compareTo(d.getUbicacion()) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            fin.setSiguiente(inicio);
        }
    }

    public String mostrarSC() {

        if (!esVaciaSC()) {
            NodoSC aux = inicio;
            reportes = reportes + "Sexo: " + aux.getElemento().getSexo() + "--" + "Apariencia: " + aux.getElemento().getApariencia() 
                    + "--" + "Delito: " + aux.getElemento().getDelito() + "--" + "Ubicación: " + aux.getElemento().getUbicacion() + " <-- ";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                reportes = reportes + "Sexo: " + aux.getElemento().getSexo() + "--" + "Apariencia: " + aux.getElemento().getApariencia() 
                        + "--" + "Delito: " + aux.getElemento().getDelito() + "--" + "Ubicación: " + aux.getElemento().getUbicacion() + " <-- ";
                aux = aux.getSiguiente();
            }
        } else {
            reportes = "No hay datos";
        }
        return reportes;
    }
}
