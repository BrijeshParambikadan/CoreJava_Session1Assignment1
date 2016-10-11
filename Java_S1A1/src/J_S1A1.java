import java.util.Scanner;

public class J_S1A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bb=new Scanner(System.in);
		
		
		System.out.print("Enter value for a :");
		int a=bb.nextInt();
		System.out.print("Enter value for b :");
		int b=bb.nextInt();
		
		while(b-->0){
			a++;
		}
		
		bb.close();
		System.out.print("Sum of a & b is "+a);
	}

}
