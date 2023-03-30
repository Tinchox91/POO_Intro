
package Libros;

import java.util.Scanner;


public class Libro {
       //Crear una clase llamada Libro que contenga los siguientes atributos: 
    //ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
   // constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
    // mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
public String titulo;
public String autor;
public int paginas;
public int isbn;
    public Libro() {
    }
Scanner sc = new Scanner(System.in);
    public Libro(String titulo, String autor, int paginas,int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn=isbn;
    }
    
public void cargarLibros(){
    System.out.println("ingrese titulo");
    titulo= sc.next();
    System.out.println("ingrese autor");
    autor=sc.next();
    System.out.println("ingrese numero de paginas");
    paginas=sc.nextInt();
    System.out.println("ingrese numero de ISBN");
    isbn=sc.nextInt();
}
public void  mostrarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }


    @Override
    public String toString() {
        return "Libro{" + "titulo= " + titulo + ", autor= " + autor + ", paginas= " + paginas + ", ISBN= " + isbn + '}';
    }

}
