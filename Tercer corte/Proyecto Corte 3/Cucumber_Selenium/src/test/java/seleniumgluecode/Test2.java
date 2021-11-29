package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Test2 {

    private ChromeDriver driver;

    @Given("^estoy en la pagina de amazon")
    public void estoy_en_la_pagina_amazon() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        /*
            Creamos objeto ChromeDriver,
            levantamos una instancia en el navegador que se redirige a la página en cuestion,
            y maximizamos esa ventana
         */
        driver = new ChromeDriver();
        driver.get("https://www.twitch.tv/");
        driver.manage().window().maximize();
    }

    @Given("buscar producto")
    public void quiero_buscar_producto_en() {
       WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
       input.sendKeys("xbox");

       WebElement sendButton = driver.findElement(By.id("nav-search-submit-button"));
        sendButton.click();


        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);



        //WebElement elementosDiv = driver.findElement(By.className("s-main-slot.s-result-list.s-search-results.sg-row"));
       //WebElement div = elementosDiv.findElement(By.xpath(""));



    }

    @Given("elegir  producto")
    public void elegir_un_producto() {
        driver.findElement(new By.ByLinkText("Microsoft 4N6-00001 Controlador Xbox + Cable para Windows, Negro")).click();
        Select quantity = new Select(driver.findElement(By.id("quantity")));
        quantity.selectByIndex(1);
    }

    @Given("agregar al carrito")
    public void agregar_el_producto_a() {
        WebElement agregarAlCarrito = driver.findElement(By.id("add-to-cart-button"));
        agregarAlCarrito.click();

        WebElement cerrarModal = driver.findElement(By.id("attach-close_sideSheet-link"));
        cerrarModal.click();
    }


    @Given("ir al carrito")
    public void ir_al_carrito() {
        WebElement abrirCarritoCompras = driver.findElement(By.id("nav-cart-count"));
        abrirCarritoCompras.click();
    }






}
