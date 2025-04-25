/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1semana1;
import java.util.Scanner;
/**
 *
 * @author aleg2
 */
public class Garrido_Alejandra_Formulas {
    
     public static void main (String []args){
         Scanner scanner = new Scanner(System.in);
         //Ejericio a
         System.out.println("Ejercicio a)");
         System.out.println("Numerador 1: ");
         double num1_a = scanner.nextDouble();
         System.out.println("Denominador 1: ");
         double den1_a = scanner.nextDouble();
         System.out.println ("Numerador 2: ");
         double num2_a = scanner.nextDouble();
         System.out.println("Denominador 2: ");
         double den2_a = scanner.nextDouble();
         double resultado_a = (num1_a /den1_a)+ (num2_a /den2_a);
         System.out.println("El resultado es: " + resultado_a);
         
         //Ejercicio b
         System.out.println("Ejercicio b");
         System.out.println("Numerador 1: 1");
         System.out.println ("x: ");
         double x_b = scanner.nextDouble();
         System.out.println("Numerador 2 (3xy): 3* ");
         double xy_b = scanner.nextDouble();
         System.out.println("y: ");
         double y_b = scanner.nextDouble();
         System.out.println ("Denominador 2: 4");
         double resultado_b = (1/ (x_b - 5)-((3*xy_b*y_b)/4));
         System.out.println("El resultado es: " + resultado_b);
         
     }
}
