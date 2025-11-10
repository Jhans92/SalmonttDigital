package model;

/**
 * Clase base del dominio: representa a una persona de Salmontt.
 * Aplica encapsulamiento y composición (Rut + Direccion).
 */
public class Persona {

    // ---------- Atributos privados ----------
    private Rut rut;                // Composición: la persona tiene un RUT
    private String nombre;          // Nombre de la persona
    private String apellido;        // Apellido de la persona
    private Direccion direccion;    // Composición: la persona tiene una Dirección

    // ---------- Constructores ----------
    /**
     * Constructor principal: inicializa todos los datos.
     */
    public Persona(Rut rut, String nombre, String apellido, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    /**
     * Constructor vacío por si se necesita instanciar sin datos iniciales.
     */
    public Persona() { }

    // ---------- Getters y Setters ----------
    public Rut getRut() { return rut; }
    public void setRut(Rut rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    // ---------- toString ----------
    /**
     * Devuelve una representación legible de la persona,
     * incluyendo RUT y dirección.
     */
    @Override
    public String toString() {
        return nombre + " " + apellido + " | " + rut + " | " + direccion;
    }
}
