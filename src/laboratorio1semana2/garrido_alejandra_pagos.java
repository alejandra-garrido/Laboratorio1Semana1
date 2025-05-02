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
public class garrido_alejandra_pagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Ingrese el código del empleado: ");
        String codigo = scanner.next();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Categorías disponibles:");
        System.out.println("1 - $40 por hora extra");
        System.out.println("2 - $50 por hora extra");
        System.out.println("3 - $85 por hora extra");
        System.out.println("4 - $0 por hora extra (no aplica)");

        System.out.print("Ingrese la categoría (1-4): ");
        int categoria = scanner.nextInt();

        
        double pagoHoraNormal = 35.99;
        int horasNormales = (horasTrabajadas > 40) ? 40 : horasTrabajadas;
        int horasExtra = (horasTrabajadas > 40) ? horasTrabajadas - 40 : 0;
        horasExtra = (horasExtra > 15) ? 15 : horasExtra; 

        double pagoHorasExtra = 0;

        
        switch (categoria) {
            case 1:
                pagoHorasExtra = horasExtra * 40;
                break;
            case 2:
                pagoHorasExtra = horasExtra * 50;
                break;
            case 3:
                pagoHorasExtra = horasExtra * 85;
                break;
            case 4:
                pagoHorasExtra = 0;
                horasExtra = 0;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double pagoTotal = (horasNormales * pagoHoraNormal) + pagoHorasExtra;

        System.out.println("\n****Pago****");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas normales: " + horasNormales);
        System.out.println("Horas extra pagadas: " + horasExtra);
        System.out.println("Categoría: " + categoria);
        System.out.printf("Total a pagar: $%.2f\n", pagoTotal);
    }
}

