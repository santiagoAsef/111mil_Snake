
package registrodealumnos;


public class Profesor extends persona{
    private String materia;
    public Profesor(String nombre, String apellido, boolean presencia, String materia) {
        super(nombre, apellido, presencia);
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
