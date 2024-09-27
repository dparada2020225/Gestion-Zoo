/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que representa a un primate, hereda de Mamifero y agrega detalles como la especie y el nivel de inteligencia.
*/
public class Primates extends Mamifero {
    private String especie;
    private int nivelInteligencia;

    /**
    * Constructor de la clase Primates.
    * @param nombreCientifico Nombre científico del primate.
    * @param habitat El hábitat donde vive.
    * @param esperanzaDeVida La esperanza de vida del primate.
    * @param peso Peso en kilogramos del primate.
    * @param tiempoDeGestacion Tiempo de gestación en meses.
    * @param enPeligroDeExtincion Indica si el primate está en peligro de extinción.
    * @param especie Especie del primate.
    * @param nivelInteligencia Nivel de inteligencia en una escala del 1 al 100.
    */
    public Primates(String nombreCientifico, String habitat, int esperanzaDeVida, double peso, int tiempoDeGestacion, boolean enPeligroDeExtincion, String especie, int nivelInteligencia) {
        super(nombreCientifico, habitat, esperanzaDeVida, peso, tiempoDeGestacion, enPeligroDeExtincion);
        this.especie = especie;
        this.nivelInteligencia = nivelInteligencia;
    }

    /**
    * Calcula el consumo diario de alimentos basado en el peso del primate y su especie.
    * @return Una cadena con el rango de gramos de comida que necesita el primate.
    */
    public String calcularAlimentoDiario() {
        double rangoMin = 0, rangoMax = 0;
        switch (especie.toLowerCase()) {
            case "mono capuchino":
                rangoMin = 25;
                rangoMax = 35;
                break;
            case "mono ardilla":
                rangoMin = 20;
                rangoMax = 30;
                break;
            case "tamarin":
                rangoMin = 15;
                rangoMax = 25;
                break;
            default:
                return "Especie desconocida. No se puede calcular el alimento.";
        }
        double consumoMin = (peso * rangoMin);
        double consumoMax = (peso * rangoMax);
        return "Consumo diario de alimentos: " + consumoMin + " - " + consumoMax + " g";
    }

    /**
    * Devuelve los datos completos del primate.
    * @return Una cadena con los datos del primate, incluyendo especie y nivel de inteligencia.
    */
    public String getDatosPrimate() {
        return getDatosMamifero() + "\nEspecie: " + especie + "\nNivel de inteligencia: " + nivelInteligencia + "/100";
    }
}
