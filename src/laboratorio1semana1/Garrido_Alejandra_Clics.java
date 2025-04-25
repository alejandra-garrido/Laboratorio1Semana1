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
public class Garrido_Alejandra_Clics {
    
    public static void main (String [] args){
         
        int clics1 = 60;
        double costo1 = 0.30;
        
        int clics2 = 100;
        double costo2 = 0.25;
        
        int clics3 = 20;
        double costo3 = 0.80;
        
        int totalClics = clics1 + clics2 +clics3;
        double totalCosto = (clics1* costo1)+(clics2*costo2)+(clics3*costo3);
        
        double costoPromedio = totalCosto/totalClics;
        
        double isv = totalCosto*0.16;
        double totalConISV = totalCosto + isv;
        
        System.out.println("Costo promedio por clic: $"+String.format("%.2f", costoPromedio));
        System.out.println ("Total sin ISV: $"+String.format("%.2f",totalCosto));
        System.out.println ("ISV (16%):$"+ String.format("%.2f",isv));
        System.out.println ("Total con ISV: $"+String.format("%.2f",totalConISV));
    }
}
