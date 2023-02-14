package progressiveTddUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	Properties properties;		
	private String key;	
	public ReadProperties() {
		loadProperties();
	}
	private void loadProperties() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("environment.properties");
		properties = new Properties();
		try { properties.load(inputStream);		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}					
	public String getPropertie(String key) {
		if (key!= null) {
			return properties.getProperty(key);
			
		}else {
			return null;			
		}				
	}				
	public long getNumberProperty(String key) {
		String value = getPropertie(key);
		if(value!=null) {
			String refinedValue = value.trim().replaceAll("[^0-9]", "");
		return Long .parseLong(refinedValue);
		}else {
			return 0;
	}
}
	
}
