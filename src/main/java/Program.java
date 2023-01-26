
//imports = adding additional libraries of code to assist with programing what we need to get done.
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//We'll get into what classes are in the future. For now all you need to remember is that code will typically be written within a class.
public class Program {

    //We'll get into what "public static void main(String[] args)" method means in the future.
    //For now, you just need to know that code should be written inside here so code can be executed properly.
    public static void main(String[] args) throws InterruptedException {
        
        //Here we're doing a basic setup of an emulated google chrome browser
        WebDriverManager.chromedriver().setup();

        //Here we're creating an object representing the chrome browser
        //1. new ChromeDriver(); = the chrome browser object
        //2. driver = the variable/container to hold the browser object.
        WebDriver driver = new ChromeDriver();
        
        
        /*
            Here we're using that variable/container called "driver" which is holding that chrome browser
            to open up google.com using .get(url) method.
            
            Reference URL: https://www.selenium.dev/documentation/webdriver/getting_started/first_script/
                -if you're feeling spontaneous, try out some of the examples shown in the link above.
            
            For practice here, try to open up some other websites using the .get() method
        */ 
        driver.get("https://www.google.com");
        
        
        /*
            Here I just setup a 10 second wait so the browser doesn't close so fast 
            and that you're able to view the website opening up
        */
        driver.wait(10000);
        
        
        
        /*
            Here we're using the .quit() method to simply 
            close the browser after we're done with our execution. 
           
            Good practice: Definitely always add this at the end of your script.
                -if you don't, you'll notice that your task manager will show a whole bunch of chromedrivers still running in the background.
        */
        driver.quit();
    }
}
