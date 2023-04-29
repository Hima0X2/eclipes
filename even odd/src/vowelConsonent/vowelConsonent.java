
package vowelConsonent;
import java.util.Scanner;




public class vowelConsonent {
    public static void main(String[] args) {
        char c;
        Scanner input = new Scanner(System.in);
        c=input.next().charAt(0);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
        System.out.println("vowel");
        }
        else
        {
                System.out.println("consonent");
        }
    }
    
}
