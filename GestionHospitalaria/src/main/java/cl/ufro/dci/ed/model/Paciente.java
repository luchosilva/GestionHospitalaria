package cl.ufro.dci.ed.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona implements Comparable<Paciente>{

    private static int id = 1;
    private int idPaciente;
    private List<Antecedente> antecedentes = new ArrayList<Antecedente>();
    private grupoSanguineo grupoSanguineo;
    private Prevision prevision;

    /**
     * Constructor principal de la clase Paciente.
     * @param rut - String con el rut del paciente.
     * @param nombre - String con el nombre del paciente.
     * @param sexo - String con el sexo del paciente.
     * @param edad - int con la edad del paciente.
     * @param apellidoPaterno - String con el apellido paterno del paciente.
     * @param apellidoMaterno - String con el apellido materno del paciente.
     * @param representanteLegal - String con el nombre del representante legal del paciente
     * @param nacionalidad - String con la nacionalidad del paciente
     * @param etnia - String con la etnia del paciente
     * @param region - String con la region que pertenece el paciente
     * @param comuna - String con la comuna que pertenece el paciente
     * @param direccion - String con la direccion del paciente
     * @param estatura - double con la estatura del paciente
     * @param peso - double con el peso del paciente
     * @param email - String con el email del paciente
     * @param situacionSentimental - Enum con la situacion sentimental del paciente
     * @param ocupacion - String con la ocupacion del paciente
     * @param grupoSanguineo - Enum con el grupo sanguineo del paciente
     * @param prevision - Objeto con la prevision de salud del paciente
     */
    public Paciente(String rut, String nombre, String sexo, int edad, String apellidoPaterno, String apellidoMaterno, String representanteLegal, String nacionalidad, String etnia, String region, String comuna, String direccion, double estatura, double peso, String email, situacionSentimental situacionSentimental, String ocupacion, grupoSanguineo grupoSanguineo, Prevision prevision) {
        super(rut, nombre, sexo, edad, apellidoPaterno, apellidoMaterno, representanteLegal, nacionalidad, etnia, region, comuna, direccion, estatura, peso, email, situacionSentimental, ocupacion);
        this.grupoSanguineo = grupoSanguineo;
        this.prevision = prevision;
        this.idPaciente = Paciente.id++;
    }

    public void agregarAntecedente(Antecedente antecedente){
        this.antecedentes.add(antecedente);
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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
    public String getRepresentanteLegal() {
        return super.getRepresentanteLegal();
    }

    @Override
    public void setRepresentanteLegal(String representanteLegal) {
        super.setRepresentanteLegal(representanteLegal);
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
    public String getOcupacion() {
        return super.getOcupacion();
    }

    @Override
    public void setOcupacion(String ocupacion) {
        super.setOcupacion(ocupacion);
    }

    public Prevision getPrevision() {
        return prevision;
    }

    public void setPrevision(Prevision prevision) {
        this.prevision = prevision;
    }

    @Override
    public String getRegion() {
        return super.getRegion();
    }

    @Override
    public void setRegion(String region) {
        super.setRegion(region);
    }

    @Override
    public String getComuna() {
        return super.getComuna();
    }

    @Override
    public void setComuna(String comuna) {
        super.setComuna(comuna);
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
    public situacionSentimental getSituacionSentimental() {
        return super.getSituacionSentimental();
    }

    @Override
    public void setSituacionSentimental(situacionSentimental situacionSentimental) {
        super.setSituacionSentimental(situacionSentimental);
    }

    @Override
    public double getEstatura() {
        return super.getEstatura();
    }

    @Override
    public void setEstatura(double estatura) {
        super.setEstatura(estatura);
    }

    public grupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(grupoSanguineo grupoSanguineo) {
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
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    public List<Antecedente> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(List<Antecedente> antecedentes) {
        this.antecedentes = antecedentes;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        if(this.getEdad()<otroPaciente.getEdad()){
            return -1;
        }else if(this.getEdad()>otroPaciente.getEdad()){
            return 1;
        }
        return 0;
    }
}