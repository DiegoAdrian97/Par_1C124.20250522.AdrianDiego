
import java.util.*;




public class FlotaEspacial {
    
    private ArrayList<Nave> naves;
    
    public FlotaEspacial() {
        this.naves = new ArrayList<>();
    }
    
    public void agregarNave(Nave nave) {
        for (Nave existente : naves) {
           if (existente.equals(nave)) {
               System.out.println("Ya existe una nave con el mismo nombre y año de lanzamiento.");
               return;
               
           } 
        }
        naves.add(nave);
        System.out.println("Nave agregada correctamente");
    }
    
    public void mostrarNaves() {
        if (naves.isEmpty()) {
            System.out.println("No hay naves en la flota");
            return;
        }
        for (Nave nave: naves) {
            System.out.println(nave.getDescripcion());        
        }
    }
    public void iniciarExploracion() {
        
        for(Nave nave: naves) {
            if (nave instanceof CruceroEstelar) {
                System.out.println("La nave " + nave.getNombre() + " no puede salir a explorar");
                
            } else{
                System.out.println("La nave "+ nave.getNombre() + " está iniciando la exploracion..");
            }
        }
    }
    
    public void mostrarOrdenadasPorNombre() {
        ArrayList<Nave> copia = new ArrayList<>(naves);
        Collections.sort(copia, new Comparator<Nave>(){
            @Override
            public int compare(Nave a, Nave b) {
                return a.getNombre().compareToIgnoreCase(b.getNombre());
            }
        });
        
        for (Nave nave : copia) {
            System.out.println(nave);
        }
     }
    public void mostrarOrdenadasPorAnioDescendente() {
        ArrayList<Nave> copia = new ArrayList<>(naves);
        Collections.sort(copia);
        for (Nave nave: copia) {
            System.out.println(nave);
        }  
    }
    public void mostrarPorTripulacionDescendente() {
        ArrayList<Nave> copia = new ArrayList<>(naves);
        Collections.sort(copia, new Comparator<Nave>(){
            @Override
            public int compare(Nave a, Nave b) {
                return Integer.compare(b.getCapacidadTripulacion(),a.getCapacidadTripulacion());
            }
            
        });
        for (Nave nave: copia) {
            System.out.println(nave);
        }
    
    }
}