package Operators;

public class SwitchCases {

	public static void main(String[] args) {

		int weekDay = 8;
		switch(weekDay)
		{
		
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("TuesDay");break;
		case 3:System.out.println("Wednsday");break;
		case 4:System.out.println("Thusday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Satday");break;
		case 7:System.out.println("Sunday"); break;
		default:System.out.println("Out of range:");
		
		}
		
		for(int i=1;i<=10;i++) {
			
			if(i!=5&&i!=3&&i!=9) {
				
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
