import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        Entrenador primerEntrenador = new Entrenador("00000001A", 50, "Autonómica");
        Entrenador segundoEntrenador = new Entrenador("00000002B", 55, "Nacional");
        Entrenador tercerEntrenador = new Entrenador("00000003C", 43, "Internacional");

        entrenadores.add(primerEntrenador);
        entrenadores.add(segundoEntrenador);
        entrenadores.add(tercerEntrenador);


        ordenarPorEdadAscendente(entrenadores);
        System.out.println(entrenadores);

        System.out.println("------------------");


        ordenarPorEdadDescendente(entrenadores);
        System.out.println(entrenadores);

        System.out.println("-----------------");
        ArrayList<Entrenador>entrenadorFiltrado=filtrarPorLicencia(entrenadores,"internacional");
//nuevo array con los filtrados
        System.out.println(entrenadorFiltrado);


      //Ejercicio herencia
        Equipamiento equipamiento = new Equipamiento("Estandar", 40);
        Atleta primerAtleta = new Atleta("00000011A", 26, "Salto", primerEntrenador,
                equipamiento);
        Atleta segundoAtleta = new Atleta(primerAtleta);
        segundoAtleta.setDni("00000012B");
        segundoAtleta.setEdad(31);
        primerEntrenador.setLicencia("Nacional");
        equipamiento.setTalla(50);
        Atleta tercerAtleta = new Atleta("00000013C", 19, "Lanzamiento de peso", null,
                equipamiento);

        ArrayList<Persona>personas=new ArrayList<>();
        personas.add(primerEntrenador);
        personas.add(primerAtleta);
        personas.add(segundoAtleta);
        personas.add(tercerAtleta);

        System.out.println(personas);


        Collections.shuffle(personas);


        for(Persona persona:personas){
            if(persona instanceof Atleta){
                ((Atleta) persona).comprobarEquipamiento();
            }
            if(persona instanceof Entrenador){
                ((Entrenador)persona).entrenar();
            }
        }









    }

    //Este método los ordena en forma ascendente
    public static void ordenarPorEdadAscendente(ArrayList<Entrenador> entrenadores) {
        entrenadores.sort(new Comparator<Entrenador>() {
            @Override
            public int compare(Entrenador a, Entrenador b) {
                if (a.getEdad() > b.getEdad()) return 1;
                if (a.getEdad() < b.getEdad()) return -1;
                return a.getDni().compareToIgnoreCase(b.getDni());
            }

        });


    }

    //Igual que el método anterior pero cambio la comparativa es lo único que se me ocurre en darle la vuelta al return donde es mayor hago que devuleva -1 y en la siguiente 1 asi le doy la vuelta, lo que se me ha ocurrido
    public static void ordenarPorEdadDescendente(ArrayList<Entrenador> entrenadores) {
        entrenadores.sort(new Comparator<Entrenador>() {
            @Override
            public int compare(Entrenador a, Entrenador b) {
                if (a.getEdad() > b.getEdad()) return -1;
                if (a.getEdad() < b.getEdad()) return 1;
                return a.getDni().compareToIgnoreCase(b.getDni());
            }

        });







    }
//crea una nueva lista filtrando por el parametro licencia//se crea un nuevo array con los filtrados que lo creo arriba

    public static ArrayList<Entrenador> filtrarPorLicencia(ArrayList<Entrenador>entrenadores,String licencia){
        return entrenadores.stream()
                .filter(c -> c.getLicencia().equalsIgnoreCase(licencia))
                .collect(Collectors.toCollection(ArrayList::new));
    }


}
