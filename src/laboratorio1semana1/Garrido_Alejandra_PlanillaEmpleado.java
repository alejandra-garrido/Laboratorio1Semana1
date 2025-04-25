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
public class Garrido_Alejandra_PlanillaEmpleado {
    
    public static void main (String []args){
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        String nombre_empleado;
        int horas_trabajadas_mensuales;
        double salario_semanal=0;
        
        System.out.println ("Ingrese el nombre completo del empleado: ");
        nombre_empleado = scanner.next();
        
        System.out.println("Ingrese las horas trabajadas mensualmente: ");
        horas_trabajadas_mensuales = scanner.nextInt();
        
        System.out.println("Ingrese la tarifa por hora: ");
        double tarifa_hora = scanner.nextDouble();
        
        salario_semanal = (horas_trabajadas_mensuales*tarifa_hora)/4;
        
        System.out.println ("****Boleta del Empleado****");
        System.out.println ("Nombre del Epleado: "+nombre_empleado);
        System.out.println ("Horas de Trabajo Mensuales: "+horas_trabajadas_mensuales+" horas");
        System.out.println ("Tarifa por Hora: Lps."+tarifa_hora);
        System.out.println ("Salario del Empleado Semanal: Lps."+salario_semanal);
        
    }
}
