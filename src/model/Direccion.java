package model;

/**
 * Representa la dirección física asociada a una persona/empleado.
 * Demuestra composición: Persona "tiene una" Direccion.
 */
public class Direccion {

    // ---------- Atributos privados ----------
    private String calle;    // Nombre de la calle o avenida
    private int numero;      // Número del domicilio (0 = s/n)
    private String comuna;   // Comuna
    private String ciudad;   // Ciudad
    private String region;   // Región

    // ---------- Constructores ----------
    /**
     * Constructor principal: crea una dirección completa.
     */
    public Direccion(String calle, int numero, String comuna, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Constructor vacío para asignar después con setters.
     */
    public Direccion() { }

    // ---------- Getters y Setters ----------
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) {this.numero = numero;}

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    // ---------- toString ----------
    /**
     * Muestra la dirección completa en una sola línea.
     */
    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + ciudad + ", " + region;
    }
}
