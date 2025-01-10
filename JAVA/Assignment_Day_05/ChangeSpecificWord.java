package Assignment_Day_05;

public class ChangeSpecificWord {

	public static void main(String[] args) {
		String str = "b.v.raju college";
		String input = "raju";
		String res = str.replaceAll(input, input.toUpperCase());
		System.out.println(res);

	}

}
