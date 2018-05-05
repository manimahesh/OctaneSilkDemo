package com.borland.sample;
// This is a sample comment.

import com.borland.silktest.jtf.MobileBaseState;
import org.junit.Before;
import org.junit.Test;
import com.microfocus.silktest.jtf.mobile.MobileTextField;
import com.microfocus.silktest.jtf.mobile.MobileButton;
import com.microfocus.silktest.jtf.mobile.MobileObject;
import com.borland.silktest.jtf.Desktop;

public class Insurance {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		MobileBaseState baseState = new MobileBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void login() {
		desktop.<MobileTextField>find("Device.email").setText("john.smith@gmail.com");
		desktop.<MobileTextField>find("Device.password").typePasswordKeys("7092G6g=");
		desktop.<MobileButton>find("Device.log_in_button").click();
		desktop.<MobileObject>find("Device.drawer_open").click();
		desktop.<MobileObject>find("Device.LOGOUT").click();
	}

}