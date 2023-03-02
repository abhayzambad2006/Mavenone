package Operators;

public class MaxNumInArray {

    public void findTwoMaxNumbers(int[] array){
        int maxOne = 0;
        int maxTwo = 0;
        for(int num : array){
            if(maxOne < num){
                maxTwo = maxOne;
                maxOne =num;
            } else if(maxTwo < num){
                maxTwo = num;
            }
        }
        System.out.println("First Max Number: " + maxOne);
        System.out.println("Second Max Number: " + maxTwo);
        System.out.println(maxOne+" "+maxTwo);
    }

    public static void main(String a[]){
        int num[] = {6,9,80,56,90,1};
        MaxNumInArray maxNumber = new MaxNumInArray();
        maxNumber.findTwoMaxNumbers(num);
    }
}