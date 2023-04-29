
package arraylist;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("size "+number.size());
        number.add(10);
        number.add(10);
        number.add(10);
        number.add(3, 50);
        System.out.println(number);
        for(int x: number)
        {
            System.out.println(x);
        }
        System.out.println("Size "+number.size());
    }
    
}
