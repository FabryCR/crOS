package estructuras;

import estructuras.nodos.NodoCola;
import estructuras.datos.DatoProv;

public class Cola {

    private NodoCola inicio;
    private NodoCola fin;
    public String reportes = "";

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar(char sexo, String apariencia, String delito, String ubicacion) {

        DatoProv d = new DatoProv();
        d.setSexo(sexo);
        d.setApariencia(apariencia);
        d.setDelito(delito);
        d.setUbicacion(ubicacion);

        NodoCola nuevo = new NodoCola();
        nuevo.setElemento(d);

        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public String mostrarElementos() {
        if (!esVacia()) {
            NodoCola aux = inicio;
            while (aux != null) {
                reportes = reportes + "Sexo: " + aux.getElemento().getSexo() + " / " + "Apariencia: " + aux.getElemento().getApariencia() + " / " + "Delito: " 
                        + aux.getElemento().getDelito() + " / " + "Ubicación: " + aux.getElemento().getUbicacion() + " <--- ";
                aux = aux.getSiguiente();
            }
        } else {
            reportes = "No hay datos";
        }
        return reportes;
    }
}
