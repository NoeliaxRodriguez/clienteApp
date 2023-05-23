package com.panaderia.domains;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@JsonPropertyOrder({"mail", "passwd", "nom_est", "tipo_est", "nom_jefe", "ubicacion", "hor_entregas"})
public class Usuario {

    @Id
    private String mail;
    private String passwd;
    private String nom_est;
    private String tipo_est;
    private String nom_jefe;
    private String ubicacion;
    private String hor_entregas;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNom_est() {
        return nom_est;
    }

    public void setNom_est(String nom_est) {
        this.nom_est = nom_est;
    }

    public String getTipo_est() {
        return tipo_est;
    }

    public void setTipo_est(String tipo_est) {
        this.tipo_est = tipo_est;
    }

    public String getNom_jefe() {
        return nom_jefe;
    }

    public void setNom_jefe(String nom_jefe) {
        this.nom_jefe = nom_jefe;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHor_entregas() {
        return hor_entregas;
    }

    public void setHor_entregas(String hor_entregas) {
        this.hor_entregas = hor_entregas;
    }
}
