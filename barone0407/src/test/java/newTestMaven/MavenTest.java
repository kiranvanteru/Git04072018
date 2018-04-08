package newTestMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MavenTest {
  @Test
  public void f() {
	  System.out.println("test bar 0407");
	  System.out.println("extension to the next day");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
  }

}
