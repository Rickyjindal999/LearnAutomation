package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinks = new ArrayList<>();
		
		for (int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")!= null)
			{
				activeLinks.get(i);
			}
			
			System.out.println(activeLinks.size());
		}

		for(int j=0;j<activeLinks.size();j++) {
		
		HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		String msg =connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activeLinks.get(j).getAttribute("href")+"-----"+msg);
	}

}
}
