
public class LotsOfCopies {
	public static void main (String[]args){
		int num=7;
		String strMain="APCS";
		int [] arrMain={1,2,3,4,5};
		
	}
	public static void changeMe (int x, String str, int[]arr){
		x=8;
		str="it works!";
		for(int i=0;i<arr.length;i++){
			arr[i]=i+3;
		}
	}
}