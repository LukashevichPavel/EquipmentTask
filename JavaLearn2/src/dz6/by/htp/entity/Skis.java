package dz6.by.htp.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skis extends Equipment{
private final String []catListSkis = {"Fischer","Guru","RC4"};
private final String []acsListSkis = {"Skis Helmet","Skis Bag","Skis Mask", "Skis Skirt"};

public Skis(){
	
	}
	
public Skis(int id, String cat,String title,int length, Acsessories[]acs,boolean isAvl,double rentPrice, double lostPrice){
	super.setId(id);
	super.setCategory(cat);
	super.setTitle(title);
	super.setLenght(length);
	super.setAcsessories(acs);
	super.setAvialible(isAvl);
	super.setRentPrice(rentPrice);
	super.setLostPrice(lostPrice);
		}

	public Skis random(){
		String tempName = catListSkis[(int)(Math.random()*catListSkis.length)]; //Random name Equipment
		Acsessories tempAcs[] = new Acsessories[(int)Math.random()*10];
		for (int i=0;i<tempAcs.length; i++){
			tempAcs[i]=new Acsessories("Skis", tempName, Math.random()*10, 10+Math.random()*25, true); 
				}
		double tempRentPrice = new BigDecimal(15+Math.random()*25).setScale(2, RoundingMode.UP).doubleValue();
		double tempLostPrice=new BigDecimal(50+Math.random()*100).setScale(2, RoundingMode.UP).doubleValue();
		int tempLength=40+(int)Math.random()*125;
		Skis tempEquipment = new Skis(ind, "Skis",tempName,tempLength,tempAcs,true,tempRentPrice , tempLostPrice);
		ind++;
		return tempEquipment;
	}
	
}
