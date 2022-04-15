package package1;

import java.util.Arrays;

public class youtubeQuestions
{
	public static void main(String[] args) 
{	
		
	// array equals or not
		
//		int a[] = {};
//		int b[] = {};
//		int c[] = {4};
//		
//		System.out.println(Arrays.equals(a, b));

	// Split String
		String s = "Am ol Am bH oRF e";
	
		String[] y = s.split("\\s");
		
		for (String ok:y)
		{
			System.out.println(ok);
		}
	// Count UpperCase and LowerCase
	String count = "";
	String uppper = "";
	
	for (int i = 0; i<s.length(); i++)
	{ char yuy = s.charAt(i);
		if ((yuy >= 65) && (yuy <= 90))
		{
			count = count + yuy;
		}
		
		else if ((yuy >=97)&&(yuy <123))
		{
			uppper = uppper + yuy;
		}
	}
	System.out.println(count);
	System.out.println(uppper);
	
//ternary operator --------->>>>>>>>------------->>>>>>>>>>>>>>>>
	int e =105;
	int r = 20;
	int w = 360;
	
	int cl = (e>r) ? (e>w ? e:w) : (r>w ? r:w);
	System.out.println(cl);
	
	
	int yu = e>r ? e:r;
	System.out.println(yu);
	
	
}		
}



