package Encapsulation;

public class Invoice {
private String number,description;
private int quantity;
private double price;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
double getInvoiceAmount() {
	if(quantity<0) {
		quantity=0;
	}
	if(price<0.0) {
		price=0.0;
	}
	double total=quantity*price;
	return total;
}
}
