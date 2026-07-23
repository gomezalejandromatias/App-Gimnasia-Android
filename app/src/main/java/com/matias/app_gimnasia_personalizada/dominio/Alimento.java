package com.matias.app_gimnasia_personalizada.dominio;

public class Alimento {

    private int id;
    private String nombre;
    private String tipo;
    private double calorias;
    private double proteinas;
    private double carbohidratos;
    private double grasas;
    private double vitaminaA;
    private double vitaminaB;
    private double vitaminaC;
    private double vitaminaD;
    private double vitaminaE;

    public Alimento() {
    }

    public Alimento(int id, String nombre, String tipo,
                    double calorias, double proteinas,
                    double carbohidratos, double grasas,
                    double vitaminaA, double vitaminaB,
                    double vitaminaC, double vitaminaD,
                    double vitaminaE) {

        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        this.vitaminaA = vitaminaA;
        this.vitaminaB = vitaminaB;
        this.vitaminaC = vitaminaC;
        this.vitaminaD = vitaminaD;
        this.vitaminaE = vitaminaE;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(double vitaminaA) {
        this.vitaminaA = vitaminaA;
    }

    public double getVitaminaB() {
        return vitaminaB;
    }

    public void setVitaminaB(double vitaminaB) {
        this.vitaminaB = vitaminaB;
    }

    public double getVitaminaC() {
        return vitaminaC;
    }

    public void setVitaminaC(double vitaminaC) {
        this.vitaminaC = vitaminaC;
    }

    public double getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(double vitaminaD) {
        this.vitaminaD = vitaminaD;
    }

    public double getVitaminaE() {
        return vitaminaE;
    }

    public void setVitaminaE(double vitaminaE) {
        this.vitaminaE = vitaminaE;
    }
}
