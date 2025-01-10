package Assignment_Day_05;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		String str = "bvrit college";
		int n = str.length();
		int count = 0;
		String newline="";
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='l')
			{
				count++;
				if(count==2)
				{
					if(str.charAt(i)>=97 && str.charAt(i)<=123)
					{
						int a=(int)str.charAt(i);
						a=a-32;
						newline+=(char)a;
					}
					else {
						newline+=str.charAt(i);
					}
				}
				else {
					newline+=str.charAt(i);
				}
			}
			else {
				newline+=str.charAt(i);
			}
		}
		System.out.println(newline);
	}

}
