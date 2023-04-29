package abc;

import java.util.Scanner;

public class lab_7 {

	public static void main(String[] args) {
		int j,i;
		Scanner input=new Scanner(System.in);
		String string="";
		String s=input.nextLine();
		for(i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				for(j=string.length()-1;j>=0;j--) {
					System.out.printf("%c",string.charAt(j));	
				}
				System.out.printf(" ");
				string="";
			}
			else {
				string=string+s.charAt(i);	
			}
		}
		for(j=string.length()-1;j>=0;j--) {
			System.out.printf("%c",string.charAt(j));	
		}
		System.out.println();
	}

}
