public class Main
{
	public static void main(String[] args) {
// 		for(int i=0;i<5;i++){
// 		    for(int j=0;j<5;j++){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
	
	
		for(int i=0;i<5;i++){
		    for(int j=i;j<5;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
		for(int i=1;i<=5;i++){
		    for(int j=0;j<i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
        int rows;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        
        
        // ButterFly Pattern
        // for(int i=1;i<=rows;i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            
        //     int space = 2*(rows-i);
        //     for(int k=1; k<=space;k++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }System.out.println();    
        // }
        
        // for(int i=rows; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
            
        //     int space = 2*(rows-i);
        //     for(int k=1; k<=space;k++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }System.out.println();    
        // }
        


        // Rhomboid Pattern
        // for(int i=1;i<=rows;i++){
        //     int spaces = rows-i;
        //     for(int j=1; j<=spaces;j++){
                
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=rows;j++){
                
        //         System.out.print("*");
        //     }System.out.println();
            
            
            
 
 
        //Number Pyramid
        // for(int i=1;i<=rows;i++){
            
        //     for(int j=1; j<=rows-i;j++){
                
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i;j++){
                
        //         System.out.print(i + " ");
        //     }System.out.println();           
            
            
        // }
        
  
        for(int i=1;i<=rows;i++){
            
            for(int j=1; j<=rows-i;j++){
                
                System.out.print(" ");
            }
            
            int num = i; 
            
            for(int j=1; j<=i;j++){
                
                System.out.print(num + " ");
                num+=j;
            }System.out.println();           
            
            
        }   
          
    }
}

