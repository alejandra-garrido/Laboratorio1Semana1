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
public class Garrido_Alejandra_Cuotas {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Ingrese el monto del pestamo: ");
        double montoPrestamo = scanner.nextDouble();
        System.out.println ("Ingrese el plazo en meses: ");
        int plazoMeses = scanner.nextInt();
        System.out.println ("Ingrese el interés mensual: ");
        double interesMensual = scanner.nextDouble();
        System.out.println ("Ingrese la comisión fija por cuota: ");
        double comisionPorCuota = scanner.nextDouble();
        System.out.println ("Ingrese el porcentaje de seguro mensual aplicado a la cuota: ");
        double porcentajeSeguro = scanner.nextDouble();
        
        double interesTotal = montoPrestamo*(interesMensual / 100)*plazoMeses;
        
        double MontoTotalBase = montoPrestamo + interesTotal;
        
        double cuotaBaseMensual = MontoTotalBase/ plazoMeses;
        
        double seguroMensual = cuotaBaseMensual*(porcentajeSeguro/100);
        
        double cuotaMensualFinal = cuotaBaseMensual + comisionPorCuota + seguroMensual;
        
        double totalPagar = cuotaMensualFinal * plazoMeses;
        
        System.out.println ("****CUOTAS MENSUALES****");
        System.out.println ("Cuota de Pago Mensual: "+cuotaMensualFinal);
        System.out.println ("Total a Pagar: "+totalPagar);
    }
}
