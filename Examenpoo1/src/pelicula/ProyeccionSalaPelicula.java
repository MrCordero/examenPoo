package pelicula;

public class ProyeccionSalaPelicula extends Proyeccion{
    private String peliculaNombre;
    private String salaInfo;

    public String getPeliculaNombre() {
        return peliculaNombre;
    }

    public void setPeliculaNombre(String peliculaNombre) {
        this.peliculaNombre = peliculaNombre;
    }

    public String getSalaInfo() {
        return salaInfo;
    }

    public void setSalaInfo(String salaInfo) {
        this.salaInfo = salaInfo;
    }
}
