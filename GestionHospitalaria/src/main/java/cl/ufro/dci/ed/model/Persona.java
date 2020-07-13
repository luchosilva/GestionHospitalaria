package cl.ufro.dci.ed.model;

import java.util.ArrayList;

public abstract class Persona {

    private String rut;
    private String nombre;
    private String sexo;
    private int edad;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String representanteLegal;
    private String nacionalidad;
    private String etnia;
    private ArrayList <Integer> telefonos;
    private String region;
    private String comuna;
    private String direccion;
    private double estatura;
    private double peso;
    private String email;
    private situacionSentimental situacionSentimental;
    private String ocupacion;

    public Persona(String rut, String nombre, String sexo, int edad, String apellidoPaterno, String apellidoMaterno, String representanteLegal, String nacionalidad, String etnia, String region, String comuna, String direccion, double estatura, double peso, String email, situacionSentimental situacionSentimental, String ocupacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.representanteLegal = representanteLegal;
        this.nacionalidad = nacionalidad;
        this.etnia = etnia;
        this.telefonos = new ArrayList<>();
        this.region = region;
        this.comuna = comuna;
        this.direccion = direccion;
        this.estatura = estatura;
        this.peso = peso;
        this.email = email;
        this.situacionSentimental = situacionSentimental;
        this.ocupacion = ocupacion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public void agregarTelefono (int telefono) {
        this.telefonos.add(telefono);
    }

    public ArrayList<Integer> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        this.telefonos = telefonos;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public cl.ufro.dci.ed.model.situacionSentimental getSituacionSentimental() {
        return situacionSentimental;
    }

    public void setSituacionSentimental(situacionSentimental situacionSentimental) {
        this.situacionSentimental = situacionSentimental;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
