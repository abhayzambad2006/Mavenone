package Operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.github.dockerjava.core.dockerfile.Dockerfile.ScannedResult;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test {
	static int count = 0;

	public static int countdigit(int n) {

		while (n != 0) {

			n = n / 10;
			++count;
		}
		return count;

	}

	public static void main(String[] args) {

		int a = 1234;
		int b = 0, c = 0;

		/*
		 * while(a!=0) { a=a/10; b++; } System.out.println("count of digit "+b);
		 */
		while (a != 0) {

			c = a % 10;

			b = b * 10 + c;
			a /= 10;
		}

		System.out.println(b);
		//=============================================================
		//Find Total Number of Digit

		int n = 1322;
		System.out.println("Total number of digit:" + countdigit(n));

		// Join 3 different string to one using concat
		String name1 = "Abhay";
		String name2 = "Priti";
		String name3 = "Zambad";

		System.out.println(name1.concat(name2).concat(name3));
//========================================================================
		// count the number of vowels in string

		String test = "publicissapient";

		System.out.println(test.length());
		int y = 0;
		for (int i = 0; i < test.length(); i++) {

			if (test.charAt(i) == 'a' || test.charAt(i) == 'e' || test.charAt(i) == 'i' || test.charAt(i) == 'o'
					|| test.charAt(i) == 'u') {

				y++;
			}

		}
		System.out.println("Total Number of vowels: " + y);
		// ===============================================================

		// Write program to remove duplicate from arraylist. The first line contains an
		// integer,n , denoting the size of the array list.The second line contains
		// space-separated integers representing the array's elements.(input format).

		// create an arraylist from the array
		// using asList() method of the Arrays class
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
		System.out.println("ArrayList with duplicate elements: " + numbers);

		// convert the arraylist into a set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		// delete al elements of arraylist
		numbers.clear();

		// add element from set to arraylist
		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
		
		//=======================================================================================
		
		//
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
int num = sc.nextInt();

System.out.println("Please enter frequancy: ");
		
int fre = sc.nextInt();

	}

}
