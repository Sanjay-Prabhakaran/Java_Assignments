package Assignment_Day_05;

import java.util.Scanner;

public class Match_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String1: ");
		String sentence1=sc.nextLine();
		System.out.println("Enter your String2: ");
		String sentence2=sc.nextLine();
		System.out.println("Enter your String3: ");
		String sentence3=sc.nextLine();
		System.out.println("Enter the Word to find it:");
		String sentence=sc.nextLine();
		if(sentence.matches(sentence1) || sentence.matches(sentence2) || sentence.matches(sentence3))
		{
			System.out.println("The word "+sentence+" is found");
		}
		else {
			System.out.println("The word "+sentence+" is not found");

		}


	}

}
