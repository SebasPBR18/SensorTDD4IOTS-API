package com.distribuidas.SensorTDD4IOTS.tddt4iots.dto;


public class UsuarioDTO {

    private String id;
    private String nombreusuario;
    private String clave;
    private String tipoDeUsuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipodeusuario) {
        this.tipoDeUsuario = tipodeusuario;
    }

}
