package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Demohooks {
	
	@Before
	public void launchBroswer() {
		System.out.println("launch browser");
	}

	@After
	public void teardown() {
		System.out.println("close the  browser");
	}
	@BeforeStep
	public void hi() {
		System.out.println("hi");
	}
	@AfterStep
	public void b() {
		System.out.println("bye");
		}
}
