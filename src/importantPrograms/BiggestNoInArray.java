package importantPrograms;


	public class BiggestNoInArray {
		 static int arr[] = {10, 324, 45, 9909, 9808};
//		 int intArray[];    //declaring array
		
		  // Method to find maximum in arr[]
			    public static int largest() {
			    	int max=arr[0];
			    	
			    	for (int i=1 ; i<arr.length; i++)
			    	{
			    		if (arr[i]>max) {
			    		max=arr[i];	
			    		}
			    	}
			    	
			    return max;
			     }
			     public static void main(String[] args) 
			     {
			    	
			       System.out.println("Largest in given array is " + largest());
			        }

	}


