
public class Main
{
    
    public static void fib(int num1, int num2, int n){
        
        if(n<=0) return;

        int c = num1+num2;
        System.out.print(c + " ");
         fib(num2,c, n-1);
    }
    
    // Calculate power with stack height = n
    // public static int calPower(int x, int n){
        
    //     if(n==1) return x;          // when power becomes 1 return x
        
    //     if(x==0) return 0;          
        
    //     int xPowm1 = calPower(x, n-1);
    //     int xPow = x*xPowm1;
        
    //     return xPow;
    // }
    
    
    // Calculate power with stack height = logn
    public static int calPower(int x, int n){
        
        if(n==1) return x;          // when power becomes 1 return x
        
        if(x==0) return 0;          
        
        if(n%2==0) return calPower(x,n/2)*calPower(x,n/2);
        else return calPower(x,n/2)*calPower(x,n/2)*x;
        
    }
	public  static void main(String[] args) {
// 		int n1 = 0, n2 = 1;
// 		int n = 7;
		
// 		System.out.print(n1 + " ");
// 		System.out.print(n2 + " ");		
// 		fib(n1, n2, n-2);

        int x = 2;
        int n = 9;
        int ans = calPower(x,n);
        System.out.println(ans);
		
	}
}

