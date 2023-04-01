/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no,
se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y
se devuelve el resultado al main.
*/
package Calculadora_Guia7_3;

import java.util.Scanner;

public class Operacion {
    private int n1;
    private int n2;
 Scanner le = new Scanner (System.in);
    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void op() {

        System.out.println("ingrese dos numeros:\n");
        this.n1 = le.nextInt();
        this.n2 = le.nextInt();

    }

    public int sumar() {

        return this.n1 + this.n2;

    }

    public int restar() {
        return this.n1 - this.n2;
    }

    public int multiplicar() {
        if (this.n2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        }
        return this.n1 * this.n2;

    }

    public double dividir() {
        if (this.n2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return (double) this.n1 / this.n2;

    }
}
