package model;

import util.RutInvalidoException;

/**
 * Representa un RUT chileno y valida su formato.
 * Ejemplos válidos: 12345678-9, 12345678-K
 */
public class Rut {

    // ---------- Atributo privado ----------
    private String numero; // Almacena el RUT completo con guión

    // ---------- Constructores ----------
    /**
     * Constructor principal: valida antes de asignar.
     */
    public Rut(String numeroRUT) throws RutInvalidoException {
        if (!esFormatoValido(numeroRUT)) {
            throw new RutInvalidoException("Formato de RUT no válido. Use 12345678-9 o 12345678-K");
        }
        this.numero = numeroRUT;
    }

    /**
     * Constructor vacío: permite crear el objeto y setear luego.
     */
    public Rut() { }

    // ---------- Getters y Setters ----------
    public String getNumero() {
        return numero;
    }

    /**
     * Set con validación del formato.
     */
    public void setNumero(String numeroRUT) throws RutInvalidoException {
        if (!esFormatoValido(numeroRUT)) {
            throw new RutInvalidoException("Formato de RUT no válido.");
        }
        this.numero = numeroRUT;
    }

    // ---------- Lógica de validación ----------
    /**
     * Valida el patrón: solo dígitos + guión + dígito o K/k.
     * (Validación simple de formato, no incluye dígito verificador matemático)
     */
    private boolean esFormatoValido(String rut) {
        return rut != null && rut.matches("[0-9]+-[0-9kK]");
    }

    // ---------- toString ----------
    /**
     * Representación legible del RUT.
     */
    @Override
    public String toString() {
        return "RUT: " + numero;
    }
}
