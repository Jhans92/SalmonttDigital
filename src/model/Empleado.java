package model;

/**
 * Empleado "es una" Persona (herencia).
 * Agrega campos laborales y reutiliza los datos personales.
 */
public class Empleado extends Persona {

    // ---------- Atributos privados ----------
    private String codigoEmpleado;  // Identificador interno
    private String cargo;           // Puesto
    private double sueldoMensual;   // Sueldo

    // ---------- Constructores ----------
    /**
     * Constructor principal: invoca al constructor de Persona con super(...)
     * y luego asigna los atributos propios del Empleado.
     */
    public Empleado(Rut rut, String nombre, String apellido, Direccion direccion,
                    String codigoEmpleado, String cargo, double sueldoMensual) {

        super(rut, nombre, apellido, direccion); // Inicializa la parte "Persona"
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Constructor vacío para flexibilidad al instanciar.
     */
    public Empleado() { }

    // ---------- Getters y Setters ----------
    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldoMensual() { return sueldoMensual; }
    public void setSueldoMensual(double sueldoMensual) {this.sueldoMensual = sueldoMensual;}

    // ---------- toString ----------
    /**
     * Combina los datos heredados con los laborales.
     */
    @Override
    public String toString() {
        return super.toString() + " | " + codigoEmpleado + " - " + cargo + " - $" + sueldoMensual;
    }
}
