package model;

/**
 * Representa un empleado de Llanquihue tour.
 * Hereda de la clase Persona.
 */

public class Empleado extends Persona {
    
    /**
     * Constructor de la clase Cliente.
     * 
     * @param nombre nombre del empleado
     * @param rut RUT del empleado
     * @param direccion dirección asociada al empleado
     * @param cargo cargo del empleado
     */
    
    
    private String cargo;
    
    public Empleado(String nombre, String rut, Direccion direccion, String cargo){
    super(nombre,rut,direccion);
    this.cargo = cargo;
    }

    
    // set y get
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    /**
     Devuelve la informacion de Empleado
     * @return direccion en forma de texto
     */
    
    @Override
    public String toString(){
    return super.toString() + "\nCargo: " + cargo;
    }
    
    
    
    
}
