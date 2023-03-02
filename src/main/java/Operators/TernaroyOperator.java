package Operators;


/*Operator
operator is a symbol which will perform operation.


Types of operators
-----------------------
1) Arithmetic operators   + - * / % 
2) Relational/comparison operators  >  >=  <  <=  !=  == 
3) Logical operators   &&   ||  !
4) Increment & Decrement operators  ++  --
5) Assignment   =   +=   -=   *= /=  %=
6) conditional/ternary operator  ?: 


1) Unary operators      ++,  --  +=   -=   *= /=  %=  !     =
2) Binary operators    + - * / %   >  >=  <  <=  !=  ==  &&   ||   
3) Ternary  operator      ?:


Logical operators
---------------
x				y			x && y			x || y			!x			!y
-----------------------------------------------
TRUE			TRUE		TRUE			TRUE			FALSE			FALSE
TRUE			FALSE		FALSE			TRUE							TRUE
FALSE			TRUE		FALSE			TRUE			TRUE	
FALSE			FALSE		FALSE			FALSE	*/

public class TernaroyOperator {

	public static void main(String[] args) {

		int x=10,k;
		int y=200;
		//ex:1
		
		k=x>y?x:y;
		System.out.println(k);
		
		//ex:2
		
		x=1000;
		y=500;
		k=(1==1)?1000:500;
		System.out.println(k);
		
		//ex 3
		
		int age =21;
		
		String res = (age>=21)?"Eligiable for voting":"Not Eligible for voting";
		
			
		System.out.println(res)	;
		//Swaping number without 3rd variable
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);
		
		
		
				
				
		
		
	}

}
