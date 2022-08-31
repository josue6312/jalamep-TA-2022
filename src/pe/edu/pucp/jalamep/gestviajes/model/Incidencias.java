package pe.edu.pucp.jalamep.gestviajes.model;

public class Incidencias {
    private int idIncidencia;
    private String motivo;
    private String informacionadicional;
    private String estado;

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getInformacionadicional() {
        return informacionadicional;
    }

    public void setInformacionadicional(String informacionadicional) {
        this.informacionadicional = informacionadicional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
