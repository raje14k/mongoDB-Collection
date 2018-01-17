import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testScrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/payalkumari/Desktop/selenium-java-3.0.1/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.navigate().to("http://launch.newsinc.com/embed.html?type=VideoLauncher/Slider");
		(function(){_nw2e.Ndn_EventHub.on("all",function(){console.log("[Ndn_EventHub]",arguments[0],arguments[1])})});
	}
}

		
	
	
	
	
	}

}
