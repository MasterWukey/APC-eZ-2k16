
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
	
	public static double average(int num1, int num2, int num3){
		double answer;
		answer=(num1+num2+num3)/3;
		return(answer);
	}
	
	public static double toDegrees(double radians){
		double answer;
		answer=radians*(180/3.14159);
		return(answer);
	}
	
	public static double toRadians(double degrees){
		double answer;
		answer=degrees*(3.14159/180);
		return(answer);
	}
	
	public static double discriminant(double a, double b, double c){
		double answer;
		answer=(b*b)-4*a*c;
		return(answer);
	}
	
	public static String toImproperFrac(int a, int b, int c){
		int d=a*b+c;
		return("the answer is:"+ d +"/"+ b);
	}
	
	public static String toMixedNum(int a, int b){
		int d=a/b;
		int e=a%b;
		return("the answer is:"+ d + "_"+ e +"/"+b);
	}
	
	public static String foil(int a, int b, int c, int d, String n){
		
	}
	
		

}