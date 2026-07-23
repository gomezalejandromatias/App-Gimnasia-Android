package com.matias.app_gimnasia_personalizada.dominio;

import com.google.gson.annotations.SerializedName;

public class Persona {


    @SerializedName("Id")
    private int id;

    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("Edad")
    private int edad;

    @SerializedName("PesoActual")
    private double pesoActual;

    @SerializedName("Altura")
    private double altura;

    @SerializedName("Objetivo")
    private String objetivo;

    @SerializedName("Enfermedades")
    private String enfermedades;

    @SerializedName("Molestias")
    private String molestias;

    @SerializedName("Plan")
    private Plan plan;


    public Persona() {
    }

    public Persona(int id, String nombre, int edad, double peso, double altura,
                   String objetivo, String enfermedades, String molestias) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.pesoActual = peso;
        this.altura = altura;
        this.objetivo = objetivo;
        this.enfermedades = enfermedades;
        this.molestias = molestias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double peso) {
        this.pesoActual = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMolestias() {
        return molestias;
    }

    public void setMolestias(String molestias) {
        this.molestias = molestias;
    }

    public Plan getPlan(){

        return  plan;

    }

    public void setPlan(Plan plan){

        this.plan = plan;


    }

}
