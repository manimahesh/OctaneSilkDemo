package com.borland.sample;

import com.borland.silktest.jtf.MobileBaseState;
import org.junit.Before;
import org.junit.Test;
import com.microfocus.silktest.jtf.mobile.MobileTextField;
import com.microfocus.silktest.jtf.mobile.MobileButton;
import com.microfocus.silktest.jtf.mobile.MobileObject;
import com.microfocus.silktest.jtf.mobile.MobileDevice;
import com.borland.silktest.jtf.common.types.Point;
import org.junit.Assert;
import com.borland.silktest.jtf.Desktop;

public class Insurance {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		MobileBaseState baseState = new MobileBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void getQuote() {
		desktop.<MobileTextField>find("Device.email").clearText();
		desktop.<MobileTextField>find("Device.email").setText("john.smith@gmail.com");
		desktop.<MobileTextField>find("Device.password").clearText();
		desktop.<MobileTextField>find("Device.password").typePasswordKeys("7092G6g=");
		desktop.<MobileButton>find("Device.log_in_button").click();
		desktop.<MobileObject>find("Device.drawer_open").click();
/*
		desktop.<MobileObject>find("Device.AUTO QUOTE").click();
		desktop.<MobileTextField>find("Device.autoquote_zip").clearText();
		desktop.<MobileTextField>find("Device.autoquote_zip").setText("94582");
		desktop.<MobileTextField>find("Device.autoquote_email").clearText();
		desktop.<MobileTextField>find("Device.autoquote_email").setText("john.smith@gmail.com");
		desktop.<MobileTextField>find("Device.autoquote_age").clearText();
		desktop.<MobileTextField>find("Device.autoquote_age").setText("45");
		desktop.<MobileObject>find("Device.radio_male").click();
		desktop.<MobileObject>find("Device.rating_driving_record").click();
		desktop.<MobileObject>find("Device.radio_car").click();
		desktop.<MobileDevice>find("Device").drag(new Point(757, 1700), new Point(976, 489));
		desktop.<MobileTextField>find("Device.autoquote_car_year").clearText();
		desktop.<MobileTextField>find("Device.autoquote_car_year").setText("2000");
		desktop.<MobileObject>find("Device.car_make").click();
		desktop.<MobileObject>find("Device.Toyota").click();
		desktop.<MobileObject>find("Device.car_model").click();
		desktop.<MobileObject>find("Device.Camry").click();
		desktop.<MobileObject>find("Device.financial_info").click();
		desktop.<MobileObject>find("Device.Own").click();
		desktop.<MobileButton>find("Device.submit").click();
		MobileObject result = desktop.<MobileObject>find("Device.result");
		Assert.assertEquals("Your Instant Quote is USD $1,140.00 every twelve months.", result.getText());
		desktop.<MobileObject>find("Device.Navigate up").click();
		desktop.<MobileObject>find("Device.Navigate up").click();
		desktop.<MobileObject>find("Device.drawer_open").click();
*/		
		
		desktop.<MobileObject>find("Device.LOGOUT").click();
		desktop.<MobileDevice>find("Device").pressHome();
	}

}