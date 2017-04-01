package dz6.by.htp.entity;

public class Equipment {
private Category category;
private String title;
private Acsessories acsessories[];
private boolean isAvialible;

public Equipment(Category cat,String title,Acsessories[]acs,boolean isAvl){
	
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






}
