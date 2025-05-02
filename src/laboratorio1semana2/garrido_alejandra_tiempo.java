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
public class garrido_alejandra_tiempo {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el número de segundos: ");
        int segundos = scanner.nextInt();
        
        if (0 <= segundos){
            int horas = segundos / 3600;
            segundos -= horas * 3600;
            
            int minutos = segundos / 60;
            segundos -= minutos * 3600;
            
             System.out.println("Horas: "+horas+ " Minutos: "+minutos+" Segundos: "+segundos);

            
        }else{
            System.out.println("No se permite ese valor: ");
            
        }
                
    }
}
