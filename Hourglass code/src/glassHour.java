
public class glassHour {
	public static void main(String[] args) {
		printBase(); //Print the first line
		topHalf(); //Print the top half
		middle();
		bottomHalf();
		printBase();

		}

		public static void topHalf(){
		for (int i=1; i <=4; i++){//print each line
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
				for (int j=5-i; j>0; j--) { 
				System.out.print("::");
				}
			System.out.println("/");
	
			}
		}
		
		public static void middle(){
			System.out.println("     ||");
		}
		
		public static void bottomHalf(){
			for (int i=1; i <=4; i++){//print each line
				for (int j=4; j>=i; j--){
					System.out.print(" ");
				}
				System.out.print("/");
					for (int j=5; j<5+i; j++) { 
					System.out.print("::");
					}
				System.out.println("\\");
		
				}
			}
		
		

		public static void printBase(){
		System.out.print("|");
		for (int i = 1; i<=10;i++){
		System.out.print("\"");
		}
		System.out.println("|");
		}
		
}
