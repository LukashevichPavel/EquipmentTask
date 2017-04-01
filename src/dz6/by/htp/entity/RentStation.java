package dz6.by.htp.entity;

public class RentStation {
private RentUnit inRent,inReady;

public RentStation(){
	
}


public void start(){
Acsessories[]masAcsessories1=new Acsessories[10];
Acsessories[]masAcsessories2=new Acsessories[10];
Acsessories[]masAcsessories3=new Acsessories[10];
Acsessories[]masAcsessories4=new Acsessories[10];
Category cat1 = new Category("Влеосипеды","Лето","0+");
Category cat2 = new Category("Влеосипеды детские","Лето","До 12 лет");
Category cat3 = new Category("Лыжи","Зима","16+");
Category cat4 = new Category("Сноуборд","Зима","16+");
Category cat5 = new Category("Скейтборд","Лето","0+");
masAcsessories1[0]= new Acsessories (cat1, "Шлем велосипедный", 20.65, 80.4,true);
masAcsessories2[0] = new Acsessories (cat2, "Шлем велосипедный детский", 10.65, 60.45,true);
masAcsessories2[1] = new Acsessories (cat2, "Дополнительные поддерживающие колеса", 5.15, 20.45,true);
masAcsessories3[0] = new Acsessories (cat3, "Защитные очки", 5.78, 20.15,true);
masAcsessories3[1] = new Acsessories (cat3, "Защитный шлем", 20.15, 80.45,true);
masAcsessories4[0] = new Acsessories (cat4, "Защитные очки", 5.95, 23.45,true);
//masAcsessories1[5].print() ;
Bike equip1=new Bike(cat1,"Велосипед Centrum",masAcsessories1,true);
Bike equip2=new Bike(cat1,"Велосипед Stels",masAcsessories1,true);
Bike equip3=new Bike(cat1,"Велосипед Fuji Nevada",masAcsessories1,true);
Bike equip4=new Bike(cat1,"Велосипед Stark",masAcsessories1,true);
Bike equip5=new Bike(cat2,"Велосипед детский Centrum 1",masAcsessories2,true);
Bike equip6=new Bike(cat2,"Велосипед детский Centrum 2",masAcsessories2,true);
Skis equip7=new Skis(cat3,"Лыжи Fischer 1",masAcsessories3,true);
Skis equip8=new Skis(cat3,"Лыжи Fisсher 2",masAcsessories3,true);
equip5.print();



}
}
