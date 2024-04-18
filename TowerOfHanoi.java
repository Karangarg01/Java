public class Main
{
    // Time Complexity = O(2^n)
    public static void towerOfHanoi(int n, String src, String helper, String dst){
        if(n==1){
        System.out.println("Transfer disk " + n + " from " + src + " to " + dst);
            return;
        }
        
        towerOfHanoi(n-1, src, dst, helper);
        System.out.println("Transfer disk " + n + " from " + src +" to " + dst);
        towerOfHanoi(n-1, helper, src, dst);
    }
	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n, "S", "H", "D");
	}
}
