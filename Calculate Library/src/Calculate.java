
//methods, headers, and basic math
public class Calculate {
	public static int square(int number){				//square of a integer
		int answer;
		answer=number*number;
		return(answer);
	}
	
	public static int cube(int number){					//cube of a integer
		int answer;
		answer=number*number*number;
		return (answer);
	}
	
	public static double average(int num1, int num2){	//average of two integers
		double answer;
		answer=(num1+num2)/2;
		return(answer);
	}
	
	public static double average(int num1, int num2, int num3){//average of three integers
		double answer;
		answer=(num1+num2+num3)/3;
		return(answer);
	}
	
	public static double toDegrees(double radians){			//convert radian input to degrees
		double answer;
		answer=radians*(180/3.14159);
		return(answer);
	}
	
	public static double toRadians(double degrees){			//convert degree input to radians
		double answer;
		answer=degrees*(3.14159/180);
		return(answer);
	}
	
	public static double discriminant(double a, double b, double c){	//discriminant, b squared  minus 4 a c
		double answer;
		answer=(b*b)-4*a*c;
		return(answer);
	}
	
	public static String toImproperFrac(int a, int b, int c){		//improper fraction, the whole number by denominator and add to numerator of fraction, all over denom.
		int d=a*b+c;
		return("the answer is:"+ d +"/"+ b);
	}
	
	public static String toMixedNum(int a, int b){		//mixed num, just use modulus to get the fraction part
		int d=a/b;
		int e=a%b;
		return("the answer is:"+ d + "_"+ e +"/"+b);
	}
	
	public static String foil(int a, int b, int c, int d, String n){		//foil, accepts three integers and a string
		int first=a*c;
		int second=a*d+b*c;
		int third=b*d;
		return("the answer is " + first + n + "^2"+ second + n + third);
	}
	
	//methods with conditionals
	
	public static boolean isDivisibleBy(int num1, int num2){
	if(num1<=0||num2<=0) throw new IllegalArgumentException("enter a positive number");
		return(num1 % num2==0);							// makes sure the modulus is zero, if not, than its not evenly divisible
	}
	
	public static double absValue(double num1){
		if(num1<=0){
			return (num1*-1);				//checks if it is smaller than zero. if it is, than multiply by -1
		}
		else{
			return (num1);
		}
	}
	public static double max(double num1,double num2){  // just uses an if statement to determine number is greater
		if(num1>=num2){
			return(num1);
			}
		else{
			return(num2);
			}
	}
	
	public static double max(double num1, double num2, double num3){
		if(num1>=num2){									//basic if statment to determine which is greater of the three
			return Calculate.max(num1,num3);			// by separating this process into parts
		}
		else{
			return Calculate.max(num2, num3);
		}	
	}
	
	public static int min(int num1, int num2){
		if(num1>num2){										//basic if statement to determine which is smaller
			return num2;
		}
		else{
			return num1;
		}
	}

	public static double round2(double num1){
		num1=(num1*100)+.5;										//rounds it up 
		double roundednum=(int)num1;							// casting into an integer
		return (roundednum/100);
	}
	
	public static double exponent(double base, double power){
	
		double answer=1;
		for(int i=1; i<=power;i++){
			answer*=base;										// multiplies by the old answer a number of times equal to the power that was input
		}
		if(base<0) throw new IllegalArgumentException("enter a positive base");
		return(answer);
	}
		
	public static int factorial(int num1){							//factorial
		
		int result=1;											
		for (int i=1; i<=num1; i++){							//keeps multiplying to get the result until it reaches the end of the loop, which results in factorial
			result=result*i;
		}
		if(num1<=0) throw new IllegalArgumentException("enter a positive number");
		return(result);
		
	}
	
	public static boolean isPrime(int num1){				// checks if a number is prime
		boolean check;
		for (int i=num1-1; i>1; i--){
			check=Calculate.isDivisibleBy(num1, i);			//uses isDivisible by multiple times
					if (check==true){
						return(false);
					}
			}
		return(true);
		}
		
	public static int gcf(int num1, int num2){				// gives the greatest common factor
		while(num2!=0){
			int num3=num1;
			num1=num2;
			num2=num2%num3;
		}
		return(num1);
	}
	
	public static double sqrt(double input){					//this one took a while like a real real while
		
		for(double k=0.1; k<=input; k+=.1 ){					//multiply by increasing values until you reach the number
			double multiply=k*k;
			if (Calculate.absValue(multiply-input)<=.1){
				return Calculate.round2(k);						//then return value that you last multiplied
			}
			if(input<=0) throw new IllegalArgumentException("enter a postive number");
		}
		return input;
	}
	
	public static String quadForm(double num1, double num2, double num3){
		double quadraticplus=(num2*-1)+Calculate.sqrt(Calculate.discriminant(num1,  num2,  num3))/(num1*2);
		double quadraticminus=(num2*-1)-Calculate.sqrt(Calculate.discriminant(num1,  num2,  num3))/(num1*2);
		if (Calculate.discriminant(num1, num2, num3)<0){				// check for real roots
			return("no real roots");
		}
		if (Calculate.discriminant(num1, num2, num3)==0){				//check for single root
			return("one real root: " + Calculate.round2(quadraticplus));
		}
		else
			return("positive root: " + Calculate.round2(quadraticplus)+ "/n" +  "negative root: " + Calculate.round2(quadraticminus));	// else, do two real roots
				
	}
	
}						//final bracket to close class 
