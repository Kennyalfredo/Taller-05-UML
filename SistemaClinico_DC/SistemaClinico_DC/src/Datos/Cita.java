/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;
import ModosPago.Pago;
import Usuarios.Doctor;
import Usuarios.Paciente;

/**
 *
 * @author Joao
 */
public class Cita 
{
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;
    
    
    
    public boolean realizarPago(Pago pago)
    {
        System.out.println("REALIZANDO PAGO");
        return true;
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public boolean isPagada() {
        return pagada;
    }
    
    
}
