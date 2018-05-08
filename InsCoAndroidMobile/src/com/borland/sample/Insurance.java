package com.borland.sample;
// This is a sample comment.

import com.borland.silktest.jtf.MobileBaseState;

import org.junit.Before;
import org.junit.Test;
import com.microfocus.silktest.jtf.mobile.MobileTextField;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.microfocus.silktest.jtf.mobile.MobileButton;
import com.microfocus.silktest.jtf.mobile.MobileObject;
import com.borland.silktest.jtf.Desktop;

public class Insurance {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		
		String configFilter = System.getProperty("silkTest.configurationFilter");
		String configName = System.getProperty("silkTest.configurationName");
		
		System.out.println("This is the configFilter: " + configFilter);
		System.out.println("This is the configuration Name: " + configName);
		
		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(configFilter);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject jsonObject = (JSONObject) obj;
		String deviceName=(String) jsonObject.get("deviceName");
		
		System.out.println("Found deviceName to be: " + deviceName);
		
		
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