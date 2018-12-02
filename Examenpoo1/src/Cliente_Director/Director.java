package Cliente_Director;

import java.util.Objects;

public class Director extends ClasePadre{
    private String nacionalidad;

    @Override
    public String toString() {
        return "Director{" + "nacionalidad=" + nacionalidad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.nacionalidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Director other = (Director) obj;
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
