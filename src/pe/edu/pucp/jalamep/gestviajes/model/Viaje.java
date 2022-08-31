package pe.edu.pucp.jalamep.gestviajes.model;

import java.time.LocalTime;
import java.util.Date;

public class Viaje {
    private int idViaje;
    private LocalTime hora;
    private Date fecha;
    private String estado;
    private Destino destinicio;
    private Destino destfin;
    private float precio;

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Destino getDestinicio() {
        return destinicio;
    }

    public void setDestinicio(Destino destinicio) {
        this.destinicio = destinicio;
    }

    public Destino getDestfin() {
        return destfin;
    }

    public void setDestfin(Destino destfin) {
        this.destfin = destfin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
