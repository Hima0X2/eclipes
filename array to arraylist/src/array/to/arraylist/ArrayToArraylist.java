
package array.to.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

    public static void main(String[] args) {
       String[] my_array=new String[]{"Python","Java","C#","C++"};
      ArrayList<String> list= new ArrayList<>(Arrays.asList(my_array));
        System.out.println(list);
    }
}
