package javaConcepts;

import java.util.HashSet;
import java.util.Set;

public class duplicateElement {

	public static void main(String[] args) {
    
		String names[] = {"java", "java","ruby", "ruby"};
		
		Set<String> store= new HashSet<String>();
		for(String name : names) {
			if(store.add(name)== false) {
				System.out.println("duplicate element" + name );
			}
	}

}

	}


