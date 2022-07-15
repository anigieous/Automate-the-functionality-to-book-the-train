package makeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launchbrowser {
    public static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        //opening the chrome
        driver.navigate().to("https://www.makemytrip.com/railways/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        //printing title
        if(title.equalsIgnoreCase("https://www.makemytrip.com"))
            System.out.println("https://www.makemytrip.com/railways/");
        else
            System.out.println(title);
        //printing URL
        if(URL.equalsIgnoreCase("https://www.makemytrip.com/railways/"))
            System.out.println("https://www.makemytrip.com/railways/");
        else
            System.out.println(URL);
        //click on from
        WebElement from = driver.findElement(By.id("rsw_inputBox selectRailCity  "));
        Actions action1 = new Actions(driver);
        action1.moveToElement(from).perform();
        Thread.sleep(2000);
        //entering city as delhi
        WebElement myElement1=driver.findElement(By.id("fromCity"));
        myElement1.sendKeys("DELHI");
        //click on To
        WebElement to = driver.findElement(By.id("lbl_input makeFlex column latoBold"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(to).perform();
        Thread.sleep(2000);
        //entering city as delhi
        WebElement myElement2=driver.findElement(By.id("toCity"));
        myElement2.sendKeys("LUCKNOW");
        //click on Date
        WebElement Date = driver.findElement(By.id("rsw_inputBox dayPickerRailWrap dates inactiveWidget activeWidget"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(Date).perform();
        Thread.sleep(2000);
        //enter the date
        WebElement myElement3=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div"));
        myElement3.sendKeys("May");
        myElement3.sendKeys(Keys.TAB);
        myElement3.sendKeys("20");
        Thread.sleep(2000);
        //selecting 3rd AC from dropdown
        WebElement clas = driver.findElement(By.className("rsw_inputBox travelFor inactiveWidget activeWidget")) ;
        Actions action = new Actions(driver);
        action.moveToElement(clas).perform();
        Thread.sleep(2000);
        WebElement ac3 = driver.findElement(By.className("rsw_inputBox travelFor inactiveWidget activeWidget"));
        action.moveToElement(ac3);
        action.click();
        //click on search
        WebElement search = driver.findElement(By.id("primaryBtn font24 latoBold widgetSearchBtn"));
        Actions action4 = new Actions(driver);
        action4.moveToElement(search).perform();
        Thread.sleep(2000);
         

    }

}


