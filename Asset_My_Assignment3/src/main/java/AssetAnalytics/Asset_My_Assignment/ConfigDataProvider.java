package AssetAnalytics.Asset_My_Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

public static Properties prop;
	
	public ConfigDataProvider() {
		
		try {

			File fs = new File(".//Asset_My_Assignment/src/main/java/resources/configdata.properties");
			FileInputStream fis = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println("File not found :" + e.getMessage());
		}
	}
	
	public String getUrl()
	{
		return prop.getProperty("TestUrl");		
	}
	public String getUserName()
	{
		return prop.getProperty("User");		
	}
	
	public String getUserpass()
	{
		return prop.getProperty("pwd");		
	}
	
	public String getChromeBrowser()
	{
		return prop.getProperty("Browser");		
	}
	

}
