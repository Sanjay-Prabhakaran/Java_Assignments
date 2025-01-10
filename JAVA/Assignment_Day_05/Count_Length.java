package Assignment_Day_05;

import java.util.Scanner;

public class Count_Length {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String sentence=sc.nextLine();
		String[] str=sentence.split(" ");
		System.out.println("The Number of Words Present in the Sentence is: "+str.length);
	}
}
