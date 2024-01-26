import java.util.Objects;

public class Entrenador extends Persona implements PuedeEntrenar{

    private String licencia;

    public Entrenador(String dni, int edad, String licencia) {
        super(dni, edad);
        this.licencia = licencia;
    }

    //constructor copia
    public Entrenador(Entrenador entrenador){
        super(entrenador);
        this.licencia=entrenador.licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }



    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public String toString() {
        return  "Entrenador" +super.toString()+","+"Licencia "+" "+licencia;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void amarElAtletismo() {
        System.out.println("Entreno por gusto para mantenerme saludable");

    }

    @Override
    public void entrenar() {
        System.out.println("Disfruto entrenando");
    }


    @Override
    public int hashCode() {
        return Objects.hash(licencia);
    }
}
