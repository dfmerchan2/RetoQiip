package co.com.reto.qiip.models;

import co.com.reto.qiip.models.builder.UsuarioBuilder;

public class Usuario {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjetaCredito;
    private String mes;
    private String year;

    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.nombre = usuarioBuilder.getNombre();
        this.pais = usuarioBuilder.getPais();
        this.ciudad = usuarioBuilder.getCiudad();
        this.tarjetaCredito = usuarioBuilder.getTarjetaCredito();
        this.mes = usuarioBuilder.getMes();
        this.year = usuarioBuilder.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getMes() {
        return mes;
    }

    public String getYear() {
        return year;
    }
}
