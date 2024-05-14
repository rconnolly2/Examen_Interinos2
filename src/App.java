import java.util.ArrayList;

public class App {
    public void adjudicarPlazas(ArrayList<Plaza> lst_plazas, ArrayList<Persona> lst_pers) {
        // Primero creo 2 listas de Docentes y Sanitarios que estaran ordenados segun su criterio:
        ArrayList<Docente> lst_doc = new ArrayList<Docente>();
        ArrayList<Sanitario> lst_san = new ArrayList<Sanitario>();

        // Separo objetos segun su tipo:
        for (Persona per : lst_pers) {
            if (per instanceof Docente) {
                lst_doc.add((Docente) per);
            } else {
                lst_san.add((Sanitario) per);
            }
        }

        // Ordeno lista segun su criterio:
        lst_doc.sort(new ComparatorDocente());
        lst_san.sort(new ComparatorSanitario());

        for (Plaza pla : lst_plazas) {
            if (pla.getTipo() == "S") {
                pla.AdjudicarPlaza(lst_san.remove(0));
            } else {
                pla.AdjudicarPlaza(lst_doc.remove(0));
            }
        }
    }

    public void mostrarAdjudicaciones(ArrayList<Plaza> plazas) {
        for (Plaza pla : plazas) {
            if (pla.getTipo().equals("S")) {
                System.out.println(pla);
            }
        }

        for (Plaza pla : plazas) {
            if (pla.getTipo().equals("D")) {
                System.out.println(pla);
            }
        }
    }

    public void simularAdjudicaciones(ArrayList<Plaza> lst_plazas, ArrayList<Persona> lst_personas) {

        Docente d1 = new Docente("Maximo", "Fernandez", "Riera", "Grado", 10.0);
        Docente d2 = new Docente("Miquel", "Ferrer", "Miro", "FP2", 7.0);
        Docente d3 = new Docente("Pilar", "Pozo", "Ramis", "Grado", 6.0);
        Sanitario s1 = new Sanitario("Jorge", "Melia", "Flexas", "Circujano", 47);
        Sanitario s2 = new Sanitario("Marga", "Bauza", "Ramis", "Neurologa", 180);

        lst_personas.add(d1);
        lst_personas.add(d2);
        lst_personas.add(d3);
        lst_personas.add(s1);
        lst_personas.add(s2);

        Plaza p1 = new Plaza("S");
        Plaza p2 = new Plaza("D");
        Plaza p3 = new Plaza("D");

        lst_plazas.add(p1);
        lst_plazas.add(p2);
        lst_plazas.add(p3);



    }
    public void main(String[] args) {
        ArrayList<Plaza> listaPlaza = new ArrayList<Plaza>();
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        simularAdjudicaciones(listaPlaza, listaPersona);
        adjudicarPlazas(listaPlaza, listaPersona);
        mostrarAdjudicaciones(listaPlaza);

    }
}
