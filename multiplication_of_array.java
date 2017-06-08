import java.util.Scanner;

public class multiplyingarray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]= new int[3][3];
		int arr1[][]= new int[3][3];
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("enter the value into arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
				
				}
			
		}
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println("enter the value into arr1["+i+"]["+j+"]");
				arr1[i][i]=sc.nextInt();
				}
			}
		int mult[][]=new int[3][3];
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				mult[i][j]+=arr[i][j]*arr1[i][j];
				
			}
			}
		System.out.println("result is :-");
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mult[i][j]+"\t");
			}
			System.out.println("");
			}
		

}
}
