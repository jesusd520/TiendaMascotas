package TiendaMascotas;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;
    
    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public void imprimir() {
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su edad es de " + edad + " año/s");
        System.out.println("Es de color " + color);
    }
}
