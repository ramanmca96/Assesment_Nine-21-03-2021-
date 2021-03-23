package CollectionsConcepts;

import java.util.EnumSet;
import java.util.Set;

import CollectionsConcepts.EnumExample.Programs;

public class EnumExample {

	enum Programs {
		JAVA,SELENIUM,PYTHON,SPRINGBOOT,RUBY,WEBDRIVER,CUCUMBER,TESTNG,API,POSTMAN,
	}	
	public static void main(String[] args) {
		
		//To be Print Entire Programs
		Set<Programs> set1= EnumSet.allOf(Programs.class);
		System.out.println("the entire Programs are:"+set1);
		
		Set <Programs> Set2 = EnumSet.of(Programs.SELENIUM,Programs.WEBDRIVER,Programs.CUCUMBER,Programs.TESTNG,Programs.POSTMAN);
		System.out.println("Testing Frameworks are : " +Set2);
	}
}
