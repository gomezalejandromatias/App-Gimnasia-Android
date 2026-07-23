package com.matias.app_gimnasia_personalizada.dominio;

public class Ejercicio {

    private int idEjercicio;
    private String tipoEjercicio;

    public Ejercicio() {
    }

    public Ejercicio(int idEjercicio, String tipoEjercicio) {
        this.idEjercicio = idEjercicio;
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }
}
