package Calculadora_Guia7_3;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Operacion ope = new Operacion();
        
        
        boolean val=true;
        while (val){
            ope.op();
            System.out.println("ingrese opcion");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        int opc = le.nextInt();
        switch (opc) {
            
            case 1:
                int suma=ope.sumar();
                System.out.println(suma);

                break;
            case 2:
                int resta=ope.restar();
                System.out.println(resta);
                break;
            case 3:
                int mult=ope.multiplicar();
                System.out.println(mult);
                break;
            case 4:
               double div = ope.dividir();
                System.out.println(div);
                break;
            case 5:val=false;
            break;
            
            default:
                System.out.println("ingreso erroneo");
break;

        }
       
}
        System.out.println("desea continuar? S/n");
            String se= le.next();
            if (se.equalsIgnoreCase("n")){
                    
                val=false;
            }    
         
    }
}
