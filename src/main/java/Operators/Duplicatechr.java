package Operators;

public class Duplicatechr {
	   public static void main(String argu[]) {
	      String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	      //Reverse String
	      System.out.println("");
	      String s = "abhay";
	      for(int i=s.length();i>0;i--) {

	    System.out.print(s.charAt(i-1));	
	    
	    
	   }
	      // Reverse String using Buffer 
	      System.out.println("");
	      StringBuffer sb=new StringBuffer(s);
		    System.out.println("Reverse charecter is: "+sb.reverse());
		    //==========================================
		    
		    //Reverse Using array
		    String rev ="";
		    char d[] = s.toCharArray();
		    int len = s.length();
		    
		    for(int i=len -1;i>=0;i--) {
		    	
		    	rev = rev+s.charAt(i);
		    	
		    }
		    System.out.println(" New reverse of Array: "+rev);
	}
	   
}
