package cl.ufro.dci.ed.controller;
import cl.ufro.dci.ed.model.*;
import cl.ufro.dci.ed.model.data.PacienteRepository;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@RestController
@CrossOrigin
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteRepository pacienteRepository = PacienteRepository.obtenerInstancia();

    @GetMapping("")
    public List<Paciente> listarPacientes(){
        //Paciente paciente1 = new Paciente("1221211","luis","masculino",21,"silva","quezada","madre","chilena","mapuche","Araucania","carahue","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.A,new Prevision("Fonasa","C"));
        //paciente1.agregarTelefono(1111111111);
        //paciente1.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista","02-07-2020","09:00:00 a.m.","realizada"));
        //paciente1.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista","20-07-2020","08:30:00 a.m.","pendiente"));
        //pacienteRepository.addPaciente(paciente1);
        return pacienteRepository.getPacientes();
    }

    @GetMapping("/{id}")
    public Paciente getPaciente(@PathVariable int id){
        return pacienteRepository.viewPaciente(id);
    }

    @DeleteMapping("/{id}")
    public String removePaciente(@PathVariable int id){
        pacienteRepository.removePaciente(id);
        return "Successfully removed";
    }

    @PostMapping("")
    public String postPaciente(@ModelAttribute Paciente paciente) {
        pacienteRepository.addPaciente(paciente);
        return "Successfully added";
    }

    @PutMapping("/{id}")
    public String editPaciente(@ModelAttribute Paciente paciente,@PathVariable int id) {
        pacienteRepository.editPaciente(id,paciente);
        return "Successfully edited";
    }

    @PostMapping("/{id}/agregarAntecedente/")
    public String postAntecedente(@ModelAttribute Antecedente antecedente,@PathVariable int id){
        pacienteRepository.getPacientes().get(id).agregarAntecedente(antecedente);
        return "Successfully added";
    }

    @PostMapping(value = "/{id}/agregarTelefono/")
    public String postTelefono(@RequestParam(name = "telefono",required = false, defaultValue = "0") int telefono ,@PathVariable int id){
        pacienteRepository.getPacientes().get(id).agregarTelefono(telefono);
        return "Successfully added";
    }
}