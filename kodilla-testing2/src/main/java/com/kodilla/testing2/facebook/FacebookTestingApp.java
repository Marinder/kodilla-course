package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_BIRTHDAY_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public final static String XPATH_BIRTHDAY_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public final static String XPATH_BIRTHDAY_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/reg/");

        WebElement day = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(2);

        WebElement month = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(11);

        WebElement year = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(22);
    }
}
