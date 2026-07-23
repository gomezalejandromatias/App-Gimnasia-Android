package com.matias.app_gimnasia_personalizada.dominio;

public class Usuario {


    private int idUsuario;
    private String email;
    private String password;
    private boolean activo;
    private Persona persona;

    public Usuario() {
    }

    public Usuario(int idUsuario, String email, String password,
                   boolean activo, Persona persona) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.password = password;
        this.activo = activo;
        this.persona = persona;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
