abstract class Animal{
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal{
    void eat(){
        System.out.println("Lion is eating meat");
    }
    
    void sleep(){
        System.out.println("Lion is sleeping");
        
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger is eating meat");
    }
    
    void sleep(){
        System.out.println("Tiger is sleeping");
        
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating grass");
    }
    
    void sleep(){
        System.out.println("Deer is sleeping ");
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Lion obj = new Lion();
		Tiger obj2 = new Tiger();
		Deer obj3 = new Deer();
		
		obj.eat();
		obj.sleep();
		
		
		obj2.eat();
		obj2.sleep();
		
        obj3.eat();
		obj3.sleep();
	}
}
