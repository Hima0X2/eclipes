
package reverse.of.a.number;

import com.sun.javafx.binding.StringFormatter;
import static java.time.Clock.system;
import java.util.Scanner;

public class ReverseOfANumber {

    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        x = input.next();
        StringBuilder sb=new StringBuilder(x);  
    System.out.println(sb.reverse());

   
    }

    
    
}
