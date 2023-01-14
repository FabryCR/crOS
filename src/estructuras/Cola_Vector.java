package estructuras;

import estructuras.datos.DatoProv;
import estructuras.nodos.NodoCola2;

public class Cola_Vector {

    private NodoCola2 inicio;
    private NodoCola2 fin;
    private int x = 0;
    public String reportes = "";

    public Cola_Vector() {
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
    
    //Copia la cola al vector y lo guarda en "reportes" para mostrarlo
    public String CopiaVector_y_Mostrar() {

        int cont = 0;
        if (!esVacia()) {
            NodoCola2 aux = inicio;
            while (aux != null) {
                cont++;
                aux = aux.getSiguiente();
            }
        }

        String[] vec = new String[cont];

        if (!esVacia()) {
            NodoCola2 aux = inicio;
            while (aux != null) {
                llenarVector(Character.toString(aux.getElemento().getSexo()), aux.getElemento().getApariencia(), aux.getElemento().getDelito(), aux.getElemento().getUbicacion(), vec);
                aux = aux.getSiguiente();
                x = x + 1;
            }
            x = 0;
            for (int i = 0; i < vec.length; i++) {
                reportes = reportes + vec[i];
            }
        } else {
            reportes = "No hay datos";
        }

        return reportes;
    }

    //Llena el Vector
    public void llenarVector(String sexo, String apariencia, String delito, String ubicación, String[] vec) {
        vec[x] = "Sexo: " + sexo + " / " + "Apariencia: " + apariencia + " / " + "Delito: " + delito + " / " + "Ubicación: " + ubicación + " <--- ";
    }

    public void encolar(char sexo, String apariencia, String delito, String ubicacion) {

        DatoProv d = new DatoProv();
        d.setSexo(sexo);
        d.setApariencia(apariencia);
        d.setDelito(delito);
        d.setUbicacion(ubicacion);

        NodoCola2 nuevo = new NodoCola2();
        nuevo.setElemento(d);

        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
}
