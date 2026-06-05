package app;

import model.Direccion;
import model.Empleado;        

/**
 * Clase principal del sistema Llanquihue Tour
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Direccion direccion1 = new Direccion("calle generica","ciudad generica","region generica");
        Empleado empleado1 = new Empleado("Juan","12345678-9",direccion1,"empleado");
        
        Direccion direccion2 = new Direccion("calle generica2","ciudad generica2","region generica2");
        Empleado empleado2 = new Empleado("Jose","23456236-1",direccion2,"gerente");

        Direccion direccion3 = new Direccion("calle generica3","ciudad generica3","region generica");
        Empleado empleado3 = new Empleado("Pedro","98765432-1",direccion3,"supervisor");

        
        System.out.println("-----Informacion de empleados-----");
        System.out.println("\nEmpleado1:\n" + empleado1);
        System.out.println("\nEmpleado2:\n" + empleado2);    
        System.out.println("\nEmpleado3:\n" + empleado3);
    }
    
}
