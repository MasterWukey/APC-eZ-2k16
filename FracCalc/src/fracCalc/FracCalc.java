package fracCalc;
import java.util.*;

public class FracCalc {

   /* public static void main(String[] args) 		//original checkpoint ONE work
    {
        Scanner console= new Scanner(System.in);
        System.out.println("enter expression");
        String expression= console.nextLine();
    	System.out.println(produceAnswer(expression));

    }
    
    public static String produceAnswer(String input)
    { 
       for(int i=0; i<input.length(); i++){
    	   if(i==input.indexOf(" ")){
    	   int opIndex=i;
    	   String Op1= input.substring(0, i);
    	   String Op2= input.substring(i+3, input.length());
    	   String operator= input.substring(i, i+1);
    	   return Op2;
    	   }  
    	   
       }
	return null;
    
    }						//END of checkpoint ONE code
  */  
	public static void main(String[] args) 		//checkpoint TWO code
    {
        Scanner console= new Scanner(System.in);
        System.out.println("enter expression");
        String expression= console.nextLine();
        while (expression.indexOf("quit")<0){
    	System.out.println(produceAnswer(expression));
        }
    }
    
   
    public static String produceAnswer(String input)
    { 
       for(int i=0; i<input.length(); i++){
    	   if(i==input.indexOf(" ")){
    	   int opIndex=i;
    	   String Op1= input.substring(0, i);
    	   String Op2= input.substring(i+3, input.length());
    	   String operator= input.substring(i, i+1);
    	   return Op2;
    	   }  
    	   
       }
	return null;
    
    }
    
}//end of class bracket-KEEP