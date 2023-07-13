package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter IP address");
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        System.setProperty("webdriver.openqa.driver", "C:\\Users\\byhyh\\Desktop\\מדעי המחשב\\מבוא למדעי המחשב\\WhatsAppARYD\\src\\drivers");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();
        WebElement webElement= driver.findElement(By.className("search-field"));
        if (webElement!=null){
            webElement.click();
            webElement.sendKeys(text);
            WebElement searchButton = driver.findElement(By.className("search-submit"));
            if (searchButton!=null){
                searchButton.click();
            }
        }
        WebElement countryPrint = driver.findElement(By.xpath("//*[@id=\"fl-post-1165\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/p[7]"));
        System.out.println(countryPrint.getText());


    }
}

  //  Document document=Jsoup.connect("https://playback.fm/one-hit-wonders-2010s").get();
//            String data=document.text().substring(document.text().indexOf("Image Credit 2019"));
//
//            String[] splitter = data.split("-");
//                String[] yearHolder=data.split("201");
//                int year =9;
//                for (int i=1;i<11;i++){
//                    String [] x = yearHolder[i].split("#");
//                    System.out.println("201"+year);
//                    year--;
//                    for (int j=0;j<x.length;j++){
//                        System.out.println(x[j]);
//                        if(j==10){
//                            break;
//                        }
//                    }
//                }