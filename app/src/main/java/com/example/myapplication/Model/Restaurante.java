package com.example.myapplication.Model;

public class Restaurante {

    private int cod_Restaurante;
    private String Descripcion;
    private String Direccion;
    private String Ciudad;
    private String Telefono;
    private String Correo;
    private String urlFoto;
    private float Valoracion;

    public Restaurante() {
    }

    public Restaurante(int cod_Restaurante, String descripcion, String direccion, String ciudad, String telefono, String correo, String urlFoto, float valoracion) {
        this.cod_Restaurante = cod_Restaurante;
        Descripcion = descripcion;
        Direccion = direccion;
        Ciudad = ciudad;
        Telefono = telefono;
        Correo = correo;
        this.urlFoto = urlFoto;
        Valoracion = valoracion;
    }

    public int getCod_Restaurante() {
        return cod_Restaurante;
    }

    public void setCod_Restaurante(int cod_Restaurante) {
        this.cod_Restaurante = cod_Restaurante;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public float getValoracion() {
        return Valoracion;
    }

    public void setValoracion(float valoracion) {
        Valoracion = valoracion;
    }
}
