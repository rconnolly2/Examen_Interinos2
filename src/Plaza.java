public class Plaza {
    private Integer id;
    private String tipo;
    private boolean adjudicada = false;
    private Persona pers;
    private static Integer contador = 0;

    public Plaza(String tipo_arg) {
        this.id = contador;
        this.tipo = tipo_arg;
        IncrementarContador();
    }

    private static void IncrementarContador() {
        contador++;
    }

    public void AdjudicarPlaza(Persona per) {
        if (pers != null) {
            throw new IllegalArgumentException("Plaza ya adjudicada!");
        }
        this.pers = per;
        this.adjudicada = true;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getAdjudicada() {
        return adjudicada;
    }

    @Override
    public String toString() {
        return "ID persona: "+id+"\n"+
        "Persona: "+pers+"\n"+
        " ID: "+id+"\n"+
        " Tipo: "+getTipo()+"\n"+
        " Adjudicada: "+getAdjudicada()+"\n";
    }

}
