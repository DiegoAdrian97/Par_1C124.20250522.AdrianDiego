
import java.util.Scanner;

public class ExpedicionEspacial {

    public static void main(String[] args) {
        FlotaEspacial flota = new FlotaEspacial();
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("\n--- Menú Expedicion Espacial ---");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar Exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas desc por año de lanzamiento");
            System.out.println("6. Mostrar naves ordenadas desc por capacidad de tripulacion ");
            System.out.println("7. Salir");            
            System.out.println("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1: {
                    System.out.println("Seleccione el tipo de nave: ");
                     System.out.println("1. Nave de exploracion ");
                    System.out.println("2. Carguero ");
                    System.out.println("3. Crucero Estelar ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    
                    if (tipo < 1 || tipo > 3) {
                        System.out.println("Tipo invalido.");
                        tipo = sc.nextInt();
                        sc.nextLine();
                    }
                    
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío");
                        break;
                    }
                    
                    System.out.println("Capacidad de Tripulación: ");
                    int tripulacion = sc.nextInt();
                    if (tripulacion < 0) {
                        System.out.println("La capacidad de tripulacion debe ser positiva");
                    }
                    sc.nextLine();
                    System.out.println("Año de Lanzamiento: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    if (anio <= 0) {
                        System.out.println("El año de lanzamiento debe ser positivo");
                        break;
                        
                    }
                    if (tipo == 1) {
                        System.out.println("Tipo de Mision (CARTOGRAFIA, INVESTIGACION, CONTACTO");
                        String misionStr = sc.nextLine().toUpperCase();
                        
                        tipoMision misionTipo = tipoMision.valueOf(misionStr);
                        
                        flota.agregarNave(new NaveExploracion(misionTipo, nombre, tripulacion, anio));
                    } else if (tipo == 2) {
                        System.out.println("Capacidad de carga (100-500 toneladas): ");
                        int carga = sc.nextInt();
                        if (carga < 100) {
                            System.out.println("Carga fuera de rango, intente nuevamente... ");
                            carga = sc.nextInt();
                        }
                        if (carga > 500) {
                            System.out.println("Carga fuera de rango, intente nuevamente... ");
                            carga = sc.nextInt();
                        }
                        flota.agregarNave(new Carguero(carga, nombre, tripulacion, anio));
                        
                    } else if (tipo == 3) {
                        System.out.println("Cantidad de pasajeros: ");
                        int pasajeros = sc.nextInt();
                        flota.agregarNave(new CruceroEstelar(pasajeros, nombre, tripulacion, anio));
                        
                    } else {
                        System.out.println("Tipo de nave inválido");
                    }
                    break;
               }
                    
                case 2:
                    flota.mostrarNaves(); 
                    break;
               
                case 3: 
                    flota.iniciarExploracion();
                    break;
                    
                case 4: 
                    flota.mostrarOrdenadasPorNombre();
                    break;
                case 5: 
                    flota.mostrarOrdenadasPorAnioDescendente();
                    break;
                case 6:
                    flota.mostrarPorTripulacionDescendente();
                    break;
                
                case 7: 
                    System.out.println("Saliendo... ");
                    break;
                    
                default: System.out.println("Opcion Invalida. ");
            }
            
        } while (opcion != 7);
        sc.close();
    }
}
