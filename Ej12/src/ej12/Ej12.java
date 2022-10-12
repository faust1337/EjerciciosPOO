package ej12;

import ej12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class Ej12 {
    public static void main(String[] args) {
        Persona p = crearPersona();
        System.out.println(p.getNombre() + " tiene " + p.calcularEdad() + " años.");
    }
    public static Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Fecha de nacimiento.");
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt(); mes = mes - 1;
        System.out.print("Año: "); int anio = leer .nextInt(); anio = anio - 1900;
        Date nacimiento = new Date(anio,mes,dia);
        p.setFechaNacimiento(nacimiento);
        return p;
    }
}
