public abstract class Persona {
    // La clase es abstracta porque quiero que persona no se pueda instanciar
    protected Integer id;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected static Integer contador = 0;
    
    public Persona(String nom, String apell1, String apell2) {
        this.id = contador;
        this.nombre = nom;
        this.apellido1 = apell1;
        this.apellido2 = apell2;
        IncrementarContador();
    }

    private static void IncrementarContador() {
        contador++;
    }

    public abstract String toString();
    
}
