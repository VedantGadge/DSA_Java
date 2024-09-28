import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); 

        //Adding elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(1);

        //Size
        System.out.println("Size of the set is: " + set.size());

        //Search
        if(set.contains(1)) System.out.println("The set contains 1");
        if(!set.contains(10)) System.out.println("The set doesnt contain 10");

        //Delete
        set.remove(1);
        if(!set.contains(1)) System.out.println("1 is no longer in the set");

        //Print all elements
        System.out.println(set);

        //Iteration - HashSEt doesnt have an order (unordered dataset)
        Iterator it = set.iterator();
        
        while(it.hasNext()) System.out.print(it.next() + ", "); //.hasNext() checks if there is an element after the current iterator
                                                                //.next() returns the next element

        System.out.println();

        //isEmpty
        if(!set.isEmpty()) System.out.println("set is not empty");





    }
}
