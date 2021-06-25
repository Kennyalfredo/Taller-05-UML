/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Joao
 */



import Datos.Cita;
import Datos.HistoriaClinica;
import Datos.Receta;
import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Persona
{
    protected String email;
    protected HistoriaClinica historia;
    protected Cita cita;
    protected ArrayList<Receta> recetas;
    
    public Paciente(int numeroHistoria, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros, String email)
    {
        historia = new HistoriaClinica(numeroHistoria, enfermedades, alergias, otros);
        this.email = email;
        recetas = new ArrayList<>();
    }
    
    public boolean solicitarCita()
    {
        cita= new Cita();  
        cita.setFecha(new Date());
        cita.setPagada(true);
        cita.setRegistradoPor("Ricardo Zaruma");
        cita.setPaciente(this);
        cita.setDoctor(new Doctor());
        
//        EnviarCorreo mail = new EnviarCorreo("yyyyy@gmail.com", "Confirmacion de Cita", "Fecha: "+ cita.getFecha().toString()
//                + "Registrada Por: "+ cita.getRegistradoPor()+ "Paciente: "+ this.nombre +" "+this.apellido
//                + "Doctor: " +cita.getDoctor().apellido, 0);
//        mail.ejecutarEnviarCorreo();
//        System.out.println("Confirmacion enviada por Correo Electronico");
//        return true;
        return false;
        
    }
}