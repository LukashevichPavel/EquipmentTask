package dz6.by.htp.entity;

public class RentStation {
private RentUnit inRent,inReady;

public RentStation(){
	
}


public void start(){
Acsessories[]masAcsessories=new Acsessories[10];

	Category cat1 = new Category("����������","����","0+");
Category cat2 = new Category("���������� �������","����","�� 12 ���");
Category cat3 = new Category("����","����","16+");
Category cat4 = new Category("��������","����","16+");
Category cat5 = new Category("���������","����","0+");
masAcsessories[0]= new Acsessories (cat1, "���� ������������", 20.65, 80.4,true);
masAcsessories[1] = new Acsessories (cat2, "���� ������������ �������", 10.65, 60.45,true);
masAcsessories[2] = new Acsessories (cat2, "�������������� �������������� ������", 5.15, 20.45,true);
masAcsessories[3] = new Acsessories (cat3, "�������� ����", 5.78, 20.15,true);
masAcsessories[4] = new Acsessories (cat3, "�������� ����", 20.15, 80.45,true);
masAcsessories[5] = new Acsessories (cat4, "�������� ����", 5.95, 23.45,true);
masAcsessories[5].print() ;

//Equipment equip1=new Equipment();




}
}
