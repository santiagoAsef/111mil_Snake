
package registrodealumnos;


public abstract class persona implements AccionesMinimas{
    private String nombre;
    private String apellido;
    private boolean presencia;

    public persona(String nombre, String apellido, boolean presencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.presencia = presencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isPresencia() {
        return presencia;
    }

    public void setPresencia(boolean presencia) {
        this.presencia = presencia;
    }

    
    public void respirar() {
        System.out.println("las personas deben respirar para vivir");
    }

    
    public void caminar() {
        System.out.println("caminar es saludable");
    }
    
    
}
