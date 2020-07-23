package cl.ufro.dci.ed.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Antecedente implements Comparable<Antecedente>{

    private String area;
    private String detalles;
    private LocalDate fecha;
    private String hora;
    private String estado;

    public Antecedente(String area, String detalles , LocalDate fecha, String hora, String estado) {
        this.area = area;
        this.detalles = detalles;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Antecedente otroAntecedente) {
        if(this.getFecha().compareTo(otroAntecedente.getFecha())<0){
            return -1;
        }else if(this.getFecha().compareTo(otroAntecedente.getFecha())>0){
            return 1;
        }
        return 0;
    }

}
