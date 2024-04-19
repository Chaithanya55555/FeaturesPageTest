package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class featuresPageTest {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver obj = new ChromeDriver();
        obj.get("https://qafeaturesect.ccbp.tech/");
        WebElement text1 = obj.findElement(By.xpath("//span[@class = 'interaction']"));
        System.out.println(text1.getText());
        WebElement text2 = obj.findElement(By.xpath("//span/parent::p"));
        System.out.println(text2.getText());
        List <WebElement> text3 =obj.findElements(By.xpath("//h1[text() = 'Interaction']/ancestor::div[2]/following-sibling::div//p"));
        for (int i = 0; i < text3.size(); i++) {
            System.out.println(text3.get(i).getText());
        }
        List <WebElement> text4 =obj.findElements(By.xpath("//h1[text() = 'Interaction']/ancestor::div[2]/preceding-sibling::div//p"));
        for (int i = 0; i < text4.size(); i++) {
            System.out.println(text4.get(i).getText());
        }
        Thread.sleep(3000);
        obj.quit();
    }
}
