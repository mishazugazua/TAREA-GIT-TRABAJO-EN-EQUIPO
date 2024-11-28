import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final int MAX_TAREAS = 10;
    static String[] titulos = new String[MAX_TAREAS];
    static String[] descripciones = new String[MAX_TAREAS];
    static String[] fechasVencimiento = new String[MAX_TAREAS];
    static int contador = 0;


    public static void main(String[] args) throws IOException {
<<<<<<< Updated upstream

        //write your codee here
    }

=======
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String opcion;

        do {
            System.out.println("\nMenú de Gestión de Tareas:");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = reader.readLine();

            switch (opcion) {
                case "1":
                    System.out.print("Título: ");
                    String titulo = reader.readLine();
                    System.out.print("Descripción: ");
                    String descripcion = reader.readLine();
                    System.out.print("Fecha de vencimiento (YYYY-MM-DD): ");
                    String fechaVencimiento = reader.readLine();
                    registrarTarea(titulo, descripcion, fechaVencimiento);
                    break;
                case "2":
                    listarTareas();
                    break;
                case "3":
                    System.out.print("Título de la tarea a actualizar: ");
                    String tituloActualizar = reader.readLine();
                    System.out.print("Nueva descripción (deja en blanco para no cambiar): ");
                    String nuevaDescripcion = reader.readLine();
                    System.out.print("Nueva fecha de vencimiento (YYYY-MM-DD, deja en blanco para no cambiar): ");
                    String nuevaFechaVencimiento = reader.readLine();
                    actualizarTarea(tituloActualizar, nuevaDescripcion.isEmpty() ? null : nuevaDescripcion, nuevaFechaVencimiento.isEmpty() ? null : nuevaFechaVencimiento);
                    break;
                case "4":
                    System.out.print("Título de la tarea a eliminar: ");
                    String tituloEliminar = reader.readLine();
                    eliminarTarea(tituloEliminar);
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opcion.equals("5"));
    }


    public static void registrarTarea(String titulo, String descripcion, String fechaVencimiento) {
        if (contador < MAX_TAREAS) {
            titulos[contador] = titulo;
            descripciones[contador] = descripcion;
            fechasVencimiento[contador] = fechaVencimiento;
            contador++;
            System.out.println("Tarea '" + titulo + "' registrada.");
        } else {
            System.out.println("No se pueden registrar más tareas. Límite alcanzado.");
        }
    }

    public static void listarTareas() {
        if (contador == 0) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Título: " + titulos[i] + ", Descripción: " + descripciones[i] + ", Fecha de vencimiento: " + fechasVencimiento[i]);
            }
        }
    }

>>>>>>> Stashed changes
    public static void actualizarTarea(String titulo, String nuevaDescripcion, String nuevaFechaVencimiento) {
        for (int i = 0; i < contador; i++) {
            if (titulos[i].equals(titulo)) {
                if (nuevaDescripcion != null) {
                    descripciones[i] = nuevaDescripcion;
                }
                if (nuevaFechaVencimiento != null) {
                    fechasVencimiento[i] = nuevaFechaVencimiento;
                }
                System.out.println("Tarea '" + titulo + "' actualizada.");
                return;
            }
        }
        System.out.println("Tarea '" + titulo + "' no encontrada.");
    }

    public static void eliminarTarea(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (titulos[i].equals(titulo)) {
                for (int j = i; j < contador - 1; j++) {
                    titulos[j] = titulos[j + 1];
                    descripciones[j] = descripciones[j + 1];
                    fechasVencimiento[j] = fechasVencimiento[j + 1];
                }
                titulos[contador - 1] = null;
                descripciones[contador - 1] = null;
                fechasVencimiento[contador - 1] = null;
                contador--;
                System.out.println("Tarea '" + titulo + "' eliminada.");
                return;
            }
<<<<<<< Updated upstream


=======
        }
        System.out.println("Tarea '" + titulo + "' no encontrada.");
    }
}
>>>>>>> Stashed changes
