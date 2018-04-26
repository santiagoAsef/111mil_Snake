
package registrodealumnos;

import java.util.Scanner;




public class RegistroDeAlumnos {
    public static void main(String[] args) {
        Menu menuEscolar=new Menu();
    Scanner scan =new Scanner(System.in);
    int opcion;
    do{
        menuEscolar.mostrarMenuPrincipal();
        do{
            opcion=scan.nextInt();
        }while(opcion>3&&opcion<0);    
        menuEscolar.ejecucion(opcion);
    }while(opcion!=0);
    
    }
    
}
