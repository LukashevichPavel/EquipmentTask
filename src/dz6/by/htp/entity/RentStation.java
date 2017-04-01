package dz6.by.htp.entity;

import java.util.Random;

public class RentStation {
private RentUnit inRent;
private RentUnit inReady;

public RentStation(){
	
}


public void start(){
inReady = new RentUnit();
inRent = new RentUnit();

Acsessories[]masAcsessories1=new Acsessories[10];
Acsessories[]masAcsessories2=new Acsessories[10];
Acsessories[]masAcsessories3=new Acsessories[10];
Acsessories[]masAcsessories4=new Acsessories[10];

String []catList = {"Влеосипед","Велосипед детский","Лыжи","Сноуборд"}; //Лист категорий
String []catListBike = {"Stels","Fuji","Stark"};
String []catListSkis = {"Fischer","Guru","RC4"};
String []catListSnowBoard = {"Flow","Capita","Alaska"};
int random1=(int)(Math.random()*10); //Создаю случайное количество объектов экипировки 
for (int i=0; i<random1;i++){
int random2=(int)(Math.random()*catList.length);
switch (random2){
case 0:{
	int random3=(int)(Math.random()*catListBike.length);
	Equipment tempEquipment = new Bike();
	inRent.add(tempEquipment);	
}
case 1:{
	Equipment tempEquipment = new Bike();
	}
case 2:{
	Equipment tempEquipment = new Skis();
	}
case 3:{
	Equipment tempEquipment = new SnowBoard();
	}
}
 
}



/*masAcsessories1[0]= new Acsessories (, "Шлем велосипедный", 20.65, 80.4,true);
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
*/


}
}
