package hotel;

public class Service{
	private int serviceCost; // 서비스 가격
	
	
	int getServiceCost() {return this.serviceCost;}
	
	
	void setServiceCost(int serviceCost) {this.serviceCost = serviceCost;}
	
	
	Service(){} 
	
	Service(int servicecost) {
		this.serviceCost = servicecost;
	}
	
	
}
