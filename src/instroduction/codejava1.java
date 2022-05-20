package instroduction;

public class codejava1 {

	public static void main(String[] args) {
		
		int num = 5;
		String name = "faruk";
		char letter = 'e';
		double dec = 3.13;
		float decc = (float) 12.22;
		boolean mycard = true;
		
		System.out.println(num+" this is a number");
		System.out.println(name);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(decc);
		System.out.println(mycard);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
	
		int[] arr2 = {1,2,3,4,5,46,34,145,};
		
		System.out.println(arr[2]);
		
		// for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
		String[] names = {"faruk","ayaz","tester"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String s: names) {
			System.out.println(s); 
		}

	}

}
