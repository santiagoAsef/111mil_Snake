
package registrodealumnos;


public class Alumno extends persona{
    private static int newId=0;
    private int id;
    private String materiaCursada;

    public Alumno( String nombre, String apellido, boolean presencia, String materiaCursada) {
        super(nombre, apellido, presencia);
        this.id=++newId;
        this.materiaCursada=materiaCursada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateriaCursada() {
        return materiaCursada;
    }

    public void setMateriaCursada(String materiaCursada) {
        this.materiaCursada = materiaCursada;
    }

    
    
    
    
    
    
}
