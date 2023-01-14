package estructuras;

import estructuras.nodos.NodoPila;
import estructuras.datos.DatoGeneral;
import javax.swing.JOptionPane;

public class Pila {

    private NodoPila cima;
    public String reportes = "";

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(String nombre, int cedula, char sexo, int edad, String nacionalidad, String ubicacion, String detalles) {

        DatoGeneral d = new DatoGeneral();
        d.setNombre(nombre);
        d.setCedula(cedula);
        d.setSexo(sexo);
        d.setEdad(edad);
        d.setNacionalidad(nacionalidad);
        d.setUbicacion(ubicacion);
        d.setDetalles(detalles);

        NodoPila nuevo = new NodoPila();
        nuevo.setElemento(d);
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el último dato");
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos para eliminar");
        }
    }

    public String mostrarElementos() {
        if (!esVacia()) {
            NodoPila aux = cima;
            while (aux != null) {
                reportes = reportes + "Nombre: " + aux.getElemento().getNombre() + " / " + "Cédula: " + aux.getElemento().getCedula() + " / " + "Sexo: " + aux.getElemento().getSexo() + " / "
                        + "Edad: " + aux.getElemento().getEdad() + " / " + "Nacionalidad: " + aux.getElemento().getNacionalidad() + " / "
                        + "Ubicación: " + aux.getElemento().getUbicacion() + " / " + "Detalles: " + aux.getElemento().getDetalles() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            reportes = "No hay datos";
        }

        return reportes;
    }
}
