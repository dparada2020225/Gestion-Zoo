/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que gestiona las operaciones relacionadas con los mamíferos, como agregar y consultar animales.
*/
import java.util.HashMap;
import java.util.Map;

public class Gestionador {
    private Map<String, Mamifero> mamiferos;

    /**
    * Constructor de la clase Gestionador. Inicializa el mapa de mamíferos.
    */
    public Gestionador() {
        mamiferos = new HashMap<>();
    }

    /**
    * Agrega un felino al sistema.
    * @param clave Identificador del felino.
    * @param felino Instancia de la clase Felinos.
    */
    public void agregarFelino(String clave, Felinos felino) {
        mamiferos.put(clave, felino);
    }

    /**
    * Agrega un primate al sistema.
    * @param clave Identificador del primate.
    * @param primate Instancia de la clase Primates.
    */
    public void agregarPrimate(String clave, Primates primate) {
        mamiferos.put(clave, primate);
    }

    /**
    * Muestra los datos de un mamífero según su clave.
    * @param clave Identificador del mamífero.
    * @return Cadena con los detalles del mamífero o un mensaje si no se encuentra.
    */
    public String mostrarDatosMamifero(String clave) {
        if (mamiferos.containsKey(clave)) {
            Mamifero mamifero = mamiferos.get(clave);
            if (mamifero instanceof Felinos) {
                return ((Felinos) mamifero).getDatosFelino();
            } else if (mamifero instanceof Primates) {
                return ((Primates) mamifero).getDatosPrimate();
            }
        }
        return "Mamífero no encontrado.";
    }

    /**
    * Calcula el alimento diario de un mamífero según su clave.
    * @param clave Identificador del mamífero.
    * @return Cadena con el cálculo de la comida diaria o un mensaje si no se encuentra.
    */
    public String calcularAlimento(String clave) {
        if (mamiferos.containsKey(clave)) {
            Mamifero mamifero = mamiferos.get(clave);
            if (mamifero instanceof Felinos) {
                return ((Felinos) mamifero).calcularAlimentoDiario();
            } else if (mamifero instanceof Primates) {
                return ((Primates) mamifero).calcularAlimentoDiario();
            }
        }
        return "Mamífero no encontrado.";
    }
}
