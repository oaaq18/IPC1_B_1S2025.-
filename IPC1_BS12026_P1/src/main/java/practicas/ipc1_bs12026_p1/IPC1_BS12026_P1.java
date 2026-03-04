package practicas.ipc1_bs12026_p1;

public class IPC1_BS12026_P1 {
    public static void main(String[] args) {
        //Inventario CapacidadInventario= new Inventario(5);
       java.awt.EventQueue.invokeLater(() -> {
        new VentanaMenuPrincipal().setVisible(true);
    });
    }
}
