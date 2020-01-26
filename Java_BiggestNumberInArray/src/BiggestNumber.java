import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		int arraySize;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter how many numbers you want to enter");
		arraySize = sc.nextInt();
		
		int[] arr = new int[arraySize];
	
		System.out.println("Please enter your " + arraySize + " numbers in now");
		for(int i =0; i< arr.length;i++) {
			System.out.println("Number" + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("You entered the following numbers: ");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");
		}
		
		// Estimating biggest number
		for(int i =0; i<arr.length; i++) {
			if(max <arr[i]) {
				max= arr[i];
			}
		}
		System.out.println("Biggest number: " + max);
	}

}
