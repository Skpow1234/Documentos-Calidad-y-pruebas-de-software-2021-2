package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4 {

    private ChromeDriver driver;

    @Given("^estoy en la pagina de de la usb")
    public void estoy_en_pagina_usb() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        /*
            Creamos objeto ChromeDriver,
            levantamos una instancia en el navegador que se redirige a la página en cuestion,
            y maximizamos esa ventana
         */
        driver = new ChromeDriver();
        driver.get("https://www.caracoltv.com/");
        driver.manage().window().maximize();
    }

    @When("navegar a la opcion de inscripciones pregrado")
    public void elegir_video() {
     // WebElement input = driver.findElement(By.xpath("/html/body/bs-page/nav/ul/li[1]/div/div/ps-link/a"));
     // input.click();

        WebElement video = driver.findElement(By.xpath("/html/body/bs-page/header/ps-header/div/div[1]/div[3]/button"));
        video.click();

        WebElement search = driver.findElement(By.xpath("/html/body/bs-page/header/ps-header/div/div[1]/div[3]/div[2]/form/label/input"));
        search.sendKeys("Futbol");

        WebElement sendButton = driver.findElement(By.xpath("/html/body/bs-page/header/ps-header/div/div[1]/div[3]/div[2]/form/button"));
        sendButton.click();
 

    }

    @When("activar el sonido del video de youtube")
    public void activar_sonido_video_youtube() {

    }


}
