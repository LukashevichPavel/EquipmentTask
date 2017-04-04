package dz6.by.htp.entity;

import java.util.*;

public class RentStation {
	private Equipment[] base;


public void start(){
	this.base = new Equipment[15]; //Init base 
	
	Bike tempBike = new Bike();
	Skis tempSkis = new Skis();
	SnowBoard tempSnow = new SnowBoard();
	tempBike=tempBike.random();
	int random1=(int)(3+Math.random()*10); //Create random count equipment and add them to base inReady
	for (int i=0; i<random1;i++){
	if (i<4){base[i]=tempBike.random();base[i].print();}
	else {
		if (i>6){base[i]=tempSnow.random();base[i].print();}
		else{base[i]=tempSkis.random();base[i].print();}
	
	}
	}
}
	
			
			
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

