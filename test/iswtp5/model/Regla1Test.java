
package iswtp5.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Operador1
 */
public class Regla1Test {
    
    public Regla1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Negocio.Iniciar();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RealizarDescuento method, of class Regla1.
     */
    @Test
    public void testRealizarDescuento() {
        System.out.println("RealizarDescuento");
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[0],3);
        venta.AgregarDetalle(Negocio.Productos()[0],5);
        //venta.AgregarDetalle(Negocio.Productos()[2],1);
        Regla1 regla1 = new Regla1();
        double result = regla1.RealizarDescuento(venta);
        
        double expResult = 50.0;
        
        
        assertEquals(expResult, result, 0.5);
        
        
    }
    /*public void comprobarRegla2ValoresMayores2500Descuento6yMedioPorCiento(){
        //Configuración
      Venta venta;
      venta = new Venta();
      venta.AgregarDetalle(Negocio.Productos()[0], 80);
      venta.AgregarDetalle(Negocio.Productos()[1], 1);
      venta.AgregarDetalle(Negocio.Productos()[2],1);
      Regla2 regla2 = new Regla2();
      double descuento =0;
      
      //Ejecución
      descuento = regla2.RealizarDescuento(venta);
      
      //Validación
        assertEquals(264.55, descuento, 0.01);
    }*/
}
