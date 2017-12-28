using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;


namespace BootCamp
{
    [TestClass]
    public class Inloggen
    {
        static IWebDriver driverGC;

        [AssemblyInitialize]
        public static void SetUp(TestContext context)
        {
            driverGC = new ChromeDriver();
        }

        [TestMethod]
        public void Login()
        {
            driverGC.Navigate().GoToUrl("https://techblog.polteq.com/testshop/index.php");
            driverGC.FindElement(By.ClassName("login")).Click();
            driverGC.FindElement(By.Id("email")).SendKeys("stefan.croes@polteq.com");
            driverGC.FindElement(By.Id("passwd")).SendKeys("Z9E/Kcvw");
            driverGC.FindElement(By.Id("SubmitLogin")).Click();
            IWebElement webElement = driverGC.FindElement(By.ClassName("account"));
            Assert.AreEqual(webElement.Text, "Stefan Croes");
            driverGC.Close();










        }


    }
}

