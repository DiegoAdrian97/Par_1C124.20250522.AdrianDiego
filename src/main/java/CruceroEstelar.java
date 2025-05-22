


public class CruceroEstelar extends Nave{
    
    private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    
    public String getDescripcion() {
        return "Tipo: Crucero Estelar | Pasajeros: " + cantidadPasajeros;
    }
    
    
}
