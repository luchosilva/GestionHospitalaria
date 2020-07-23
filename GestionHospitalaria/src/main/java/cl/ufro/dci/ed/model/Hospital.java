package cl.ufro.dci.ed.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Hospital {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Paciente paciente1 = new Paciente("1221211","luis","masculino",21,"silva","quezada","madre","chilena","mapuche","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.A,new Prevision("Fonasa","C"));
        paciente1.agregarTelefono(1111111111);
        paciente1.agregarAntecedente(new Antecedente("Dentista","Extracciòn de muela",LocalDate.of(2020,11,2),"09:00:00 a.m.","realizada"));
        paciente1.agregarAntecedente(new Antecedente("Dentista","Limpieza",LocalDate.of(2020,10,10),"08:30:00 a.m.","pendiente"));
        paciente1.agregarAntecedente(new Antecedente("Dentista","Observación de rutina",LocalDate.of(2020,9,8),"08:30:00 a.m.","pendiente"));
        pacientes.add(paciente1);

        Paciente paciente2 = new Paciente("1221211","luis","masculino",30,"silva","quezada","madre","chilena","mapuche","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.A,new Prevision("Fonasa","C"));
        paciente2.agregarTelefono(1111111111);
        paciente2.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista",LocalDate.of(2020,7,17),"09:00:00 a.m.","realizada"));
        paciente2.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista",LocalDate.of(2020,8,10),"08:30:00 a.m.","pendiente"));
        pacientes.add(paciente2);

        Paciente paciente3 = new Paciente("1221211","luis","masculino",3,"silva","quezada","madre","chilena","mapuche","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.A,new Prevision("Fonasa","C"));
        paciente3.agregarTelefono(1111111111);
        paciente3.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista",LocalDate.of(2020,2,17),"09:00:00 a.m.","realizada"));
        paciente3.agregarAntecedente(new Antecedente("Hospital de carahue","Dentista",LocalDate.of(2020,12,2),"08:30:00 a.m.","pendiente"));
        pacientes.add(paciente3);

        System.out.println(paciente1.getAntecedentes().poll().getFecha().getDayOfMonth());
        System.out.println(paciente1.getAntecedentes().poll().getFecha().getDayOfMonth());
        System.out.println(paciente1.getAntecedentes().poll().getFecha().getDayOfMonth());
    }
}
