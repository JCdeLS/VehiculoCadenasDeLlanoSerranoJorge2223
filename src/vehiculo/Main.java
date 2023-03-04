
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCadenasDeLlanoSerranoJorge2223 miVehiculoCadenasDeLlanoSerranoJorge2223;
        int stockActual;
        
        miVehiculoCadenasDeLlanoSerranoJorge2223 = new VehiculoCadenasDeLlanoSerranoJorge2223("Seat",18000,100);
        operativaVehiculosCadenasDeLlanoSerranoJorge2223(miVehiculoCadenasDeLlanoSerranoJorge2223); 
    }

    private static void operativaVehiculosCadenasDeLlanoSerranoJorge2223(VehiculoCadenasDeLlanoSerranoJorge2223 miVehiculoCadenasDeLlanoSerranoJorge2223) {
        int stockActual;
        int cantidad;
        cantidad=50;
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
    
