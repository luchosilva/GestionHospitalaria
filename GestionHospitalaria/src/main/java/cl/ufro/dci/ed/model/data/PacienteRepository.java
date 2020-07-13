package cl.ufro.dci.ed.model.data;

import cl.ufro.dci.ed.model.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class PacienteRepository {

    private List<Paciente> pacientes;
    private static PacienteRepository pacienteRepository;

    public static PacienteRepository obtenerInstancia(){
        return Optional.ofNullable(pacienteRepository).orElse(new PacienteRepository());
    }

    private PacienteRepository(){
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes(){
        return pacientes;
    }

    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public void editPaciente(int id, Paciente paciente){
        this.pacientes.set(id,paciente);
    }

    public void removePaciente(int id){
        this.pacientes.remove(id);
    }

    public Paciente viewPaciente(int id) {
        return this.pacientes.get(id);
    }

    public List<Paciente> sortByEdad(){
        ArrayList<Paciente> pacientesByEdad = new ArrayList<>(pacientes);
        Collections.sort(pacientesByEdad);
        return pacientesByEdad;
    }

}
