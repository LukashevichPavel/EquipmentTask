package dz6.by.htp.entity;

public abstract class Equipment {
private Category category;
private String title;
private Acsessories acsessories[];
private boolean isAvialible;
private double rentPrice;
private double lostPrice;
private String fio;
private String passport;
private int time;

/*public Equipment(Category cat,String title,Acsessories[]acs,boolean isAvl){
this.category=cat;
this.title=title;
this.acsessories=acs;
this.isAvialible=isAvl;
}*/

public void print(){
System.out.println(this.toString());	
}



public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Acsessories[] getAcsessories() {
	return acsessories;
}

public void setAcsessories(Acsessories[] acsessories) {
	this.acsessories = acsessories;
}

public boolean isAvialible() {
	return isAvialible;
}

public void setAvialible(boolean isAvialible) {
	this.isAvialible = isAvialible;
}

@Override
public String toString() {
	return "Equipment [category=" + category.getTitle()+ ", title=" + title
			+ ", isAvialible=" + isAvialible + "]";
}






}
