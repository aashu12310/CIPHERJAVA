package Assignment;

import java.util.Scanner;

public class Secret_Operation_in_Java {
	public static StringBuffer asia(String text) 
    {
		int s=2;
        StringBuffer result= new StringBuffer(); 
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    }
	public static void usa(String s){
        int len = s.length(); 
		int count=0;
		System.out.println();
		for(int i = 0; i < len; i++){  
	        char c= s.charAt(i); 
	        int ascii = (int) c;
	        if(i==len-1) {
	        	System.out.print(ascii);
	        }	
	        else {
	        	System.out.print(ascii+".");
	        }
	    }
    }
	public static String dubai(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n=in.nextInt();
		int n=2;
		String[] code = new String[n];
		// let's take n=2
//		for(int i=0;i<n;i++) {
//			code[i] = in.nextLine();
//		}
		code[0]="Beautiful";
		code[1]="World";
		
		int[] para=new int[n];
//		for(int i=0;i<n;i++) {
//			para[i] = in.nextInt();
//		}
		para[0]=0;
		para[1]=2;
		for(int i=0;i<n;i++) {
			if(para[i]==0) {
				System.out.println(asia(code[i]));	
			}
			else if(para[i]==1) {
				usa(code[i]);
			}
			else if(para[i]==2) {
				System.out.println(dubai(code[i]));
			}
			else {
				System.out.println("Invalid locale");
			}
		}
	}
}
