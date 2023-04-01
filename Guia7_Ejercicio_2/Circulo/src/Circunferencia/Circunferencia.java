/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
package Circunferencia;

import java.util.Scanner;


public class Circunferencia {
    private float radio;
    
 public Scanner leer = new Scanner (System.in);
    public Circunferencia() {
       
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
   void  radioo(){
            System.out.println("ingrese el radio");
            radio= leer.nextFloat();           
        
    }
    double area() {
    return Math.PI * radio * radio;
}
    double perimetro() {
    return (2* Math.PI) * radio ;
}
    
}
