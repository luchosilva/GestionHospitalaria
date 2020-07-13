package cl.ufro.dci.ed.model;

public class Antecedente {
    private String establecimiento;
    private String policlinico;
    private String fecha;
    private String hora;
    private String estado;

    public Antecedente(String establecimiento, String policlinico, String fecha, String hora, String estado) {
        this.establecimiento = establecimiento;
        this.policlinico = policlinico;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPoliclinico() {
        return policlinico;
    }

    public void setPoliclinico(String policlinico) {
        this.policlinico = policlinico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
}
