using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SilkTest.Ntf;
using SilkTest.Ntf.XBrowser;

namespace Silk4NETProject2
{
    [SilkTestClass]
    public class UnitTest1
    {
        private readonly Desktop _desktop = Agent.Desktop;

        [TestInitialize]
        public void Initialize()
        {
            // Go to web page 'http://demo.borland.com/InsuranceWebExtJS/'
            BrowserBaseState baseState = new BrowserBaseState();
            baseState.Execute();
        }

        [TestMethod]
        public void TestMethod1()
        {
            BrowserApplication webBrowser = _desktop.BrowserApplication("demo_borland_com");

            BrowserWindow browserWindow = webBrowser.BrowserWindow("BrowserWindow");
            browserWindow.DomTextField("EmailID").SetText("john.smith@gmail.com");
            browserWindow.DomTextField("Password").TypePasswordKeys("7092Gw==");
            //browserWindow.DomButton("login-form login").Click();
            browserWindow.DomButton("LoginButton").Click();
            Assert.AreEqual("John Smith", browserWindow.DomElement("John Smith").Text);
            browserWindow.DomButton("LogOutButton").Click();
        }
    }
}