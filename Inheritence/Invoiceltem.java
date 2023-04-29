package Inheritence;

public class Invoiceltem {
private String id,desc;
private int qty;
private double unitPrice;
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
double gettotal() {
	return qty*unitPrice;
}
Invoiceltem(String id,String desc, int qty, double unitPrice)
{
this.id=id;
this.desc=desc;
this.qty=qty;
this.unitPrice=unitPrice;
}
 Invoiceltem() {
}
void Showinvoice() {
	System.out.println("Id : "+id);
	System.out.println("description : "+desc);
	System.out.println("qty : "+qty);
	System.out.println("Unit price : "+unitPrice);
    System.out.println("Total : "+qty*unitPrice);
}
}
