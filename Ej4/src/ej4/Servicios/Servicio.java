package ej4.Servicios;
import ej4.Entidades.Rectangulo;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo rec = new Rectangulo();
        System.out.print("Tamaño de la base: ");
        rec.setBase(leer.nextInt());
        System.out.print("Tamaño de la altura: ");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    public int superficie(Rectangulo rec){
        return rec.getAltura() * rec.getBase();
    }
    public int perimetro(Rectangulo rec){
        return (rec.getAltura()+rec.getBase())*2;
    }
    public void dibujarRectangulo(Rectangulo rec){
        int base, altura;
        if(rec.getBase()>=rec.getAltura()){ base = rec.getBase(); altura = rec.getAltura(); 
        }else{ base = rec.getAltura();  altura = rec.getBase(); }
        System.out.println("Base: " + base + "\nAltura: " + altura);
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if(i!=0 && i!=base-1 && j!=0 && j!=altura-1){
                    System.out.print("  ");
                }else {System.out.print("* ");}
            }
            System.out.println("");
        }
    }
}
