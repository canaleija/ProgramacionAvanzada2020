package entidades;
import entidades.Horario;
import entidades.Docente;

public class Materia{
    
    private String nombre;
    private Horario horario;
    private String aula;
    private double creditos;
    private Docente docente;

    public Materia() {
        this.nombre = "";
        this.aula = "";
        this.creditos = 0;
        this.horario = new Horario();
        // este constructor de docente tiene una parte nula
        this.docente = new Docente();

    }

    public Materia(String nombre, Horario horario, String aula, double creditos, Docente docente) {
        this.nombre = nombre;
        this.horario = horario;
        this.aula = aula;
        this.creditos = creditos;
        this.docente = docente;
    }


  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

 
    
}
