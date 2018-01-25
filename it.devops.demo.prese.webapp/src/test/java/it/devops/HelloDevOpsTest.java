package it.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloDevOpsTest {

	@Test
	public void testSimple() {
		HelloDevOps hdv = new HelloDevOps();
		assertEquals("Hello DevOps", hdv.greet());
	}

}
