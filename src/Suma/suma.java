package Suma;
import java.util.Scanner; // se esta importando Scaner de la paqueteria java.util

public class suma {
    
    public static void main(String[]args){
        int num1=0,num2=0;// se declaran dos variables de tipo entero
        
        Scanner leer = new Scanner (System.in);
        
        num1=leer.nextInt();// se lee los valores que se estan ingresando 
        num2=leer.nextInt();
        
        num1 = num1+num2;// se realiza la suma de los numeros enteros
        
        System.out.println(num1);// se esta imprimiendo en la pantalla la suma de num1 + num2
        
    }
    
}
