
package Libros;

import java.util.ArrayList;
import java.util.Scanner;


public class Libro {
       //Crear una clase llamada Libro que contenga los siguientes atributos: 
    //ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
   // constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
    // mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
    
    //atributos
public String titulo;
public String autor;
public int paginas;
public int isbn;
    public Libro() {
        //construtor vacio
    }
    //constructor por parametros
Scanner sc = new Scanner(System.in);
    public Libro(String titulo, String autor, int paginas,int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn=isbn;
    }
    ArrayList<Libro> lista = new ArrayList<Libro>();//creo lista vacia para agregar cada objeto
public void cargarLibros(){
    
    System.out.println("ingrese titulo");
    titulo= sc.next();
    System.out.println("ingrese autor");
    autor=sc.next();
    System.out.println("ingrese numero de paginas");
    paginas=sc.nextInt();
    System.out.println("ingrese numero de ISBN");
    isbn=sc.nextInt();
    Libro libro = new Libro(titulo, autor, paginas,isbn); //instancio cada objeto en el metodo
        lista.add(libro);// se lo asigno a un lugar en la lista
        System.out.println("El libro se cargo correctamente...");
}
public void  mostrarLibro() {
    for (Libro libro : lista) {//muestro la lista con el bucle for each
        System.out.println(libro.toString());// muestro los atributos de los objetos a travez de toString
        System.out.println("----------------");
    }
        
    }


    @Override
    public String toString() { //se crea el metodo toString
        return "Libro{" + "titulo= " + titulo + ", autor= " + autor + ", paginas= " + paginas + ", ISBN= " + isbn + '}';
    }

}
