
package practicas.ipc1_bs12026_p1;

public class Producto {
    private String Codigo;
    private String Nombre;
    private String Categoria;
    private double Precio;
    private int Stock;
    
    public Producto(String Codigo, String Nombre, String Categoria, double Precio, int Stock){//constuctor
        //verificacion en consola unicamente 
        if (Codigo == null || Codigo.isEmpty()) {
            System.out.println("ERROR: el codigo ingresado esta vacio");
        }else

        if (Nombre == null || Nombre.isEmpty()) {
            System.out.println("ERROR: el codigo ingresado esta vacio");
        }else

        if (Precio <= 0) {
            System.out.println("ERROR: el precio debe ser mayor a 0");
        }else

        if (Stock < 0) {
           System.out.println("ERROR: el sttock no puede ser menor a 0");
        }else{
            
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Stock = Stock;
        
        }
    }
        
    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }
    
    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: Cantidad Invalida");
        }

        if (cantidad > Stock) {
            System.out.println("ERROR: La cantidad supera el stock existente");
        }

        Stock = Stock-cantidad;
    }
    
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("EEOR: Cantidad debe ser mayor a 0");
        }

        Stock = Stock-cantidad;
    }
    
    @Override
    public String toString() {
        return "Código: " + Codigo +
               ", Nombre: " + Nombre +
               ", Categoría: " + Categoria +
               ", Precio: Q" + Precio +
               ", Stock: " + Stock;
    }    
   
    
}
