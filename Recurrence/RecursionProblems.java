public class Main
{   
    public static int first = -1, last = -1;
    public static void reverse(String str, int ind){
        
        if(ind==0){
            System.out.print(str.charAt(ind));
            return;
        }
        
        System.out.print(str.charAt(ind));
        reverse(str, ind-1);
    }
    
    public static void Occurence(String str, int ind, char element){
        if(ind==str.length()){
            System.out.println("First Occurence: " + first);
            System.out.println("Last Occurence: "+ last);
            return;
        }
        
        char currElement = str.charAt(ind);
        if(currElement==element){
            if(first==-1) first = ind;
            else last = ind;
        }
        
        Occurence(str, ind+1, element);
    }
    
    public static boolean checkSort(int[] arr, int ind){
        if(ind == arr.length){
            return true;
        }
        
        if(arr[ind] < arr[ind-1]) return false;
        
        return checkSort(arr, ind+1);
    }
    
	public static void main(String[] args) {
	    String str = "Hello World";
	    int len = str.length()-1;
        // reverse(str,len);

        // Occurence(str,0, 'l');
        
        int[] arr = {1,2,4,4};
        boolean ans = checkSort(arr,1);
        System.out.println(ans);
	}
}
