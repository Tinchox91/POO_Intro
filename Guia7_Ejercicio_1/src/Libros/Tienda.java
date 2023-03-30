
package Libros;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        int var;
        boolean val = true;
        while (val) {
        System.out.println("ingrese el la opcion..:");
        System.out.println("1.Cargar Libro");
        System.out.println("2.mostrar Libros");
        System.out.println("3.Salir");
var=sc.nextInt();
        
            switch (var) {
                case 1: libro.cargarLibros();                                      
                    break;
                case 2:libro.mostrarLibro();
                    break;
                case 3:val=false;
                    break;
                                default:
                    throw new AssertionError();
            }

        }
    }
}
