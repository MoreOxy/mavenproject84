import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareLaneAutotest2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/main.py");


        driver.manage().window().maximize();


        WebElement btnSignUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        btnSignUp.click();


        WebElement zipCodeField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));

        zipCodeField.sendKeys("94367");


        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        btnContinue.click();


        WebElement firstNameField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));

        firstNameField.sendKeys("Aleksandr");


        WebElement lastNameField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));

        lastNameField.sendKeys("Skomorokha");


        WebElement emailField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        emailField.sendKeys("mroxymoron333@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));

        passwordField.sendKeys("674537");


        WebElement confirmPasswordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));

        confirmPasswordField.sendKeys("674537");
        

        WebElement btnRegister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));

        btnRegister.click();


        Thread.sleep(5000);

        driver.close();

        driver.quit();



        WebElement accountIsCreated = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        Assert.assertEquals("Account is created!",accountIsCreated.getText());


    }
}
