package com.matias.app_gimnasia_personalizada.dominio;

import java.util.ArrayList;
import java.util.List;
public class Plan {

    private int idPlan;
    private String tipoPlan;
    private String descripcion;
    private boolean activo;

    private List<Ejercicio> listaEjercicios;
    private List<Alimento> listaAlimentos;
    private List<Persona> listaPersonas;

    public Plan() {
        listaEjercicios = new ArrayList<>();
        listaAlimentos = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public Plan(int idPlan, String tipoPlan, String descripcion, boolean activo) {
        this.idPlan = idPlan;
        this.tipoPlan = tipoPlan;
        this.descripcion = descripcion;
        this.activo = activo;
        this.listaEjercicios = new ArrayList<>();
        this.listaAlimentos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Ejercicio> getListaEjercicios() {
        return listaEjercicios;
    }

    public void setListaEjercicios(List<Ejercicio> listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }

    public List<Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(List<Alimento> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
