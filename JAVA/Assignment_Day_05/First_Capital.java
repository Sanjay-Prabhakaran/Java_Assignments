package Assignment_Day_05;

import java.util.Scanner;

public class First_Capital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String sentence="sanjay the mass";
		String new_line="";
		String[] str=sentence.split("");
		for(int i=0;i<sentence.length();i++)
		{
			
			if(i==0)
			{
				new_line+=str[i].toUpperCase();
				
			}
			else if(str[i].equals(" "))
			{
				new_line+=str[i];
				new_line+=str[++i].toUpperCase();
			}
			else
			{
				new_line+=str[i];
			}
		}
		System.out.println(new_line);

	}

}
