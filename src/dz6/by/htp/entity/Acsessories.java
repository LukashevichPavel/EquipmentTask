package dz6.by.htp.entity;

public class Acsessories {
private Category cat;
private String name;
private double rentPrice;
private double lostPrice;
private boolean isAvialible;

public Acsessories(){
	
}


public Acsessories (Category cat, String name, double rentPrice, double lostPrice, boolean avi){
	this.cat=cat;
	this.name=name;
	this.rentPrice=rentPrice;
	this.lostPrice=lostPrice;
	this.isAvialible=avi;
}

public boolean getAcsessoriesForCat(Category cat){
boolean acsTrue=false;
if (this.cat==cat) acsTrue=true; 
return acsTrue;
}


public void print(){
	System.out.println(this.toString());
}



public Category getCat() {
	return cat;
}

public void setCat(Category cat) {
	this.cat = cat;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getRentPrice() {
	return rentPrice;
}

public void setRentPrice(double rentPrice) {
	this.rentPrice = rentPrice;
}

public double getLostPrice() {
	return lostPrice;
}

public void setLostPrice(double lostPrice) {
	this.lostPrice = lostPrice;
}

public boolean isAvialible() {
	return isAvialible;
}

public void setAvialible(boolean isAvialible) {
	this.isAvialible = isAvialible;
}

@Override
public String toString() {
	return "Acsessories [name=" + name + ", rentPrice="
			+ rentPrice + ", lostPrice=" + lostPrice + ", isAvialible="
			+ isAvialible + "]";
}



}

