package Encapsulation;

public class PrivateFinalMethods {
	   private void print() {
	      System.out.println("in parent print");
	   }
	   public static void main(String[] args) {
	      PrivateFinalMethods obj = new PrivateFinalMethods();
	      obj.print();
	      PrivateFinalMethods obj1 = new PrivateFinalMethods();
	      obj1.print();
	   }
	}
