package estructuras.datos;

public class DatoProv {

    private char sexo;
    private String apariencia;
    private String delito;
    private String ubicacion;

    public DatoProv() {

        this.sexo = '\0';
        this.apariencia = "";
        this.delito = "";
        this.ubicacion = "";
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
