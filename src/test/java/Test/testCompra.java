package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.setUp;
import Paginas.compra;


public class testCompra extends setUp {

	compra compra;
	
	@Test
	public void compraProducto() throws Exception  {
		
		try {
			
			compra = new compra(driver);
			compra.realizarCompra("lucalvi64@gmail.com", "123456");
			Assert.assertEquals(compra.compraExitosa(),"Your order has been placed!");
						
		}catch(Exception e) {
			
			System.out.println("No pudo realizar la compra");
			
		}
		
	}
	
}
