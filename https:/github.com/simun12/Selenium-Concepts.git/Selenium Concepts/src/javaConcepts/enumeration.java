package javaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class enumeration {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fil=new FileInputStream("//Users//mohammadhasan//workspace//new project//project1.properties");//need a propertie file
		prop.load(fil);
		System.out.println(prop.getProperty("username"));
		
		Enumeration yl=prop.keys();
		while(yl.hasMoreElements())
		{
			String name=(String)yl.nextElement();
			String value=prop.getProperty(name);
			System.out.println(name+":"+value);
		}

	}

}
