package dz6.by.htp.entity;

public class ClientBase {
Client clientBase[];

public ClientBase(){//konstructor
clientBase = new Client[10];	
}

public void addClient(Client client){//metod kot. dobavlyaet novogo clienta
	for (int i=0;i<getSizeBase();i++){
		if (getClient(i)==null){}
	}
}

public int getSizeBase(){
	int sizeBase=this.clientBase.length;
	return sizeBase;
}

public Client getClient(int index){
	Client client;
	client=this.clientBase[index];
	return client;
}


}
