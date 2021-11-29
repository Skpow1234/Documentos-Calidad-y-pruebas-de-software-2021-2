package seleniumgluecode;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Test3 {

    private ChromeDriver driver;

    @Given("^estoy en la pagina de youtube")
    public void estoy_en_la_pagina_youtube() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        /*
            Creamos objeto ChromeDriver,
            levantamos una instancia en el navegador que se redirige a la página en cuestion,
            y maximizamos esa ventana
         */
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

    @Given("buscar video")
    public void elegir_video() {
       WebElement input = driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
       input.sendKeys("La Humanidad No Puede Reproducirse Desde Hace 18 Años");

       WebElement sendButton = driver.findElement(By.id("search-icon-legacy"));
       sendButton.click();

        WebElement select = driver.findElement(By.id("title-wrapper"));
        select.click();
       //driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer[1]/div[1]/div[2]/ytd-vertical-list-renderer/div[1]/ytd-video-renderer[3]/div[1]/ytd-thumbnail/a/yt-img-shadow/img")).click();


       //El Mundo Colapsa Tras 18 Años En Los Que Nadie Puede Reproducirse ( Resumen de Peliculas )
    }


}
