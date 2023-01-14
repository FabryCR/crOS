package estructuras;

import estructuras.datos.DatoProv;
import estructuras.nodos.NodoDC;

public class ListaDC {

    private NodoDC inicio;
    private NodoDC fin;
    public String reportes = "";

    public ListaDC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaDC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarDC(char sexo, String apariencia, String delito, String ubicacion) {

        DatoProv d = new DatoProv();
        d.setSexo(sexo);
        d.setApariencia(apariencia);
        d.setDelito(delito);
        d.setUbicacion(ubicacion);

        NodoDC nuevo = new NodoDC();
        nuevo.setElemento(d);

        if (esVaciaDC()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (d.getUbicacion().compareTo(inicio.getElemento().getUbicacion()) < 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (d.getUbicacion().compareTo(fin.getElemento().getUbicacion()) >= 0) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoDC aux = inicio;
            while (aux.getSiguiente().getElemento().getUbicacion().compareTo(d.getUbicacion()) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public String mostrarDC() {

        if (!esVaciaDC()) {
            NodoDC aux = inicio;
            reportes = reportes + "Sexo: " + aux.getElemento().getSexo() + "--" + "Apariencia: " + aux.getElemento().getApariencia() + "--" 
                    + "Delito: " + aux.getElemento().getDelito() + "--" + "Ubicación: " + aux.getElemento().getUbicacion() + " <==> ";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                reportes = reportes + "Sexo: " + aux.getElemento().getSexo() + "--" + "Apariencia: " + aux.getElemento().getApariencia() 
                        + "--" + "Delito: " + aux.getElemento().getDelito() + "--" + "Ubicación: " + aux.getElemento().getUbicacion() + " <==> ";
                aux = aux.getSiguiente();
            }
        } else {
            reportes = "No hay datos";
        }

        return reportes;
    }
}
