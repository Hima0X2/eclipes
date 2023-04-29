package Encapsulation;

public class Invoice_class {
	public static void main(String[] args) {
		Invoice i1= new Invoice();
		i1.setNumber("HI");
		i1.setPrice(10);
		i1.setQuantity(10);
		i1.setDescription("ABC");
		i1.getInvoiceAmount();
		System.out.println(i1.getInvoiceAmount());
		i1.setNumber("HI");
		i1.setPrice(-10);
		i1.setQuantity(10);
		i1.setDescription("ABC");
		i1.getInvoiceAmount();
		System.out.println(i1.getInvoiceAmount());
	}
}
