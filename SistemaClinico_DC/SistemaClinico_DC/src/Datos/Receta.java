package Datos;
import Usuarios.Doctor;
import Usuarios.Paciente;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joao
 */
public class Receta 
{
    protected Paciente paciente;
    protected Doctor doctor;
    protected Date fecha;
    protected PlanNutricional plan;
    
    
    
    public Receta()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public Receta(Date fecha) 
    {
        this.fecha = fecha;
        plan = new PlanNutricional();
    }

    public Date getFecha() 
    {
        return fecha;
    }

    public void setFecha(Date fecha) 
    {
        this.fecha = fecha;
    }

    public PlanNutricional getPlan() 
    {
        return plan;
    }

    public void setPlan(PlanNutricional plan) 
    {
        this.plan = plan;
    }   
}
