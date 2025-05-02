/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1semana2;
import java.util.Scanner;
/**
 *
 * @author aleg2
 */
public class garrido_alejandra_fecha {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese la primera fecha (Día/Mes/Año): ");
        String fecha1 = scanner.next();
        
        System.out.println("Ingrese la segunda fecha (Día/Mes/Año): ");
        String fecha2 = scanner.next();
        
        int dia1 = Integer.parseInt(fecha1.substring(0,2));
        int mes1 = Integer.parseInt(fecha1.substring(3,5));
        int year1 = Integer.parseInt(fecha1.substring(6,10));
        
        int dia2 = Integer.parseInt(fecha2.substring(0,2));
        int mes2 = Integer.parseInt(fecha2.substring(3,5));
        int year2 = Integer.parseInt(fecha2.substring(6,10));
                
       int dias_total1 = (year1 * 12 * 30)+((mes1-1)*30)+dia1;
       int dias_total2 = (year2 * 12 * 30)+((mes2-1)*30)+dia2;
       
       int diferencia_dias;
       if (dias_total1 > dias_total2){
           diferencia_dias = dias_total1 - dias_total2;
       }else{
           diferencia_dias = dias_total2 - dias_total1;
       }
       
        System.out.println("La diferencia entre las fechas en días: "+diferencia_dias+" días.");
    }
}
