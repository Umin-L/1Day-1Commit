package hotel;

public class Service{
	private int serviceCost; // ���� ����
	
	
	int getServiceCost() {return this.serviceCost;}
	
	
	void setServiceCost(int serviceCost) {this.serviceCost = serviceCost;}
	
	
	Service(){} 
	
	Service(int servicecost) {
		this.serviceCost = servicecost;
	}
	
	
}
