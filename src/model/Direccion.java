package model;

/**
 * Representa la dirección física de un cliente de Llanquiue Tour.
 * Esta clase se utiliza como parte de la composición dentro de la clase Persona.
 */
public class Direccion {
    
    // Atributos de la dirección
    private String calle;
    private String ciudad;
    private String region;

    
    /**
     * Constructor de la clase Direccion.
     * 
     * @param calle nombre de la calle
     * @param ciudad ciudad donde vive el personal
     * @param region región donde vive el personal
     */
    
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    
    // get y set

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     Devuelve la informacion de Direccion
     * @return direccion en forma de texto
     */
    
    @Override
    public String toString(){
    return "Calle: " + calle + "\nCiudad: " + ciudad +
            "\nRegion: " + region;
    }
    
    
    
    
    
    
}
