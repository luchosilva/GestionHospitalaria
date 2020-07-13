package cl.ufro.dci.ed.model;

public class Prevision {
    private String tipo;
    private String grupoOmodalidad;

    public Prevision(String tipo, String grupoOmodalidad) {
        this.tipo = tipo;
        this.grupoOmodalidad = grupoOmodalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGrupoOmodalidad() {
        return grupoOmodalidad;
    }

    public void setGrupoOmodalidad(String grupoOmodalidad) {
        this.grupoOmodalidad = grupoOmodalidad;
    }
}
