
public class Main
{
    public static void merge(int[] arr, int s, int mid, int e){
        
        int[] newArr = new int[e-s+1];
        
        int i=s;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                newArr[k++] = arr[i++];
            }else{
                newArr[k++] = arr[j++];
            }
        }
        
        while(i<=mid) newArr[k++] = arr[i++];
        
        while(j<=e) newArr[k++] = arr[j++];
        
        k = s;
        for(int ind = 0; ind<newArr.length;ind++){
            arr[k++] = newArr[ind];
        }
    }
    public static void mergeSort(int[] arr,int s, int e){
        
        if(s>=e) return;
        
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        
        merge(arr,s,mid,e);
        
    }
	public static void main(String[] args) {
		
		int arr[] = {6,3,91,32,43,11};
		
		int s=0, e=arr.length;
		mergeSort(arr,s,e-1);
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
		}
	}
}
