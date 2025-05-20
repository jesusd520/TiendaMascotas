package TiendaMascotas;

import TiendaMascotas.enums.*;

public class PruebaMascotas {

    public static void main(String[] args) {
        
        Mascota perro1 = new Perro("Leviatan", 3, "negro", 12, false, RazaPerroPequeño.CHIHUAHUA);
        perro1.imprimir();
        Mascota gato1 = new Gato("Michi", 1, "blanco y negro", 1.5, 2, RazaGatoPelon.ESFINGE);
        gato1.imprimir();
    }  
}
