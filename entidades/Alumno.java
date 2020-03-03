package entidades;

public class Alumno extends Persona {

    private String matricula;
    private boolean edoAcademico;
    private String[] materias;

    public Alumno(){
        this.matricula ="";
        this.edoAcademico = true;
        materias = new String[10];
    }

    public Alumno(String matricula, boolean edoAcademico, String[] materias){
        this.matricula = matricula;
        this.edoAcademico = edoAcademico;
        this.materias = materias;
    }

    public void saludar(){
        super.saludar();
        System.out.println(" y Soy alumno");
    }

}