package dz6.by.htp.entity;

public class RentStation {
private RentUnit inRent,inReady;

public RentStation(){
	
}


public void start(){
Acsessories[]masAcsessories=new Acsessories[10];

	Category cat1 = new Category("Влеосипеды","Лето","0+");
Category cat2 = new Category("Влеосипеды детские","Лето","До 12 лет");
Category cat3 = new Category("Лыжи","Зима","16+");
Category cat4 = new Category("Сноуборд","Зима","16+");
Category cat5 = new Category("Скейтборд","Лето","0+");
masAcsessories[0]= new Acsessories (cat1, "Шлем велосипедный", 20.65, 80.4,true);
masAcsessories[1] = new Acsessories (cat2, "Шлем велосипедный детский", 10.65, 60.45,true);
masAcsessories[2] = new Acsessories (cat2, "Дополнительные поддерживающие колеса", 5.15, 20.45,true);
masAcsessories[3] = new Acsessories (cat3, "Защитные очки", 5.78, 20.15,true);
masAcsessories[4] = new Acsessories (cat3, "Защитный шлем", 20.15, 80.45,true);
masAcsessories[5] = new Acsessories (cat4, "Защитные очки", 5.95, 23.45,true);
masAcsessories[5].print() ;

//Equipment equip1=new Equipment();




}
}
