package UPM.CITIM22.UPMFit22_09;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {
	
	Cliente cliente;

	//añadir tests de las clases que hereda cliente, como setContraseña
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cliente = new Cliente();
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testCliente() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testSetEdad() {
	
		cliente.setEdad(18);
		assertEquals(18, cliente.getEdad());
		
	}

	@Test
	public void testSetPeso() {
	
		cliente.setPeso(70);
		assertEquals(70, cliente.getPeso());
	}

	@Test
	public void testSetSexo() {
		
		cliente.setSexo("hombre");
		assertEquals("hombre", cliente.getSexo());
	}

	@Test
	public void testSetTarjeta() {
	
		cliente.setTarjeta(5940);
		assertEquals(5940, cliente.getTarjeta());
	}

	@Test
	public void testSetId() {
		cliente.setId(100);
		assertEquals(100, cliente.getId());
	}
	
	public void testSetDni() {
		cliente.setDni("57235901D");
		assertEquals("57235901D", cliente.getDni());
	}
	
	public void testSetContrasena() {
		cliente.setContrasena("password");
		assertEquals("password", cliente.getContrasena());
	}
	
	public void testSetCorreo() {
		cliente.setCorreo("pepe@upm.es");
		assertEquals("pepe@upm.es", cliente.getCorreo());
	}
	
	public void testSetNombre() {
		cliente.setNombre("Pepe");
		assertEquals("Pepe", cliente.getNombre());
	}
	
	public void testSetNombreUsuario() {
		cliente.setNombreUsuario("PepeUPM");
		assertEquals("PepeUPM", cliente.getNombreUsuario());
	}

	/*@Test
	public void testAddInscripcionCurso() {
		fail("Not yet implemented");
	}*/

}