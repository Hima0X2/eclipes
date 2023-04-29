
package array.list.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {
       ArrayList<Integer> number = new ArrayList<>();
       number.add(20);
       number.add(10);
       number.add(30);
       number.add(45);
       number.add(100);
        System.out.println("Before sorting : "+number);
       Collections.sort(number);
     System.out.println("After sorting ascending : "+number);  
     Collections.sort(number,Collections.reverseOrder());
      System.out.println("After sorting descending : "+number);  
    }
    
}
