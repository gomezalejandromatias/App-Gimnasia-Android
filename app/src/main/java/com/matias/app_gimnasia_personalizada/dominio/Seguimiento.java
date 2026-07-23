package com.matias.app_gimnasia_personalizada.dominio;
import java.util.Date;
public class Seguimiento {

    private int idSeguimiento;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    private Usuario usuario;
    private Persona persona;

    public Seguimiento() {
    }

    public Seguimiento(int idSeguimiento, Date fechaInicio, Date fechaFin,
                       String estado, Usuario usuario, Persona persona) {
        this.idSeguimiento = idSeguimiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.usuario = usuario;
        this.persona = persona;
    }

    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(int idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
