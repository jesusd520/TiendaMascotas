package TiendaMascotas;

import TiendaMascotas.enums.TamañoPerro;
import TiendaMascotas.enums.RazaPerroGrande;
import TiendaMascotas.enums.RazaPerroMediano;
import TiendaMascotas.enums.RazaPerroPequeño;
        
public class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;
    protected TamañoPerro tamaño; // Enum de Tamaños
    protected RazaPerroGrande razaGrande; // Enum de razas grandes
    protected RazaPerroMediano razaMediana; // Enum de razas medianas
    protected RazaPerroPequeño razaPequeña; // Enum de razas pequeñas
    
// Hare una sobrecarga de constructores para asignarle el tamaño dependiendo de la raza
    
    public Perro(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroGrande razaGrande) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.tamaño = TamañoPerro.GRANDE;
        this.razaGrande = razaGrande;
        this.razaMediana = null;
        this.razaPequeña = null;
    } 
    public Perro(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroMediano razaMediana) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.tamaño = TamañoPerro.MEDIANO;
        this.razaGrande = null;
        this.razaMediana = razaMediana;
        this.razaPequeña = null;
    }
    public Perro(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroPequeño razaPequeña) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.tamaño = TamañoPerro.PEQUEÑO;
        this.razaGrande = null;
        this.razaMediana = null;
        this.razaPequeña = razaPequeña;
    }
    public static void sonido() {
        System.out.println("Los perros ladran");
    }
    @Override
    public void imprimir() {
        System.out.println("Esta mascota es un Perro");
        System.out.println("Es de tamaño " + this.tamaño.name().toLowerCase());
        if (razaGrande != null) {
            System.out.println("Es un " + this.razaGrande.name().replace("_"," ").toLowerCase());
        }
        else if (razaMediana != null) {
            System.out.println("Es un " + this.razaMediana.name().replace("_"," ").toLowerCase());
        }
        else if (razaPequeña != null) {
            System.out.println("Es un " + this.razaPequeña.name().replace("_"," ").toLowerCase());
        }
        else {
            System.out.println("Es de raza desconocida");
        }
        super.imprimir();
        System.out.println("Pesa " + peso + "kg");
        System.out.println(nombre + (muerde ? " muerde":" no muerde")); // Descubri una manera de hacer un if/else
        System.out.println();
        Perro.sonido();
        System.out.println();
    }   
}
