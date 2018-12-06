import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Litecart {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {

       driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);

          }

        public boolean  isElementPresent (By locator){
            try {
                driver.findElement(locator);
                return true;
            } catch (NoSuchElementException ex) {
                return false;

            }
        }

        @Test
    public void litecartTest() {

            driver.get("http://localhost/litecart/admin/login.php");
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.findElement(By.name("login")).click();


    }
    //Appearence
        @Test
        public void Appearence () {
            litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[1]")).click();
            String actualTitle=driver.getTitle();
            String expectedTitle="Template | My Store";
            assertEquals(actualTitle, expectedTitle);

        }

    //Catalog
        @Test
    public void Catalog() {
            litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[2]")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Catalog | My Store";
            assertEquals(actualTitle, expectedTitle);

            driver.findElement(By.id("doc-catalog")).click();
            driver.findElement(By.id("doc-product_groups")).click();
            driver.findElement(By.id("doc-option_groups")).click();
            driver.findElement(By.id("doc-manufacturers")).click();
            driver.findElement(By.id("doc-suppliers")).click();
            driver.findElement(By.id("doc-delivery_statuses")).click();
            driver.findElement(By.id("doc-sold_out_statuses")).click();
            driver.findElement(By.id("doc-quantity_units")).click();
            driver.findElement(By.id("doc-csv")).click();


        }

    //Countries_and_Currencies
        @Test
    public void Countries_and_Currencies(){
        litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[3]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Countries | My Store";
                assertEquals(actualTitle, expectedTitle);
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[4]")).click();
            actualTitle = driver.getTitle();
            expectedTitle = "Currencies | My Store";
                assertEquals(actualTitle, expectedTitle);
}
    //Customers
        @Test
    public void Customers(){
        litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[5]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Customers | My Store";
                assertEquals(actualTitle, expectedTitle);
            driver.findElement(By.id("doc-customers")).click();
            driver.findElement(By.id("doc-csv")).click();
            driver.findElement(By.id("doc-newsletter")).click();
            }
    //Geozones
        @Test
    public void Geozones() {
            litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[6]")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Geo Zones | My Store";
            assertEquals(actualTitle, expectedTitle);
        }
    //Language
         @Test
     public void Language(){
         litecartTest();
            driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[7]")).click();
            String actualTitle = driver.getTitle();
              String expectedTitle="Languages | My Store";
                assertEquals(actualTitle, expectedTitle);
            driver.findElement(By.id("doc-storage_encoding")).click();
    }
    //Modules
        @Test
    public void Modules(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[8]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Job Modules | My Store";
                assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-jobs")).click();
        driver.findElement(By.id("doc-customer")).click();
        driver.findElement(By.id("doc-shipping")).click();
        driver.findElement(By.id("doc-payment")).click();
        driver.findElement(By.id("doc-order_total")).click();
        driver.findElement(By.id("doc-order_success")).click();
        driver.findElement(By.id("doc-order_action")).click();

    }
    //Orders
         @Test
    public void Orders(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[9]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Orders | My Store";
                assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-orders")).click();
        driver.findElement(By.id("doc-order_statuses")).click();
    }
    //Pages
         @Test
    public void Pages(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[10]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Pages | My Store";
                assertEquals(actualTitle, expectedTitle);
    }
    //Reports
         @Test
    public void Reports(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[11]")).click();
                String actualTitle=driver.getTitle();
                String expectedTitle="Monthly Sales | My Store";
                assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-monthly_sales")).click();
        driver.findElement(By.id("doc-most_sold_products")).click();
        driver.findElement(By.id("doc-most_shopping_customers")).click();
    }
    //Settings
         @Test
    public void Settings(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[12]")).click();
             String s = driver.getTitle();
             System.out.println(s);
                String actualTitle=driver.getTitle();
                String expectedTitle="Settings | My Store";
                assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-store_info")).click();
        driver.findElement(By.id("doc-defaults")).click();
        driver.findElement(By.id("doc-general")).click();
        driver.findElement(By.id("doc-listings")).click();
        driver.findElement(By.id("doc-images")).click();
        driver.findElement(By.id("doc-checkout")).click();
        driver.findElement(By.id("doc-advanced")).click();
        driver.findElement(By.id("doc-security")).click();
    }
    //Slides_and_Taxes
         @Test
    public void Slides_Taxes(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[13]")).click();
             String actualTitle=driver.getTitle();
             String expectedTitle="Slides | My Store";
             assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[14]")).click();
             actualTitle=driver.getTitle();
             expectedTitle="Tax Classes | My Store";
             assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-tax_classes")).click();
        driver.findElement(By.id("doc-tax_rates")).click();
    }
    //Translations
         @Test
    public void Translations(){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[15]")).click();

             String actualTitle=driver.getTitle();
             String expectedTitle="Search Translations | My Store";
             assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-search")).click();
        driver.findElement(By.id("doc-scan")).click();
        driver.findElement(By.id("doc-csv")).click();
    }
    //Users_and_vQmods
         @Test
    public void Users_and_vQmods (){
        litecartTest();
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[16]")).click();
             String actualTitle=driver.getTitle();
             String expectedTitle="Users | My Store";
             assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.xpath("//ul[@id='box-apps-menu']//li[17]")).click();
             actualTitle=driver.getTitle();
              expectedTitle="vQmods | My Store";
             assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.id("doc-vqmods")).click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;

    }
}
