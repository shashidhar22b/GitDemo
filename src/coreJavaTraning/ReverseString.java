package coreJavaTraning;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String t = "";
		int strlen = s.length();
		
		for(int i=strlen-1;i>=0;i--)
		{
			t = t + s.charAt(i);
		}

		System.out.println(t);
		
		if(s==t)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
	}

}
