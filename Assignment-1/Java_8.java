package Assignment;


class raiseException extends Exception{
    public String getMessage() {
        return "Strings not allowed";
    }

}
class CheckClass{
    public <T> void CheckFunction(T a){
    	try{
    		if(a instanceof String){
    			throw new raiseException();
    		}
    		System.out.println(a.getClass().getName() +  " = " + a);
    	}
    	catch(raiseException e){
    		System.out.println(e.getMessage());
    	}
    }
}

public class Java_8{
    public static void main(String[] args) {
    	CheckClass generic = new CheckClass();
        generic.CheckFunction("String");
        generic.CheckFunction(10);

    }
}