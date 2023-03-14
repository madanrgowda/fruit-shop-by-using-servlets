package dto;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Fruits_Shop {
String name;
@Id
long number;
int appleQty;
int orangeQty;
int pineappleQty;
int guavaQty;
int grapesQty;
double total;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public int getAppleQty() {
	return appleQty;
}
public int setAppleQty(int appleQty) {
	return this.appleQty = appleQty;
}
public int getOrangeQty() {
	return orangeQty;
}
public int setOrangeQty(int orangeQty) {
	return this.orangeQty = orangeQty;
}
public int getPineappleQty() {
	return pineappleQty;
}
public int setPineappleQty(int pineappleQty) {
	return this.pineappleQty = pineappleQty;
}
public int getGuavaQty() {
	return guavaQty;
}
public int setGuavaQty(int guavaQty) {
	return this.guavaQty = guavaQty;
}
public int getGrapesQty() {
	return grapesQty;
}
public int setGrapesQty(int grapesQty) {
	return this.grapesQty = grapesQty;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
}
