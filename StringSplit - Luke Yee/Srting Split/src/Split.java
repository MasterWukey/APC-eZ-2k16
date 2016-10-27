
public class Split 
{

	public static void main(String[] args) 
	{
		phrase();
		phrase2();
		String []n= "I really like really red apples".split("really");
		System.out.println(arrays.toString(n));	
		}
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
	
	public static void phrase(){													
		String s= "applespineapplesbreadlettucetomatoesbaconemayohambreadcheese";			
		int bread1=s.indexOf("bread")+5;
		int bread2=s.indexOf("ham")+3;
		String[] sandwich=s.split("bread");
		System.out.println(Arrays.toString(sandwich));
	}
	
	public static void phrase2(){
		String p= "apples pineapples bread lettuce tomato bacon mayo ham bread cheese";
		int bread1=p.indexOf("bread")+6;
		int bread2=p.indexOf("cheese");
		String m= p.substring(bread1, bread2);
		String[] sandwich=m.split(" ");
		System.out.println(Arrays.toString(sandwich));
	}	
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

}
