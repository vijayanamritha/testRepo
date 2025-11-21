package sess41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream path=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		//load properties file
		Properties propobj=new Properties();
		propobj.load(path);
		//Read each data value from the properties file
		String url=propobj.getProperty("appurl");
		System.out.println(url);
		//Read only keys
		Set<String>keys=propobj.stringPropertyNames();
		System.out.println(keys);
		//Read only values
		Collection values=propobj.values();
		System.out.println(values);

	}

}
