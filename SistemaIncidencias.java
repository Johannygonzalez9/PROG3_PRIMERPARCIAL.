import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaIncidencias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Incidencia> listaIncidencias = new ArrayList<>();
        int opcion;
        int contadorId = 1;

        do {
            System.out.println("\n===== SISTEMA DE INCIDENCIAS =====");
            System.out.println("1. Mostrar producto disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. ver carrito y total");
            System.out.println("4. Finalizar compra");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    try {
                        System.out.print("Ingrese descripción: ");
                        String descripcion = scanner.nextLine();

                        System.out.print("Ingrese fecha (dd/MM/yyyy): ");
                        String fecha = scanner.nextLine();

                        System.out.print("Ingrese nivel de prioridad (ALTA, MEDIA, BAJA): ");
                        String prioridad = scanner.nextLine();

                        Incidencia nueva = new Incidencia(
                                contadorId,
                                descripcion,
                                fecha,
                                prioridad
                        );

                        listaIncidencias.add(nueva);
                        contadorId++;

                        System.out.println("Incidencia registrada correctamente.");

                    } catch (DescripcionInvalidaException |
                             PrioridadInvalidaException |
                             FechaInvalidaException e) {

                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (listaIncidencias.isEmpty()) {
                        System.out.println("No hay incidencias registradas.");
                    } else {
                        for (Incidencia inc : listaIncidencias) {
                            System.out.println(inc);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese palabra clave: ");
                    String palabra = scanner.nextLine().trim().toLowerCase();

                    boolean encontrada = false;

                    for (Incidencia inc : listaIncidencias) {
                        if (inc.getDescripcion().toLowerCase().contains(palabra)) {
                            System.out.println(inc);
                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("No se encontraron coincidencias.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
