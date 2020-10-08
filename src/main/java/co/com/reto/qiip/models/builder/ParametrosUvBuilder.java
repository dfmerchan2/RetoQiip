package co.com.reto.qiip.models.builder;

import co.com.reto.qiip.models.ParametrosUv;
import co.com.reto.qiip.utilities.comun.Builder;

public class ParametrosUvBuilder implements Builder <ParametrosUv> {

    private String latitud;
    private String longitud;
    private String altura ;
    private String ozone;
    private String fecha;
    private String token;
    private String mensaje;

    public static ParametrosUvBuilder parametros (){
        return new ParametrosUvBuilder();
    }

    public ParametrosUvBuilder conLatitud(String latitud){
        this.latitud = latitud;
        return this;
    }

    public ParametrosUvBuilder conLongitud(String longitud){
        this.longitud = longitud;
        return this;
    }

    public ParametrosUvBuilder conAltura(String altura){
        this.altura = altura;
        return this;
    }

    public ParametrosUvBuilder conOzone(String ozone){
        this.ozone = ozone;
        return this;
    }

    public ParametrosUvBuilder conFecha(String fecha){
        this.fecha = fecha;
        return this;
    }

    public ParametrosUvBuilder conToken(String token){
        this.token = token;
        return this;
    }

    public ParametrosUvBuilder conMensaje(String mensaje){
        this.mensaje = mensaje;
        return this;
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

    @Override
    public ParametrosUv builder() {
        return new ParametrosUv(this);
    }
}
