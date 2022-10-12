import java.util.*;
public class Majority_Element {

	public static void main(String[] args) {
		  Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
		  int max = 0;
			int arr[] = {1,2,3,3,3};
			int n = arr.length;
		  for (int i = 0; i < n; i++)
	        {
	            if (mp.containsKey(arr[i])) 
	            {
	                mp.put(arr[i], mp.get(arr[i]) + 1);
	            } 
	            else
	            {
	                mp.put(arr[i], 1);
	            }
	        }
		  for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	        {
			  	if(max<entry.getValue()){
			  		max=entry.getValue();
			  	}
	        }
	}
}
