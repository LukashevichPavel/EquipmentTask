package dz6.by.htp.entity;

import java.util.*;

public class RentStation {
	private Equipment[] base; //
	private Client[]baseClienet;  
	private RentUnit baseInRent;

public void start(){
	this.base = new Equipment[15]; //Init base 
	String firstname = "Lukashevich";
	String lastname = "Pavel";
	String passport = "MP123123";
	String adress = "Burdeynogo 19-315";
	String telNumber = "3109877";
	Client cl = new Client(firstname, lastname, passport, adress, telNumber);
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
public void addClient(){}//metod kot. dobavlyaet novogo clienta
public boolean checkClient(){//metod kot. opredelyaet est li Client v baze clientov
	boolean check=true;
	return check;
}
			
	
}//final

