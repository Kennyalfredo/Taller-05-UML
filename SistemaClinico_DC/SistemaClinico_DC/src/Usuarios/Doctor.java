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

import Otros.AreaMedica;
import Datos.Cita;
import java.util.ArrayList;

public class Doctor extends Persona 
{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes;
    protected AreaMedica area;
    
    public void recetar()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void agregarPlanNut()
    {
        throw new UnsupportedOperationException("Not supported yet."); 

    }
    
    public void imprimirReceta()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }
    
    public void registrarSecretaria(Secretaria secretaria)
    {
        
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public AreaMedica getArea() {
        return area;
    }

    public void setArea(AreaMedica area) {
        this.area = area;
    }
}
