package Inheritence;

public class InvoiceTest {
	public static void main(String[] args) {
Invoiceltem a=new Invoiceltem("123","HI",10,120);
a.gettotal();
a.Showinvoice();
Invoiceltem b=new Invoiceltem();
b.setId("AM019872");
b.setDesc("Rice");
b.setQty(50);
b.setUnitPrice(63);
b.gettotal();
b.Showinvoice();
	}
}
