package instroduction;

public class strings {

	public static void main(String[] args) {
	
		// string is an object in java and if is has same value java will see them as a one object
		// String s = "Faruk ayaz";
		//String s1 = "Faruk ayaz";
		
		// when we give the values like this each variable will be different objects
		String s2 = new String("Faruk");
		String s3 = new String("Faruk");
		
		String s = "Faruk ayaz tester";
		String[] splited = s.split(" ");
		
		// spliting words by words
		for(int i=0;i<splited.length;i++)
		{
			System.out.println(splited[i]);
		}
		// spliting letter by letter
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.charAt(i));
			
		}
		// reverse it
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.println(s.charAt(i));
			
		}

	}

}
