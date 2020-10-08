package co.com.reto.qiip.exceptions;

public class ExceptionError extends AssertionError{
    public ExceptionError(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
