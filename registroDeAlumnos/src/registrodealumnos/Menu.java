
package registrodealumnos;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    Scanner scan=new Scanner(System.in);
    public void mostrarMenu(){
        System.out.println("----------------------------------");
        System.out.println("Menu de sistema escolar:");
        System.out.println("----------------------------------");
        System.out.println("*********Opciones************");        
        System.out.println("1_Agregar profesor:");
        System.out.println("2_Agregar alumno");
        System.out.println("0_Salir");
    }
    
    public void ejecucion(int seleccion){
        ArrayList <Profesor> profes=new ArrayList<>();
        ArrayList <Alumno> alumnos=new ArrayList<>();
        switch (seleccion){
            case 1:
                
                profes.add(new Profesor(datoTexto("Ingrese el nombre del profesor"), datoTexto("Ingrese el apellido del profesor"), true, datoTexto("Ingrese materia que imparte")));
                break;
            case 2:
                System.out.println("Ingrese la materia q cursa");
                
                alumnos.add(new Alumno( datoTexto("Ingrese el nombre del alumno"), datoTexto("Ingrese el apellido del alumno"), true, datoTexto("Ingrese materia que cursa")));
                break;
            default:
                break;
        }
    }
    public String datoTexto(String mensaje){
        System.out.println(mensaje);
        String nombre=scan.next();
        return nombre;
    }
    public void mostrar(ArrayList<Alumno> arreglo, String materia){
        for (Alumno arreglo1 : arreglo) {
            
        }
    }
    
}
