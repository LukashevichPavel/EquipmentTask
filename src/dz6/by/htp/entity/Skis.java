package dz6.by.htp.entity;

public class Skis extends Equipment{
	
	public Skis(Category cat,String title,Acsessories[]acs,boolean isAvl){
		super.setCategory(cat);
		super.setTitle(title);
		super.setAcsessories(acs);
		super.setAvialible(isAvl);
		}
	
	
}