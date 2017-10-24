package classexamples;

import java.util.Scanner;

public class ProgrammingAssignment2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 250; i++){
			if (i % 3 == 0 && i % 5 == 0){System.out.println("FizzBuzz");}
			else if (i % 5 ==0){System.out.println("Buzz");}
			else if (i % 3 ==0){System.out.println("Fizz");}
			else {System.out.println(i);}
			/*
			Scanner in = new Scanner(System.in);
			int a = (int)(Math.random()*50+1);
			System.out.println("Input a number between 1 and 50:");
			int b = in.nextInt();
			for (int z = 0; z < 50; z++)
			if(b > a){System.out.println("YOUR NUMBER'S TOO BIG");}
			else if(b < a) {System.out.println("YOUR NUMBER'S TOO SMALL");}
			else if (b == a) {
				System.out.println("YOU ARE CORRECT");
				System.out.println("game over");
				
			}*/
		}
	}
}
	
