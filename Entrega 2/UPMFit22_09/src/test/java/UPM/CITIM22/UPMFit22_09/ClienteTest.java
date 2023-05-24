package UPM.CITIM22.UPMFit22_09;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testCliente() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testClienteIntStringIntIntStringStringStringStringString() {
		Cliente cliente = new Cliente(18, "hombre", 70, 5940, "57235901D", "password", "pepe@upm.es", "Pepe", "PepeUPM" );
		
		assertEquals(18, cliente.getEdad());
		assertEquals("hombre", cliente.getSexo());
		assertEquals(70, cliente.getPeso());
		assertEquals(5940, cliente.getTarjeta());
		assertEquals("57235901D", cliente.getDni());
		assertEquals("password", cliente.getContrasena());
		assertEquals("pepe@upm.es", cliente.getCorreo());
		assertEquals("Pepe", cliente.getNombre());
		assertEquals("PepeUPM", cliente.getNombreUsuario());
		
	}

	@Test
	public void testSetEdad() {
		Cliente cliente = new Cliente();
		cliente.setEdad(18);
		assertEquals(18, cliente.getEdad());
		
	}

	@Test
	public void testSetPeso() {
		Cliente cliente = new Cliente();
		cliente.setPeso(70);
		assertEquals(70, cliente.getPeso());
	}

	@Test
	public void testSetSexo() {
		Cliente cliente = new Cliente();
		cliente.setSexo("hombre");
		assertEquals("hombre", cliente.getSexo());
	}

	@Test
	public void testSetTarjeta() {
		Cliente cliente = new Cliente();
		cliente.setTarjeta(5940);
		assertEquals(5940, cliente.getTarjeta());
	}

	@Test
	public void testSetId() {
		Cliente cliente = new Cliente();
		cliente.setId(100);
		assertEquals(100, cliente.getId());
	}

	/*@Test
	public void testAddInscripcionCurso() {
		fail("Not yet implemented");
	}*/

}
