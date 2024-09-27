/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que representa un animal general, con datos básicos como nombre científico, hábitat y esperanza de vida.
*/
public class Animal {
    protected String nombreCientifico;
    protected String habitat;
    protected int esperanzaDeVida;

    /**
    * Constructor de la clase Animal.
    * @param nombreCientifico Nombre científico del animal.
    * @param habitat El hábitat donde vive el animal.
    * @param esperanzaDeVida La esperanza de vida del animal en años.
    */
    public Animal(String nombreCientifico, String habitat, int esperanzaDeVida) {
        this.nombreCientifico = nombreCientifico;
        this.habitat = habitat;
        this.esperanzaDeVida = esperanzaDeVida;
    }

    /**
    * Devuelve los datos generales del animal.
    * @return Una cadena con el nombre científico, el hábitat y la esperanza de vida.
    */
    public String getDatosGenerales() {
        return "Nombre científico: " + nombreCientifico + "\nHábitat: " + habitat + "\nEsperanza de vida: " + esperanzaDeVida + " años";
    }
}
