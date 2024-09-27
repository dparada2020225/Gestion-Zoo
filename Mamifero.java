/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que extiende a Animal y representa a un mamífero, con detalles como peso, tiempo de gestación y si está en peligro de extinción.
*/
public class Mamifero extends Animal {
    protected double peso;
    protected int tiempoDeGestacion;
    protected boolean enPeligroDeExtincion;

    /**
    * Constructor de la clase Mamifero.
    * @param nombreCientifico Nombre científico del mamífero.
    * @param habitat El hábitat donde vive.
    * @param esperanzaDeVida La esperanza de vida del mamífero.
    * @param peso Peso en kilogramos del mamífero.
    * @param tiempoDeGestacion Tiempo de gestación en meses.
    * @param enPeligroDeExtincion Indica si el mamífero está en peligro de extinción.
    */
    public Mamifero(String nombreCientifico, String habitat, int esperanzaDeVida, double peso, int tiempoDeGestacion, boolean enPeligroDeExtincion) {
        super(nombreCientifico, habitat, esperanzaDeVida);
        this.peso = peso;
        this.tiempoDeGestacion = tiempoDeGestacion;
        this.enPeligroDeExtincion = enPeligroDeExtincion;
    }

    /**
    * Devuelve los datos completos del mamífero.
    * @return Una cadena con los datos generales del animal y detalles específicos del mamífero.
    */
    public String getDatosMamifero() {
        return getDatosGenerales() + "\nPeso: " + peso + " kg\nTiempo de gestación: " + tiempoDeGestacion + " meses\nEn peligro de extinción: " + (enPeligroDeExtincion ? "Sí" : "No");
    }
}
