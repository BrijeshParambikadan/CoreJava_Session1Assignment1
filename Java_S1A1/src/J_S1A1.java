import java.util.Scanner;

public class J_S1A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner bb
		Scanner bb=new Scanner(System.in);
		
		System.out.print("Enter value for a :");
		int a=bb.nextInt();
		
		System.out.print("Enter value for b :");
		int b=bb.nextInt();
		
		
		int diff=0;
		int small=0;
		int big=0;
		
		if (a>b){
				big=a;
				small=b;
				diff=a-b;
				}
		else {
			big=b;
			small=a;
			diff=b-a;
			}
		
		if (diff<big){
			while(small-->0){
			big++;
				}	
		}
	else 	{
			while(small++<0){
			big--;
			}}
		// close scanner
		bb.close();
		System.out.print("Sum of a & b is "+big);
	}

}
