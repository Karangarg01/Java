@FunctionalInterface

interface A{
    int add(int i, int j);
}

interface checkEven{
    void check(int num);
}

public class Main {
    public static void main(String[] args) {
        
        // Method 1
        // A obj = new A(){
        //    public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
        
        
        
        // Method 2
        // A obj = (int i, int j) -> {return i+j;};
        
        
        
        // Method 3
        A obj = (i, j) -> i+j;
        
        System.out.println(obj.add(2, 4));
        
        
        
        
        // checkEven obj = (num) -> {
        //     if (num % 2 == 0)
        //         System.out.println("Number is even");
        //     else
        //         System.out.println("Number is odd");
        // };

        // obj.check(10);
    
    }
}
