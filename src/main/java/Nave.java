



public abstract class Nave implements Comparable<Nave> {
    
    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }


    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public void setCapacidadTripulacion(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
    
    public abstract String getDescripcion();
    
    
    @Override
    public int compareTo(Nave otra) {
        int cmp = Integer.compare(otra.anioLanzamiento, this.anioLanzamiento);
        if(cmp == 0) {
            cmp = Integer.compare(otra.capacidadTripulacion, this.capacidadTripulacion);
        }
        return cmp;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof Nave)) return false;
        Nave otra = (Nave) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre) && this.anioLanzamiento == otra.anioLanzamiento;
    }
    
    @Override
    public String toString(){
        return String.format("\nNombre: "+ nombre + "\nAño: " + anioLanzamiento + "\nTripulacion: " +  capacidadTripulacion + "\nDescripcion:  " + getDescripcion());
    }
    
}

