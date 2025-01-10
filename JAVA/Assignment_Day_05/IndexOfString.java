package Assignment_Day_05;

import java.util.Scanner;

public class IndexOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String sentence=sc.nextLine();
		System.out.println("Enter the index number to find the character:");
		int index=sc.nextInt();
		
		if(index<=sentence.length())
		{
			System.out.println("The index "+index+" is contain the character is: "+sentence.charAt(index));
		}
		else {
			System.out.println("The index number is greater than length of the sentence.");
		}
	}
}
