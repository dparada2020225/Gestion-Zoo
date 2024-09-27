/**
* UNIVERSIDAD DEL VALLE DE GUATEMALA
* DEPARTAMENTO DE CIENCIA DE LA COMPUTACION 
* CC2008
* AUTOR: Denil Parada
* FECHA: 26/09/2024 
* DESCRIPCION: Clase que interactúa con el usuario para mostrar los detalles de los mamíferos y calcular su alimentación.
*/
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Gestionador gestionador = new Gestionador();
        Scanner scanner = new Scanner(System.in);

        // Creación de los animales (3 felinos y 3 primates)
        Felinos gatoMontes = new Felinos("Lynx rufus", "Bosques", 15, 18.5, 2, true, "gato montes", "marrón moteado");
        Felinos puma = new Felinos("Puma concolor", "Montañas", 12, 60, 3, true, "puma", "gris");
        Felinos leopardo = new Felinos("Panthera pardus", "Selvas", 17, 70, 3, false, "leopardo", "amarillo con manchas negras");

        Primates monoCapuchino = new Primates("Cebus capucinus", "Selvas", 25, 3.5, 6, false, "mono capuchino", 90);
        Primates monoArdilla = new Primates("Saimiri sciureus", "Selva tropical", 12, 1.1, 5, false, "mono ardilla", 70);
        Primates tamarin = new Primates("Saguinus oedipus", "Selva tropical", 13, 0.5, 5, true, "tamarin", 80);

        // Agregar los animales al gestionador
        gestionador.agregarFelino("gato montes", gatoMontes);
        gestionador.agregarFelino("puma", puma);
        gestionador.agregarFelino("leopardo", leopardo);
        gestionador.agregarPrimate("mono capuchino", monoCapuchino);
        gestionador.agregarPrimate("mono ardilla", monoArdilla);
        gestionador.agregarPrimate("tamarin", tamarin);

        // Menú para interactuar con el usuario
        int opcion = 0;
        do {
            System.out.println("\nSeleccione una especie para ver los detalles:");
            System.out.println("Felinos:");
            System.out.println("1. Gato montés");
            System.out.println("2. Puma");
            System.out.println("3. Leopardo");
            System.out.println("\nPrimates:");
            System.out.println("4. Mono capuchino");
            System.out.println("5. Mono ardilla");
            System.out.println("6. Tamarin");
            System.out.println("\n7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    mostrarDetallesYCalcularAlimento(gestionador, "gato montes");
                    break;
                case 2:
                    mostrarDetallesYCalcularAlimento(gestionador, "puma");
                    break;
                case 3:
                    mostrarDetallesYCalcularAlimento(gestionador, "leopardo");
                    break;
                case 4:
                    mostrarDetallesYCalcularAlimento(gestionador, "mono capuchino");
                    break;
                case 5:
                    mostrarDetallesYCalcularAlimento(gestionador, "mono ardilla");
                    break;
                case 6:
                    mostrarDetallesYCalcularAlimento(gestionador, "tamarin");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    /**
    * Muestra los detalles del mamífero seleccionado y calcula la cantidad de alimento diario.
    * @param gestionador El gestionador que maneja los mamíferos.
    * @param clave La clave del mamífero que se seleccionó.
    */
    private static void mostrarDetallesYCalcularAlimento(Gestionador gestionador, String clave) {
        System.out.println("\nDetalles del mamífero:");
        System.out.println(gestionador.mostrarDatosMamifero(clave));
        System.out.println("\n" + gestionador.calcularAlimento(clave));
    }
}
