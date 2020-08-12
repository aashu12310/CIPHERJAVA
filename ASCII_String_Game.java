package Assignment;

public class ASCII_String_Game {
    public static int getASCII(String s){
        int len = s.length(); 
		int count=0;
		for(int i = 0; i < len; i++){  
	        char c= s.charAt(i); 
	        int ascii = (int) c; 
	        count+=ascii;
	    }
        return count;
    }
    public static int X(int a,int b) {
    	return a+b;
    }
    public static String X(String a,String b) {
    	return a+b;
    }
    public static void main(String args[]) {
        String a="556";
        String b="world";
        int n=3;
        if(n==1) {
        	int b1=getASCII(a);
            int b2=getASCII(b);
            System.out.println(X(b1,b2));
        }
        else if(n==2) {
        	System.out.println(X(a,b));
        }
        else if(n==3) {
        	int a1=getASCII(a);
        	int a2=getASCII(b);
        	System.out.println(X(a1,a2));
        }

    }
}