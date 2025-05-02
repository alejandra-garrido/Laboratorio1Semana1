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
public class garrido_alejandra_clases { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int posicionComa, dia, mes;
        String posicionDia, posicionFechaNum, Decision, Dec;
        double promAlumnos, porcentajeApb;

        System.out.println("**** English School ****");
        System.out.print("Ingrese la fecha actual 'día, DD/MM': ");
        String fechaentrada = scanner.next().trim();

        posicionComa = fechaentrada.indexOf(',');

        if (posicionComa == -1) {
            System.out.println("Valor inválido");
        }

        posicionDia = fechaentrada.substring(0, posicionComa).trim().toLowerCase();
        posicionFechaNum = fechaentrada.substring(posicionComa + 1).trim();

        String diaST = posicionFechaNum.substring(0, 2);
        String mesST = posicionFechaNum.substring(3, 5);

        dia = Integer.parseInt(diaST);
        mes = Integer.parseInt(mesST);

        if (dia < 31 & mes <= 12) {
            if (posicionDia.equals("lunes") || posicionDia.equals("martes") || posicionDia.equals("miercoles")) {
                System.out.println("Dia: " + posicionDia);
                System.out.print("Se aplicaron exámenes?: ");
                Decision = scanner.next();

                Dec = Decision.toLowerCase();
                if (Dec.equals("si")) {
                    System.out.print("Cuantos estudiantes aprobaron?: ");
                    int aprobados = scanner.nextInt();
                    System.out.print("Cuantos estudiantes reprobaron?: ");
                    int reprobados = scanner.nextInt();

                    promAlumnos = aprobados + reprobados;
                    porcentajeApb = (aprobados / promAlumnos) * 100;
                    String porcentajeAprobados = String.format("%.2f", porcentajeApb);
                    System.out.println("Porcentaje de alumnos aprobados es de: " + porcentajeAprobados + "%");
                }
            } else if (posicionDia.equals("jueves")) {
                System.out.println("Dia: " + posicionDia);
                System.out.print("Ingresar el porcentaje de asistencia: ");
                int porcentajeAsistencia = scanner.nextInt();

                String mensaje = (porcentajeAsistencia >= 50) ? "La mayoría asistió " : "La mayoría no asistió ";
                System.out.println(mensaje);

            }
            else if (posicionDia.equals("viernes") && dia == 01){
                if(mes == 01 || mes == 07){
                   System.out.println("Día: " + posicionDia);
                   System.out.println("Comienzo desde inicio");
                   System.out.print("Ingrese cantidad de nuevos alumnos: ");
                   int cantidadAlumnos = scanner.nextInt();
                   System.out.print("Ingrese precio por cada alumno en $: ");
                   int precioAlumnos = scanner.nextInt();
                   
                   double precioTotal = cantidadAlumnos * precioAlumnos;
                   
                   System.out.print("Ingreso total: "+precioTotal+"$\n");
                }
                else{
                    System.out.println("Fecha inválida..");
                }
            }
        } else {
            System.out.println("Error, intente de nuevo");
        }
    }
}
        