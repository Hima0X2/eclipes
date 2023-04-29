package Access_modifier2;

import Access_modifier.Private;

public class privateTest {

	public static void main(String[] args) {
		Private protected1=new Private();
		protected1.setHi(100);
		System.out.println("hi : "+protected1.getHi());
	}

}
