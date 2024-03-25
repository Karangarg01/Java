import java.util.*;

class BitManipulation{
    
    private
    int bitMask, n, pos;
    
    public void set(int n, int pos){
        this.n = n;
        this.pos = pos;
        bitMask = 1<<pos;
    }
    
    public void getBit(){
        
	    if((bitMask&n) == 0) System.out.println("Bit was zero");
	    else System.out.println("Bit was one");
    }
    
    public void setBit(){
        
        int newNum = bitMask|n;
        System.out.println(newNum);
	    
    }
    
    public void clearBit(){
        
        int newNum = (~bitMask)&n;
        System.out.println(newNum);
	    
    }
}

public class Main
{    
	public static void main(String[] args) {
	    BitManipulation obj = new BitManipulation();
	    int n = 5;
	    int pos = 2;

	    obj.set(n,pos);
	    
	    obj.setBit();
    
	    obj.clearBit();
	    
	}
}
