package Parallel;

public class pract {

	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			// System.out.println(i);
			fact = fact * i;
			// System.out.println(fact);
		}
		System.out.println(fact + "==========================");

		int num1 = 1234567, rev = 0, r, a;
		while (num1 > 0) {
			r = num1 % 10;
			rev = rev * 10 + r;
			num1 = num1 / 10;
		}
		System.out.println(rev);

	

	   /*String name = "Sachin is my best friend";
	   char[] rname=name.toCharArray();
	   for(int i =rname.length-1;i>=0;i--){
		   System.out.print(rname[i]);
	   }*/
	   System.out.println("======================");
	   
	   String s="Sachin";
	   String rev1="";
		
		for(int i=s.length()-1;i<=0;i--){
			rev1=rev1+s.charAt(i);
			
		}System.out.println(rev1);
	   
}
}