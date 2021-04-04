package importantPrograms;

public class SmallestNoInArray {

	 static int arr[] = { 324,10, 45, 9909, 9808};
	 static int smallest() {
		 int mini=arr[0];
		 for (int i=1; i<arr.length; i++) {
			if(arr[i]<mini) {
				mini=arr[i];
			} 
		 } return mini;
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Smallest number in array is "+ smallest());
	}

}
