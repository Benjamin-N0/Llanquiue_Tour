package model;

/**
 * Representa una persona relacionada con Llanquihue Tour
 */
public class Persona {
    
    // Atributos del cliente
    private String nombre;
    private String rut;
    
    // Composición: Todos tienen una direccion
    private Direccion direccion;

        /**
     * Constructor de la clase Persona.
     * 
     * @param nombre nombre de la persona
     * @param rut RUT de la persona
     * @param direccion dirección asociada a una persona
     */
    
    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    //get y set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /**
     Devuelve la informacion de Persona
     * @return direccion en forma de texto
     */
    
    @Override
    public String toString(){
    return "\nNombre: " + nombre + "\nRut: " + rut + "\n" + direccion;
    }
    
    
}
