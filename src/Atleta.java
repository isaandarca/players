public class Atleta extends Persona implements PuedeEntrenar{
    private String disciplina;
    private Entrenador entrenador;
    private Equipamiento equipamiento;


    public Atleta(String dni, int edad, String disciplina, Entrenador entrenador, Equipamiento equipamiento) {
        super(dni, edad);
        this.disciplina = disciplina;
        this.entrenador = entrenador;
        this.equipamiento = equipamiento;
    }

//constructor copia
    public Atleta(Atleta atleta){
        super(atleta);
        this.disciplina=atleta.disciplina;
        this.entrenador= atleta.entrenador;
        this.equipamiento= atleta.equipamiento;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Equipamiento getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }


    @Override
    public String toString() {
        return "Atleta{" +
                "Dni"+ getDni()+
                 "disciplina='" + disciplina + '\'' +
                ", entrenador=" + entrenador +
                ", equipamiento=" + equipamiento +
                '}';
    }

    @Override
    public void amarElAtletismo() {
        System.out.println("Disfruto el atletismo");

    }

    @Override
    public void entrenar() {
        System.out.println("Amo entrenar para mejorar");

    }



    public void comprobarEquipamiento(){
        if(equipamiento==null){
            System.out.println("No tienes equipamiento");
        }else{
            System.out.println("Tienes lo necesario para entrenar");
        }
    }
}



