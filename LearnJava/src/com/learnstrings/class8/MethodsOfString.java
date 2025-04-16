package com.learnstrings.class8;

public class MethodsOfString {

	public static void main(String[] args) {
		String name = "Welcome";
		
		// length() 
		System.out.println("Length of the given String is " + name.length());
		
		//Concat 
		System.out.println(name.concat("to Java"));
		
		//trim
		String s = "    Hello      ";
		System.out.println(s);
		System.out.println("Length before trimmed is : "+ s.length());
		System.out.println(s.trim());
		System.out.println("Length after trimmed is : "+ s.trim().length());
		
		//charAt()
		
		String n = "Madhu Kumar A";
		System.out.println(n.charAt(4));
		
	//contains 
		
		
		String demo = "iam from india";
		System.out.println(demo.contains("iam res"));
		
		//equals 
		
		
		
		
		String actaul = "hello";
		String temp = "hellosd";
		System.out.println(actaul.equals(temp));
		
		
		//Substring
		
		String m = "madhukumar a";
		System.out.println(m.toUpperCase());
		System.out.println(m.substring(1,  5));
		
		
		String s1 = "dere2143252R&^%&^#$^";
		String s2 = "my name is madhu from bangalore which is located in karnaraka";
		String res = s1.replace("2", "0");
		String res2 = s2.replace("is","at");
		System.out.println(res);
		System.out.println(res2);
		
		
		
		String w = "welcome";
		char[] c = w.toCharArray();
		
		
//		String[] c = w.split("");
		String rev = "";
		
		for (int i = c.length-1; i >=0; i--) {
			rev += c[i];
			
		}
//		for (int i = c.length-1; i >=0; i--) {
//			rev = rev+c[i];
//			
//		}
		System.out.println(rev);

//		for (String string : c) {
//			System.out.println(string);
//			
//		}
		
		
		

	}

}
