package entidades;

public class Horario {

    private String hEntrada;
    private String hSalida;

    public Horario(){
        this.hEntrada ="0:00";
        this.hSalida = "0:00";
    }

    public Horario(String hEntrada, String hSalida){
        this.hEntrada =hEntrada;
        this.hSalida = hSalida;
    }

    public String gethEntrada() {
        return hEntrada;
    }

    public void sethEntrada(String hEntrada) {
        this.hEntrada = hEntrada;
    }

    public String gethSalida() {
        return hSalida;
    }

    public void sethSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    


    



}