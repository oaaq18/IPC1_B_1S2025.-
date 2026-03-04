package practicas.ipc1_bs12026_p1;
import java.util.Scanner;
public class MenuPrincipal {

    private Scanner sc;
    

    public MenuPrincipal() {
        sc = new Scanner(System.in);
        
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n----MENU---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Generar Reportes");
            System.out.println("6. Ver Datos del Estudiante");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    //sistema.agregarProducto();
                    break;
                case 2:
                    //sistema.buscarProducto();
                    break;
                case 3:
                    //sistema.eliminarProducto();
                    break;
                case 4:
                    //sistema.registrarVenta();
                    break;
                case 5:
                    //sistema.generarReporte();
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);
    }
}
