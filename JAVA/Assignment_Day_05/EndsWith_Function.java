package Assignment_Day_05;

import java.util.Scanner;

public class EndsWith_Function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String sentence=sc.nextLine();
		System.out.println("Enter your String to find the its get finished by above string: ");
		String sentence1=sc.nextLine();
		if(sentence.endsWith(sentence1))
		{
			System.out.println("Yes, The string "+sentence+" is ends with "+sentence1);
		}
		else {
			System.out.println("No, The string "+sentence+" is not ends with "+sentence1);

		}
	}

}
