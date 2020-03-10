package entidades;

public class Docente extends Persona{

    private double salario;
    private String[] materias;
    private Horario horario;

    public Docente() {
        this.salario = 0;
        // warning 
        this.materias = null;
        this.horario = new Horario();
    }


    public Docente(int tmaterias) {
        this.salario = 0;
        this.materias = new String[tmaterias];
        this.horario = new Horario();
    }

    public Docente(double salario, String[] materias, Horario horario) {
        this.salario = salario;
        this.materias = materias;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

  
    

}