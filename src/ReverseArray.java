import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int cnt, j;
		System.out.println("Please enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		int myArr[] = new int[cnt];
		System.out.println("Please enter the values for the array: ");
		for (int i=0; i<cnt; i++){
			j = i+1;
			System.out.println("Value " + j + ": ");
			myArr[i] = sc.nextInt();
		}//for ends
		System.out.println();
		System.out.println("The array is: ");
		for (int i = 0; i<cnt; i++) {
			System.out.println(myArr[i]);
		}
		//Reverse
		System.out.println();
		System.out.println("Reverse of array is: ");
		for (int i=myArr.length-1; i>=0; i--){
			System.out.println(myArr[i]);
		}
			
	}

}
