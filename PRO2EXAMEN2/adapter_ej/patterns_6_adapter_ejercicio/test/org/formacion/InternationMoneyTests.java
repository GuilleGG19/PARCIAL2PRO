package org.formacion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternationMoneyTests {

	private InternationalMoneyOrganization servicio;
	
	@Before
	public void init() {
		// cambia este null por una referencia al adapter que has creado
		servicio = new Adapter();
	}
	
	@Test
	public void test_cliente_no_existe() {
		Assert.assertEquals(0,servicio.state("No_existo"));
	}

	@Test
	public void test_operaciones_con_nuevo_cliente() {
		String cliente = "nuevo";
		servicio.transfer(100, cliente);
		System.out.println(100 + " " + cliente);
		servicio.transfer(-70, cliente);
		System.out.println(30 + " " + cliente);
	}
}
