/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que representa a un felino, hereda de Mamifero y agrega detalles específicos como especie y color de pelaje.
*/
public class Felinos extends Mamifero {
    private String especie;
    private String colorPelaje;

    /**
    * Constructor de la clase Felinos.
    * @param nombreCientifico Nombre científico del felino.
    * @param habitat El hábitat donde vive.
    * @param esperanzaDeVida La esperanza de vida del felino.
    * @param peso Peso en kilogramos del felino.
    * @param tiempoDeGestacion Tiempo de gestación en meses.
    * @param enPeligroDeExtincion Indica si el felino está en peligro de extinción.
    * @param especie Especie del felino.
    * @param colorPelaje Color del pelaje del felino.
    */
    public Felinos(String nombreCientifico, String habitat, int esperanzaDeVida, double peso, int tiempoDeGestacion, boolean enPeligroDeExtincion, String especie, String colorPelaje) {
        super(nombreCientifico, habitat, esperanzaDeVida, peso, tiempoDeGestacion, enPeligroDeExtincion);
        this.especie = especie;
        this.colorPelaje = colorPelaje;
    }

    /**
    * Calcula el consumo diario de alimentos basado en el peso del felino y su especie.
    * @return Una cadena con el rango de gramos de comida que necesita el felino.
    */
    public String calcularAlimentoDiario() {
        double rangoMin = 0, rangoMax = 0;
        switch (especie.toLowerCase()) {
            case "gato montes":
                rangoMin = 20;
                rangoMax = 30;
                break;
            case "puma":
                rangoMin = 25;
                rangoMax = 35;
                break;
            case "leopardo":
                rangoMin = 25;
                rangoMax = 35;
                break;
            default:
                return "Especie desconocida. No se puede calcular el alimento.";
        }
        double consumoMin = (peso * rangoMin);
        double consumoMax = (peso * rangoMax);
        return "Consumo diario de alimentos: " + consumoMin + " - " + consumoMax + " g";
    }

    /**
    * Devuelve los datos completos del felino.
    * @return Una cadena con los datos del felino, incluyendo especie y color de pelaje.
    */
    public String getDatosFelino() {
        return getDatosMamifero() + "\nEspecie: " + especie + "\nColor de pelaje: " + colorPelaje;
    }
}
