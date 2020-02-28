
import entidades.Persona;

public class Main {

    public static void main(String[] args) {
       
        System.out.println();
        // ejecutar un metodo Constructor 
        Persona beto = new Persona(23, 170, 67.4);
        Persona martha = new Persona();
        martha.setAltura(67);
        martha.setPeso(56.7);
        martha.setEdad(17);
        System.out.println();
        beto.setEdad(56);
        int x = beto.getAltura();
        System.out.println(x);

       
    

      
    }

}