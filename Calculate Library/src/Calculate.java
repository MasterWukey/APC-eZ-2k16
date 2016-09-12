
//methods, headers, and basic math
public class Calculate {
	public static int square(int number){				//square
		int answer;
		answer=number*number;
		return(answer);
	}
	
	public static int cube(int number){					//cube
		int answer;
		answer=number*number*number;
		return (answer);
	}
	
	public static double average(int num1, int num2){	//average
		double answer;
		answer=(num1+num2)/2;
		return(answer);
	}
	
	public static double average(int num1, int num2, int num3){//average of three numbers
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
	
	public static double discriminant(double a, double b, double c){	//discrimnant
		double answer;
		answer=(b*b)-4*a*c;
		return(answer);
	}
	
	public static String toImproperFrac(int a, int b, int c){		//improper fraction
		int d=a*b+c;
		return("the answer is:"+ d +"/"+ b);
	}
	
	public static String toMixedNum(int a, int b){		//mixed num
		int d=a/b;
		int e=a%b;
		return("the answer is:"+ d + "_"+ e +"/"+b);
	}
	
	public static String foil(int a, int b, int c, int d, String n){		//foil
		int first=a*c;
		int second=a*d+b*c;
		int third=b*d;
		return("the answer is " + first + n + "^2"+ second + n + third);
	}
	
	//methods with conditionals
	
	public static boolean isDivisibleBy(int num1, int num2){
		return(num1 % num2==0);
	}
	
	public static double absValue(double num1){
		if(num1<=0){
			return (num1*-1);
		}
		else{
			return (num1);
		}
	}
	public static int max(int num1,int num2){
		if(num1>=num2){
			return(num1);
			}
		else{
			return(num2);
			}
	}
	
	public static double max(double num1, double num2, double num3){
		if(num1>=num2){
			return Math.max(num1,num3);
		}
		else{
			return Math.max(num2, num3);
		}	
	}
	
	public static int min(int num1, int num2){
		if(num1>num2){
			return num2;
		}
		else{
			return num1;
		}
	}

	public static double round2(double num1){
		num1=num1+.05;
		double roundednum=(int)num1*100;
		return (roundednum/100);
	}
	
	public static double exponent(double base, int power){
		double answer=1;
		for(int i=1; i<=power;i++){
			answer*=base;
		}
		return(answer);
	}
		
	public static int factoryeel(int num1){
		int result=1;
		for (int i=1; i<=num1; i++){
			result=result*i;
		}
		return(result);
	}
	
	public static boolean isPrime(int num1){
		
		
		
		
		
		
		
		
		
		
		
	}
}