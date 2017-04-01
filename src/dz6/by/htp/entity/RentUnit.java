package dz6.by.htp.entity;

public class RentUnit {
private Equipment[] unit;

public RentUnit(){
this.unit = new Equipment[1];	
}

public void add(Equipment equipment){
	if (this.unit!=null){
		Equipment[] temp = new Equipment[this.unit.length+1];
		for (int i=0; i<this.unit.length; i++) temp[i]=this.unit[i];
		this.unit=temp;
		this.unit[this.unit.length]=equipment;
	}
	
	//this.units[units.length]=equipment;
}

}
