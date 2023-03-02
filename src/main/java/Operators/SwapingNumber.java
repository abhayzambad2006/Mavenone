package Operators;

public class SwapingNumber {

	public static void main(String[] args) {

		int a=20;
		int b=30;
		int t =0;
		
		//Print before Swaping
		System.out.println("Befor Swaping: "+a+" "+b);
		
		//Using 3td variable
		
//		a=t;
//		a=b;
//		b=a;
		
		//Using +/_ operator:: Without 3rd variable
		
		/*
		 * a= a+b; b=a-b; a=a-b;
		 */
		
		//Using //* operator:: Without 3rd variable
		
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		//Using Bitwise
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		//Using Single statment
		
		b=a+b-(a=b);// first operation is "a=b" so value of b is assign to a that is 20; then "b=a+b" mean 50 and now minus value of a that is 20
		
		System.out.println("After Swaping: "+a+" "+b);
	}

}
