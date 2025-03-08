package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
/*Use only in a local implementation */
public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Detect OS and set driver path
            String os = System.getProperty("os.name").toLowerCase();
            String driverPath;

            if (os.contains("win")) {
                driverPath = "src/test/resources/drivers/chromedriver.exe"; // Windows
            } else {
                driverPath = "src/test/resources/drivers/chrome-linux64"; // Linux/Mac
            }

            System.setProperty("webdriver.chrome.driver", Paths.get(driverPath).toAbsolutePath().toString());
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
