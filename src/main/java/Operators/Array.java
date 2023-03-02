package Operators;

public class Array {
	
public void arrNumber(int []array) {
	
	//find first two largest number from array
	int MaxNumone =0;
	int maxNumtwo =0;
	
	for(int num :array) {
		if(MaxNumone<num) {
			
			MaxNumone = maxNumtwo;
			maxNumtwo=num;
		}}
		System.out.println(MaxNumone+" "+maxNumtwo);
	
	
}	

	public static void main(String[] args) {

int num[]= {1,5,90,43,45,3};

Array number= new Array();

number.arrNumber(num);

	}

}
