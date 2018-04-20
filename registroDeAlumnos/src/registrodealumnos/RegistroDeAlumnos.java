
package registrodealumnos;


import java.util.*;
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
        
        System.out.println("los alumnos presentes son:");
        for(persona reg : registroPresentes){
            System.out.println(reg.getApellido()+" "+reg.getNombre());
        }
        System.out.println("--------------------------------------------");
        System.out.println("los alumnos ausentes son:");
        for(persona regi : registroAusente){
            System.out.println(regi.getApellido()+" "+regi.getNombre());
        }
        
        
        System.out.println("-------------------------------------------");
        System.out.println(registroPresentes);
        
        for(int i=0;i<(registroPresentes.size()/2);i++){
            indice1=rand.nextInt();
            indice2=rand.nextInt();
            if(registroPresentes.size()%2!=0){
                if(i<(registroPresentes.size()-4)){
                    System.out.println(registroPresentes.get(indice1)+" con "+registroPresentes.get(indice2));
                    registroPresentes.remove(indice1);
                    registroPresentes.remove(indice2);
                }else{
                    indice3=rand.nextInt();
                    System.out.println(registroPresentes.get(indice1)+" con "+registroPresentes.get(indice2)+" y "+registroPresentes.get(indice3));
                    registroPresentes.remove(indice1);
                    registroPresentes.remove(indice2);
                    registroPresentes.remove(indice3);
                }
            }else{
                System.out.println(registroPresentes.get(indice1)+" con "+registroPresentes.get(indice2));
                registroPresentes.remove(indice1);
                registroPresentes.remove(indice2);
            }
        }
    }
    
}
