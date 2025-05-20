package TiendaMascotas;
//La estructura sera la misma que en Perro.java
import TiendaMascotas.enums.PelajeGato;
import TiendaMascotas.enums.RazaGatoPeloLargo;
import TiendaMascotas.enums.RazaGatoPeloCorto;
import TiendaMascotas.enums.RazaGatoPelon;

public class Gato extends Mascota {
    protected double alturaSalto;
    protected double longitudSalto;
    protected PelajeGato pelajeGato;
    protected RazaGatoPeloLargo peloLargo;
    protected RazaGatoPeloCorto peloCorto;   
    protected RazaGatoPelon pelon;
    
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoPeloLargo peloLargo) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
        this.pelajeGato = PelajeGato.PELO_LARGO;
        this.peloLargo = peloLargo;
        this.peloCorto = null;
        this.pelon = null;
    }
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoPeloCorto peloCorto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
        this.pelajeGato = PelajeGato.PELO_CORTO;
        this.peloLargo = null;
        this.peloCorto = peloCorto;
        this.pelon = null;
    }
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto, RazaGatoPelon pelon) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
        this.pelajeGato = PelajeGato.PELON;
        this.peloLargo = null;
        this.peloCorto = null;
        this.pelon = pelon;
    }
    public static void sonido() {
        System.out.println("Los gatos maullan y ronronean");
    }
    @Override
    public void imprimir() {
        System.out.println("Esta mascota es un gato");
        System.out.println("Su pelaje es: " + this.pelajeGato.name().replace("_"," ").toLowerCase());
        if (peloLargo != null) {
            System.out.println("Es de raza " + this.peloLargo.name().replace("_"," ").toLowerCase());
        }
        else if (peloCorto != null) {
            System.out.println("Es de raza " + this.peloCorto.name().replace("_"," ").toLowerCase());
        }
        else if (pelon != null) {
            System.out.println("Es de raza " + this.pelon.name().replace("_"," ").toLowerCase());
        }
        else {
            System.out.println("Es de raza desconocida");
        }
        super.imprimir();
        System.out.println("Tiene una altura de salto de " + alturaSalto + "mts");
        System.out.println("Tiene una longitud de salto de " + longitudSalto + "mts");
        System.out.println();
        Gato.sonido();
        System.out.println();
    }
}