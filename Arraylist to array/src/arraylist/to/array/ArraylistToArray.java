
package arraylist.to.array;

import java.util.ArrayList;

public class ArraylistToArray {

    public static void main(String[] args) {
       ArrayList<String> a= new ArrayList<>();
       a.add("Python");
       a.add("C++");
       a.add("C#");
       a.add("Java");
       a.add("C");
       String[] my_array = new String[a.size()];
       a.toArray(my_array);
       for(String string:my_array)
       {
        System.out.println(string);
       }
       
    }
    
}
