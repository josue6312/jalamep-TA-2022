package pe.edu.pucp.jalamep.gestviajes.model;

import java.time.LocalTime;
import java.util.Date;

public class Viaje {
    private LocalTime hora;
    private Date fecha;
    private String estado;
    private Destino destinicio;
    private Destino destfin;
    private float precio;
}
