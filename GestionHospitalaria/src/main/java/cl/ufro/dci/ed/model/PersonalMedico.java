package cl.ufro.dci.ed.model;

import java.util.ArrayList;

public class PersonalMedico extends Persona{
    private String profesion;
    private grupoSanguineo grupoSanguineo;
    public PersonalMedico(String rut, String nombre, String sexo, int edad, String apellidoPaterno, String apellidoMaterno, String nacionalidad, String etnia, String direccion, double estatura, double peso, String email, situacionSentimental situacionSentimental, String profesion, grupoSanguineo grupoSanguineo) {
        super(rut, nombre, sexo, edad, apellidoPaterno, apellidoMaterno, nacionalidad, etnia, direccion, estatura, peso, email, situacionSentimental);
        this.profesion = profesion;
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String getRut() {
        return super.getRut();
    }

    @Override
    public void setRut(String rut) {
        super.setRut(rut);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public String getApellidoPaterno() {
        return super.getApellidoPaterno();
    }

    @Override
    public void setApellidoPaterno(String apellidoPaterno) {
        super.setApellidoPaterno(apellidoPaterno);
    }

    @Override
    public String getApellidoMaterno() {
        return super.getApellidoMaterno();
    }

    @Override
    public void setApellidoMaterno(String apellidoMaterno) {
        super.setApellidoMaterno(apellidoMaterno);
    }

    @Override
    public String getNacionalidad() {
        return super.getNacionalidad();
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        super.setNacionalidad(nacionalidad);
    }

    @Override
    public String getEtnia() {
        return super.getEtnia();
    }

    @Override
    public void setEtnia(String etnia) {
        super.setEtnia(etnia);
    }

    @Override
    public void agregarTelefono(int telefono) {
        super.agregarTelefono(telefono);
    }

    @Override
    public ArrayList<Integer> getTelefonos() {
        return super.getTelefonos();
    }

    @Override
    public void setTelefonos(ArrayList<Integer> telefonos) {
        super.setTelefonos(telefonos);
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public double getEstatura() {
        return super.getEstatura();
    }

    @Override
    public void setEstatura(double estatura) {
        super.setEstatura(estatura);
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public cl.ufro.dci.ed.model.situacionSentimental getSituacionSentimental() {
        return super.getSituacionSentimental();
    }

    @Override
    public void setSituacionSentimental(cl.ufro.dci.ed.model.situacionSentimental situacionSentimental) {
        super.setSituacionSentimental(situacionSentimental);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public cl.ufro.dci.ed.model.grupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(cl.ufro.dci.ed.model.grupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
