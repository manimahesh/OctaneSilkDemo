using SilkTest.Ntf.XBrowser;
using Microsoft.VisualStudio.TestTools.UnitTesting;

using System;
using System.Collections.Generic;
using SilkTest.Ntf;

namespace Silk4NETProject1
{
    [SilkTestClass]
    public class UnitTest1
    {
        private readonly Desktop _desktop = Agent.Desktop;

        [TestMethod]
        public void TestMethod1()
        {
            BrowserApplication webBrowser = _desktop.BrowserApplication("DemoApp");
            BrowserWindow browserWindow = webBrowser.BrowserWindow("BrowserWindow");
            browserWindow.DomTextField("EmailID").SetText("john.smith@gmail.com");
            browserWindow.DomTextField("Password").TypePasswordKeys("7092Gw==");
            browserWindow.DomButton("login-form login").Click();
            Assert.AreEqual("John Smith", browserWindow.DomElement("John Smith").Text);
            browserWindow.DomButton("logout-form logout").Click();
        }
    }
}