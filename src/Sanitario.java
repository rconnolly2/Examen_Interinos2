import java.util.Comparator;

public class Sanitario extends Persona {
    private String especialidad;
    private Integer dias_trabaj;

    public Sanitario(String nombre, String apellido1, String apellido2, String espec, Integer d_trabaj) {
        super(nombre, apellido1, apellido2);
        this.especialidad = espec;
        if (d_trabaj < 0 || d_trabaj > 100000) {
            throw new IllegalArgumentException("Dias trabajados no validos!");
        }
        this.dias_trabaj = d_trabaj;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Integer getDias_trabaj() {
        return dias_trabaj;
    }

    @Override
    public String toString() {
        return "ID persona: "+id+"\\n"+
                " Nombre: "+nombre+"\\n"+
                " Apellido1: "+apellido1+"\\n"+
                " Apellido2: "+apellido2+"\\n"+
                " Especialidad: "+getEspecialidad()+"\\n"+
                " Dias trabajados: "+getDias_trabaj()+"\\n";
    }
}

class ComparatorSanitario implements Comparator<Sanitario> {
    public int compare(Sanitario s1, Sanitario s2) {
        return Integer.compare(s1.getDias_trabaj(), s2.getDias_trabaj());
    }
}
