package com.matias.app_gimnasia_personalizada.dominio;

import java.util.Date;
public class Historial {



    private int idHistorial;
    private Date fecha;
    private double peso;
    private String descripcion;
    private Usuario usuario;

    public Historial() {
    }

    public Historial(int idHistorial, Date fecha, double peso,
                     String descripcion, Usuario usuario) {
        this.idHistorial = idHistorial;
        this.fecha = fecha;
        this.peso = peso;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
