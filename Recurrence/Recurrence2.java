import java.util.*;

public class Main
{
    public static boolean[] map = new boolean[26];
    public static String[] keypad = {".", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tu", "vw", "xyz"};
    
    public static void printCombination(String input, int index, String combination){
        
        if(index==input.length()){
            System.out.println(combination);
            return;
        }
        
        char curr = input.charAt(index);
        
        String mapping = keypad[curr-'0'];
        
        for(int i=0; i<mapping.length(); i++){
            printCombination(input, index+1, combination+mapping.charAt(i));
        }
        
    }
    
    public static void removeDup(String inp, int ind, String ans){
        
        if(ind == inp.length()){
            System.out.println(ans);
            return;
        }
        
        char curr = inp.charAt(ind);
        
        if(map[curr-'a']){
            removeDup(inp,ind+1,ans);
        }else{
            map[curr-'a'] = true;
            ans+=curr;
            removeDup(inp,ind+1,ans);
        }
    }
    
    public static void subSequence(String input, int index, String newString, HashSet<String> set){
        
        if(index==input.length()){
            if(set.contains(newString)){
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        
        char curr = input.charAt(index);
        
        // Take current char 
        subSequence(input,index+1,newString+curr, set);
        
        // Do not take current char
        subSequence(input,index+1,newString, set);
    }
    
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String str = "aaa";
	    HashSet<String> set = new HashSet<>();
	   // subSequence(str,0,"", set);
	   
	   System.out.println("Enter key of keypad: ");
	   String key = sc.nextLine();
	   
	   printCombination(key,0,"");
	   
	}
}
