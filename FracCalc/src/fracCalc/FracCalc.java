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
      
    	   int i=input.indexOf(" ");
    	   int opIndex=i;
    	   String Op1= input.substring(0, i);					//get the 1st operand	
    	   String Op2= input.substring(i+3, input.length());	//get the 2nd operand
    	   String operator= input.substring(i, i+1);			//find the operator
    	   
    	   
    	   }  
    	   
   public int[] parseOperand(String Op){    	//will take in the string, turn it into an improper fraction that can be added/multiplied
	   int whole;
	   int num;
	   int dem;
	   if(Op.indexOf("_")>=0){											//checks if there even is a whole part in the input operand
		 whole=Integer.parseInt(Op.substring(0, Op.indexOf("_")));		//gets whole part of operand
	   } 
	   else{
			 whole=0;													//if no whole part, whole is set to 0
	   }
	  if(Op.indexOf("_")>=0){
		  num=Integer.parseInt(Op.substring(Op.indexOf("_")+1, Op.indexOf("/")));	//get numerator if there is a whole num in operand
	  }
	  else{
		  num=Integer.parseInt(Op.substring(0, Op.indexOf("/")));				//gets numerator if there is no whole num in operand
	  }
	  dem=Integer.parseInt(Op.substring(Op.indexOf("/")+1, Op.length()));		//dem is always same no matter what
	  
   }  
}//end of class bracket-KEEP