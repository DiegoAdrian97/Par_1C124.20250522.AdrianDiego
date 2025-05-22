


public class NaveExploracion extends Nave {
    private tipoMision tipoMision;

    public NaveExploracion(tipoMision tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    public tipoMision getTipoMision() {
        return tipoMision;
    }
    
    @Override
    
    public String getDescripcion() {
        return "Tipo: Exploración | Misión: " + tipoMision;
    }
    
}
