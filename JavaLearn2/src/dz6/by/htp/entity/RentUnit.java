package dz6.by.htp.entity;

public class RentUnit {
private Equipment[] inRent;;


public RentUnit(){
inRent = new Equipment[10];	
}

public void add(Equipment equipment){
	//Equipment[] temp = new Equipment[this.unit.length+1];
		
	for (int i=0; i<this.inRent.length; i++) {
		if (this.inRent[i]==null) this.inRent[i]=equipment;
		break;
	}
		
		
	
	
}



public Equipment[] getUnit() {
	return inRent;
}

public void setUnit(Equipment[] unit) {
	this.inRent = unit;
}



}
