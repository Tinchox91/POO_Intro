/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del 
Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y
un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    private float base;
    private float altura;
Scanner leer = new Scanner (System.in);
    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void ingresarDatos(){
        System.out.println("ingrese base");
        base  = leer.nextFloat();
        System.out.println("ingrese altura");
        altura=leer.nextFloat();
    }
    public float  superficie(){
       return this.base * this.altura;
    }
    public float perimetro(){
        return (this.base+this.altura)*2;
    }
    public void dibujarRectangulo(){
       for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("la superficie es : "+ this.superficie() );
        System.out.println("el perimetro es: "+this.perimetro());
    }
    
}
