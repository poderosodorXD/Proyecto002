package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        Assert.assertEquals("Testing | imalittletester",driver.getTitle());
        /*System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();*/
    }

    @When("^Hace click sobre el link de Latest Comics$")
    public void hace_click_sobre_el_link_de_Latest_Comics() throws Throwable {
        By idElementComics = By.id("comp-iiyocj9v5label");
        WebElement tituloComics = driver.findElement(idElementComics);
        tituloComics.click();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        By nombre = By.cssSelector("h2.font_0 span span");
        WebElement nombrePagina = driver.findElement(nombre);
        String Texto = nombrePagina.getText();
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", nombrePagina.isDisplayed());
        Assert.assertEquals("THE LITTLE TESTER COMICS SERIES", Texto);
        System.out.println(nombrePagina.isDisplayed());
    }


}
