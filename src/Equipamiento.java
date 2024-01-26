import java.util.Objects;

public class Equipamiento {

private String modelo;
private int talla;


    public Equipamiento(String modelo, int talla) {
        this.modelo = modelo;
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipamiento that = (Equipamiento) o;
        return talla == that.talla && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, talla);
    }

    @Override
    public String toString() {
        return "Equipamiento{" +
                "modelo='" + modelo + '\'' +
                ", talla=" + talla +
                '}';
    }
}
