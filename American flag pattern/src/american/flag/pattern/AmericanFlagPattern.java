
package american.flag.pattern;

public class AmericanFlagPattern {

    public static void main(String[] args) {
       String a="* * * * * * ==================================\n* * * * *  ==================================";
       String b="==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(a);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(b);
        }
    }
    
}
