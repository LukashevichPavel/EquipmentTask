package dz6.by.htp.entity;

import java.util.*;

public class RentStation {
	private Equipment[] base; //
	private ClientBase baseClient;  
	private RentUnit baseInRent;

public void start(){
	base = new Equipment[15]; //Init base Equipment
	String firstname,lastname, passport, adress, telNumber;
	firstname = "Ivanov";
	lastname = "Ivan";
	passport = "MP123123";
	adress = "Burdeynogo 1-15";
	telNumber = "3109876";
	Client cl1 = new Client(firstname, lastname, passport, adress, telNumber);
	baseClient.addClient(cl1);
	
	firstname = "Petrov";
	lastname = "Petr";
	passport = "MP123123";
	adress = "Burdeynogo 7-25";
	telNumber = "5109876";
	Client cl2 = new Client(firstname, lastname, passport, adress, telNumber);
	baseClient.addClient(cl2);
	
	firstname = "Cidorov";
	lastname = "Cidor";
	passport = "MP456789";
	adress = "Burdeynogo 10-50";
	telNumber = "8109877";
	Client cl3 = new Client(firstname, lastname, passport, adress, telNumber);
	baseClient.addClient(cl3);
	
	Bike tempBike = new Bike();
	Skis tempSkis = new Skis();
	SnowBoard tempSnow = new SnowBoard();
	tempBike=tempBike.random();
	int random1=(int)(3+Math.random()*10); //Create random count equipment and add them to base 
	for (int i=0; i<random1;i++){
	if (i<4){base[i]=tempBike.random();base[i].print();}
	else {
		if (i>6){base[i]=tempSnow.random();base[i].print();}
		else{base[i]=tempSkis.random();base[i].print();}
	
	}
	
	
	
	}
}

public void takeToRent(){}  //metod kot. pomechaet equipment kak vzyatiy v arendu
public void removeFromRent(){} //metod kot. ydalyaet equipment iz bazi arendovanogo equiipment	
public void printInRent(){} //metod kot. vivodyt all equipment kotoriy naxoditsa v arende  

public boolean checkClient(){//metod kot. opredelyaet est li Client v baze clientov
	boolean check=true;
	return check;
}
public int checkClienForRent(){//metod kot. proveryaet kolvo vzyatogo Equipment-a 
	int countRentEquipment=0;
	return countRentEquipment;
}

		
	
}//final

