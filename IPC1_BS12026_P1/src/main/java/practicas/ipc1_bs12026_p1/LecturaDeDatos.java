package practicas.ipc1_bs12026_p1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDeDatos {
    Scanner sc = new Scanner(System.in);
    
    public int leerEntero(String mensaje){
        while(true){
        try{
            System.out.println(mensaje);
            int valor=sc.nextInt();
            sc.nextLine();
            return valor;
        }catch(InputMismatchException e){
            System.out.println("ERROR: Ingrese un numero entero");
            sc.nextLine();
        }
        }
    }
    
    public double leerDouble(String mensaje) {
        while (true) {
            try {
              System.out.print(mensaje);
              double valor = sc.nextDouble();
              sc.nextLine();
              return valor;
         } catch (InputMismatchException e) {
            System.out.println("ERROR: ingrese un número decimal válido.");
            sc.nextLine();
        }
     }
    }
}
