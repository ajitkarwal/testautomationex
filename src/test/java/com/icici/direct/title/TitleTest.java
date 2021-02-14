package com.icici.direct.title;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

  @BeforeAll
  public static void beforeAll(){
    System.setProperty("webdriver.chrome.driver","/Users/jagdeep/projects/testAutomation/chromedriver");
  }

  @Test
  @Ignore
  public void testTitle(){
    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://demo.guru99.com/test/newtours/";


    // launch Chrome fox and direct it to the Base URL
    driver.get(baseUrl);

    // get the actual value of the title
    String actualTitle = driver.getTitle();
    String expectedTitle = "Welcome: Mercury Tours";
    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
    Assertions.assertEquals(actualTitle, expectedTitle);

    //close Fire fox
    driver.close();

  }

}
