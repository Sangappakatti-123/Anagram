package list1;
import java.util.*;
public class Mainclass1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String str1=sc.nextLine();
	System.out.println("enter second string");
	String str2=sc.nextLine();
	System.out.println(check(str1,str2));
	
}
   public static String check(String str1,String str2) {
	   if(str1.length()!=str2.length()) {
		   return "NOT ANAGRAM";
	   }
	   else 
	   {

		   String str3=str1.toLowerCase();
		   String str4=str2.toLowerCase();
		   System.out.println(str3);
		   char[] ch1=convertarray(str3);
		   char[] ch2=convertarray(str4);
		   System.out.println(Arrays.toString(ch2));
		    
		   char[] ch3=sort(ch1);
		   char[] ch4=sort(ch2);
		   System.out.println(Arrays.toString(ch4));
		   System.out.println(Arrays.toString(ch3));
		   
		   
		   for(int i=0;i<ch3.length;i++) {
			   
				   if(ch3[i]!=ch4[i]) {
					   return "NOT ANAGRAM";
					   
				   
			   }
		   }
		   return "ANAGRAM";
		   }
   }    public static char[] convertarray(String str) {
	      char [] k=new char[str.length()];
	     for(int i=0;i<str.length();i++) {
	    	 k[i]=str.charAt(i);
	     }
	     return k;
   }  public static char[] sort(char[] arg) {
	    for(int i=0;i<=arg.length-1;i++) {
	    	for(int j=0;j<=arg.length-2;j++) {
	    		if(arg[j]>arg[j+1]) {
	    			char temp=arg[j];
	    			arg[j]=arg[j+1];
	    			arg[j+1]=temp;
	    		}
	    	}
	    }
	    return arg;
   }
   
}
