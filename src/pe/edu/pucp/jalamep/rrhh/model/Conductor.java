/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.jalamep.rrhh.model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Conductor extends Persona {
    private String licencia;
    private ArrayList<Vehiculo> vehiculos;
    private boolean tienePapeletas;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public boolean isTienePapeletas() {
        return tienePapeletas;
    }

    public void setTienePapeletas(boolean tienePapeletas) {
        this.tienePapeletas = tienePapeletas;
    }
    
    
}
