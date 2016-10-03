import java.util.*;		//get scanner
public class CuumAlgorithim {	//create class

	public static void main(String[]args){	//create main method
		Scanner console=new Scanner(System.in);	//initialize scanner
		
		int min=0;			//initialize variables
		int max=0;
		int totalSum=0;
		
		System.out.print("how many numbers do you have?");	//get user input on number of numbers they have
		int loops= console.nextInt();
		
		for(int i=1; i<=loops; i++){					//loop equal to how many numbers they have
			System.out.print("enter your number");
			int input=console.nextInt();
			if(i==1){							//gives min and max value of the first number
				min=input;
				max=input;
			}
			if (input<=min){					//if the next input is smaller than the current min, make that input the min
				min=input;
			}
			if (input>=max){					//if the next inpiut is greater than the current max, make that input the max
				max=input;
			}
			if (input%2==0)						//check if input is even, if it is, add to sum
			totalSum+=input;
		}
		System.out.println("max: "+ max);		//print out the min, max, and sum
		System.out.println("min: "+ min);
		System.out.println("total even sum: "+ totalSum);
	}
	
}
