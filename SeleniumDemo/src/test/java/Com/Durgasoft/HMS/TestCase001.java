package Com.Durgasoft.HMS;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import Com.Durgasoft.HMS.BasePage;

public class TestCase001 extends BasePage{
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	 //browserLaunch("Firefox", "http://www.seleniumbymahesh.com/");
	 browserLaunch("Chrome", "http://www.spicejet.com/");
	 browserLaunch("IE", "http://www.Google.com/");
	 
  }

}
