package util;

/**
 * Excepción personalizada para RUT inválidos.
 * Se usa cuando el formato del RUT no cumple lo esperado.
 */
public class RutInvalidoException extends Exception {

    /**
     * Constructor que recibe el mensaje de error a mostrar.
     */
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
