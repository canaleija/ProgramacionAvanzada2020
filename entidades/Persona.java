package entidades;



public class Persona{

    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    
    public Persona(){
       edad = 0;
       altura = 0;
       peso = 0; 
       nombre = "";
    }

    public Persona(int e, int a, double p, String nombre){
        edad = e;
        altura = a;
        peso = p;
        this.nombre = nombre;
    }
    
    // metodos get y set de edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad ;
    }

    // metodos get y set de edad
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura ;
    }
    
    // metodos get y set de edad
    public double getPeso(){
        return edad;
    }
    public void setPeso(double peso){
        this.peso = peso ;
    }
   
    public void saludar(){
        System.out.println("Hola");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    
    
}