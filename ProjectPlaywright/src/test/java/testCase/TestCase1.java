package testCase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestCase1 {
 
	public static void main(String[] args) {

		// server start
		Playwright playwright = Playwright.create();

		LaunchOptions lp = new LaunchOptions();
//		lp.setChannel("chrome");
		lp.setHeadless(false);

		Browser browser = playwright.webkit().launch(lp);
		BrowserContext context_1 = browser.newContext();
		Page page = context_1.newPage();
//		page.navigate("https://www.cricbuzz.com");
		page.navigate("https://www.myntra.com/");
		page.locator("'Beauty'").first().click();
		System.out.println(page.title());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 playwright.close();
	}
}
