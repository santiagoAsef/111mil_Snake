
package registrodealumnos;

import com.sun.javafx.collections.ArrayListenerHelper;
import java.util.ArrayList;
import java.util.Random;


public class RegistroDeAlumnos {


    public static void main(String[] args) {
        persona santiago= new persona("santiago", "asef",true);
        persona agus= new persona("agustina", "nieto", true);
        persona tom = new persona("tomas", "loza", true);
        persona jose= new persona("jose", "perez", true);
        persona edgar = new persona("edgar", "molinari", true);
        persona maga = new persona("magali", "asef", false);
        persona pato =new persona("patricia", "corvalan", false);
        persona dani = new persona("daniel", "fernandez", false);
        persona ale = new persona("alejandro", "vilatta", false);
        persona jony =new persona("jonathan", "baez", false);
        
        ArrayList <persona> registro = new ArrayList <>();
        ArrayList <persona> registroPresentes = new ArrayList <>();
        ArrayList <persona> registroAusente = new ArrayList <>();
        Random rand=new Random();
        int tam;
        int indice1=0;
        int indice2=0;
        int indice3=0;
        
        registro.add(santiago);
        registro.add(agus);
        registro.add(tom);
        registro.add(jose);
        registro.add(edgar);
        registro.add(maga);
        registro.add(pato);
        registro.add(dani);
        registro.add(ale);
        registro.add(jony);
        
        for(persona registrada : registro){
            if(registrada.isPresencia()==true){
                registroPresentes.add(registrada);
            }
            else{
                registroAusente.add(registrada);
            }
        }
        tam=registroPresentes.size();
        persona[]presentes=new persona[tam];
        tam=0;
        System.out.println("los alumnos presentes son:");
        for(persona reg : registroPresentes){
            System.out.println(reg.getApellido()+" "+reg.getNombre());
        }
        System.out.println("--------------------------------------------");
        System.out.println("los alumnos ausentes son:");
        for(persona regi : registroAusente){
            System.out.println(regi.getApellido()+" "+regi.getNombre());
        }
        
        for(persona regis :registroPresentes){
            presentes[1]=regis;
            tam++;
        }
        System.out.println("-------------------------------------------");
        for(int i=0; i<(presentes.length); i+=2){
            indice1=rand.nextInt(presentes.length-1);
            indice2=rand.nextInt(presentes.length-1);
            if(presentes.length%2!=0&& i==presentes.length-4){
                indice3=rand.nextInt(presentes.length-1);
                System.out.println(presentes[indice1].getApellido()+" "+presentes[indice1].getNombre()+" con "+ presentes[indice2].getApellido()+" "+presentes[indice2].getNombre()+" y "+presentes[indice3].getApellido()+" "+presentes[indice3].getNombre());
            }
            else{                
                System.out.println(presentes[indice1].getApellido()+" "+presentes[indice1].getNombre()+" con "+ presentes[indice2].getApellido()+" "+presentes[indice2].getNombre());
                }
        }
        
    }
    
}
