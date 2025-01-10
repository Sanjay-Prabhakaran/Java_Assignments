package Assignment_Day_05;

import java.util.Scanner;

public class Capital_Letter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String sentence=sc.nextLine();
		System.out.println("The Capital Letterin the string are: ");
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)>=65 && sentence.charAt(i)<=91)
			{
				System.out.println(sentence.charAt(i));
			}
		}
	}

}
