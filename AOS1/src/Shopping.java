import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.Desktop;

public class Shopping {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://www.advantageonlineshopping.com/#/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void speakerShop() {
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.speakersImg").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.Bose Soundlink Bluet").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.rabbit").click();
		desktop.<DomButton>find("advantageonlineshopping_com.BrowserWindow.save_to_cart").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.menuCart").click();
		desktop.<DomButton>find("advantageonlineshopping_com.BrowserWindow.checkOutButton").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.HOME").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.M 9 20 c -1 1 0 -2 0").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.REMOVE").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.CONTINUE SHOPPING").click();
	}

}