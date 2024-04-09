import java.util.TreeSet;

public class Main {
    
    public static TreeSet<Integer> func(TreeSet<Integer> t, int number) {
        return new TreeSet<>(t.tailSet(number));
    }
    
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(4);
        t.add(54);
        t.add(70);

        int num = 20;

        TreeSet<Integer> ans = func(t, num);

        System.out.println("Elements greater than or equal to " + num + " are " + ans);
    }

}
