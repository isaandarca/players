public abstract class Persona {


    private String dni;
    private int edad;


    public Persona(String dni, int edad) {
     setDni(dni);
     setEdad(edad);
    }

    //constructor copia
    public Persona(Persona persona){
        this.dni= persona.dni;
        this.edad= persona.edad;
    }





    public String getDni() {
        return dni;
    }


    //realmente no se si está bien lo de isEmpty
    public void setDni(String dni) {
        if(dni==null && dni.isEmpty()){
            throw new IllegalArgumentException("No puede ser null");
        }else{
            this.dni = dni;
        }

    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        if(edad<3 && edad >100){
            throw new IllegalArgumentException("La edad tiene que estar comprenndida entre 3 y 100");
        }else{
        this.edad = edad;
        }
    }


    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }



    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null)return false;
        if(getClass()!=obj.getClass())return false;
        Persona perso=(Persona) obj;
        return this.dni.equalsIgnoreCase(perso.dni);
    }
// creo el metodo poniendo el dni como comparador




    public abstract void amarElAtletismo();










}
