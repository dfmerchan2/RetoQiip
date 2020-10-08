package co.com.reto.qiip.models;

import co.com.reto.qiip.models.builder.ParametrosUvBuilder;

public class ParametrosUv {

    private String latitud;
    private String longitud;
    private String altura ;
    private String ozone;
    private String fecha;
    private String token;
    private String mensaje;

    public ParametrosUv(ParametrosUvBuilder parametrosUvBuilder) {
        this.latitud = parametrosUvBuilder.getLatitud();
        this.longitud = parametrosUvBuilder.getLongitud();
        this.altura = parametrosUvBuilder.getAltura();
        this.ozone = parametrosUvBuilder.getOzone();
        this.fecha = parametrosUvBuilder.getFecha();
        this.token = parametrosUvBuilder.getToken();
        this.mensaje = parametrosUvBuilder.getMensaje();
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getAltura() {
        return altura;
    }

    public String getOzone() {
        return ozone;
    }

    public String getFecha() {
        return fecha;
    }

    public String getToken() {
        return token;
    }

    public String getMensaje() {
        return mensaje;
    }
}
