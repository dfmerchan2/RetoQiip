package co.com.reto.qiip.models.builder;

import co.com.reto.qiip.models.Usuario;
import co.com.reto.qiip.utilities.comun.Builder;

public class UsuarioBuilder implements Builder<Usuario> {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjetaCredito;
    private String mes;
    private String year;


    public static UsuarioBuilder informacion() {
        return new UsuarioBuilder();
    }

    public UsuarioBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder conPais(String pais) {
        this.pais = pais;
        return this;
    }

    public UsuarioBuilder conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public UsuarioBuilder conTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        return this;
    }

    public UsuarioBuilder conMes(String mes) {
        this.mes = mes;
        return this;
    }

    public UsuarioBuilder conYear(String year) {
        this.year = year;
        return this;
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

    @Override
    public Usuario builder() {
        return new Usuario(this);
    }
}
