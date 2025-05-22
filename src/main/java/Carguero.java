

public class Carguero extends Nave{
    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        
        if(capacidadCarga < 100){
            this.capacidadCarga = 100;
            
        } else if (capacidadCarga > 500 ) {
            this.capacidadCarga = 500;
        }
        else{
            this.capacidadCarga = capacidadCarga;
        }
        
        
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    
    public String getDescripcion() {
        
        return "Tipo: Carguero | Capacidad de carga: " + capacidadCarga + "toneladas.";
        
    }
    
}
