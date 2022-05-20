package instroduction;

import java.util.ArrayList;

public class ifelse {

	public static void main(String[] args) {
	
		int[] arr2 = {1,2,3,4,5,46,34,145,};
		
		for(int i=0;i<arr2.length;i++) {
			
			if(arr2[i] % 2 == 0) 
			{
			System.out.println(arr2[i]);
			break;
			}
			else 
			{
			System.out.println(arr2[i]+" this is an odd number");
			}	
			
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("faruk");
		a.add("ayaz");
		a.add("tester");
		a.add("selenium");
		System.out.println(a.get(3));
		
 
	}

}
