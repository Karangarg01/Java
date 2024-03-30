// Finding Second Largest Element in Array
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size of Array: ");
        
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt(); 
        
        int[] arr = new int[size]; 
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Arrays.sort(arr);
        // System.out.println("Second largest element: " + arr[size - 2]);

		int maxi = arr[0];
		for(int i=0; i<arr.length; i++){
		    if(arr[i]>maxi) maxi = arr[i];
		}
		
		int secMaxi = arr[0];
		for(int i=0; i<arr.length; i++){
		    if(arr[i]> secMaxi && arr[i]<maxi) secMaxi = arr[i];
		}
		
		System.out.println(secMaxi);
    }
}








// Count of Even and Odd Integers in an Array
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size of Array: ");
        
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt(); 
        
        int[] arr = new int[size]; 
        
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
            if(arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}



// Lenght of Array after removing duplicates
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size of Array: ");
        
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt(); 
        
        int[] arr = new int[size]; 

        int len = arr.length;
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        Arrays.sort(arr);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]) len--;
        }
        System.out.println("Updated length: " + len);
    }
}
