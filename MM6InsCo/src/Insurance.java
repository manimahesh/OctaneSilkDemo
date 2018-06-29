import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import org.junit.Assert;
import com.borland.silktest.jtf.Desktop;

public class Insurance {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://demo.borland.com/InsuranceWebExtJS/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void Login() {
		desktop.<DomTextField>find("demo_borland_com.BrowserWindow.EmailID").setText("john.smith@gmail.com");
		desktop.<DomTextField>find("demo_borland_com.BrowserWindow.Password").typePasswordKeys("7092Gw==");
		desktop.<DomButton>find("demo_borland_com.BrowserWindow.login-form login").click();
		DomElement johnSmith = desktop.<DomElement>find("demo_borland_com.BrowserWindow.John Smith");
		Assert.assertEquals("John Smith", johnSmith.getText());
		desktop.<DomButton>find("demo_borland_com.BrowserWindow.LogoutButton").click();
	}
 
}