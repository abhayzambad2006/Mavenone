package Operators;

public class class1 {
	
	//Method1 without return
	void addition() {
		
		int x=1;
		int y=2;
		System.out.println(x+y);
				
	}
	
	
	//Method 2 with return
	
	int addition1 (){
		
		int res;
		int x=1;
		int y=2;
		res =x*y;
		
		return res;
	}
	
	
	void addtion2(int a,int b) {
		
		int res;
		
		res = a/b;
		
		System.out.println(res);
		
		
	}
	
	
	String addtion3(String name,String surname) {
		
		String test  = name+surname;
		
		return test;
		
		
	}

}
