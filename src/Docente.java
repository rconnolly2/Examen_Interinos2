import java.util.Comparator;

public class Docente extends Persona {
    private String titulacion;
    private Double puntos;

    public Docente(String nom, String apell1, String apell2, String titul, Double punt) {
        super(nom, apell1, apell2); // Ejecuto constructor de la clase padre
        this.titulacion = titul;
        if (punt < 0 || punt > 10) {
            throw new IllegalArgumentException("Puntuacion invalida!");
        }
        this.puntos = punt;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public Double getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "ID persona: "+id+"\n"+
               " Nombre: "+nombre+"\n"+
               " Apellido1: "+apellido1+"\n"+
               " Apellido2: "+apellido2+"\n"+
               " Titulacion: "+getTitulacion()+"\n"+
               " Puntos: "+getPuntos()+"\n";
    }
}

class ComparatorDocente implements Comparator<Docente> {
    public int compare(Docente d1, Docente d2) {
        return Double.compare(d1.getPuntos(), d2.getPuntos());
    }
}
