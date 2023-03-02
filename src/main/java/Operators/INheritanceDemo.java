package Operators;

class A {
	int a;
	void test1() {
		
		 a=15;
	}
	
}

class B extends A{
	int b;
	
	void test2() {
		
System.out.println(a+b);	
}
}

class C extends B{
int d=20;


	void disppay() {
		
		System.out.println(a*b);
	}
}
public class INheritanceDemo {
	
	

	public static void main(String[] args) {

		C aview = new C();
		aview.test1();
		
		aview.b = 20;
		aview.a= 30;
		
		aview.test2();
		aview.disppay();
		
	}

}
