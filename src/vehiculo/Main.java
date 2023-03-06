
package vehiculo;

/**
 * Clase main del programa. Crea un tipo de vehículo y luego opera sobre él.
 * @author IES Aguadulce
 */
public class Main {
    /**
     * Método main.
     * 
     * Este es el método principal del programa. 
     * 
     */
      public static void main(String[] args) {
        VehiculoCadenasDeLlanoSerranoJorge2223 miVehiculoCadenasDeLlanoSerranoJorge2223;
        int stockActual;
        
        miVehiculoCadenasDeLlanoSerranoJorge2223 = new VehiculoCadenasDeLlanoSerranoJorge2223("Seat",18000,100);
        operativaVehiculosCadenasDeLlanoSerranoJorge2223(miVehiculoCadenasDeLlanoSerranoJorge2223, 50); 
    }

    private static void operativaVehiculosCadenasDeLlanoSerranoJorge2223(VehiculoCadenasDeLlanoSerranoJorge2223 miVehiculoCadenasDeLlanoSerranoJorge2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoCadenasDeLlanoSerranoJorge2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoCadenasDeLlanoSerranoJorge2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoCadenasDeLlanoSerranoJorge2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
