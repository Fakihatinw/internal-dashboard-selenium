package com.marine.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
            String path = Paths.get(".").toAbsolutePath().normalize().toString();
            System.setProperty("webdriver.chrome.driver", path + "/src/driver/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
    }

    @After
    public void tearDown() {
//        driver.quit();
    }
}
