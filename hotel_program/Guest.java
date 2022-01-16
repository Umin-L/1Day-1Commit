package hotel;

import java.util.Scanner;

public class Guest extends Room{
	
	private int payment; // 서비스 코스트 + 객실요금 
	private int svpayment; // 서비스 코스트 누적금액

	int getPayment() {return this.payment;}
	int getSvpayment() {return this.svpayment;}
	
	void setPayment(int payment) {this.payment = payment;}
	void setSvpayment(int svpayment) {this.svpayment = svpayment;}

	
	
	void order(Service s){// 게스트가 서비스 선택, 이용요금 및 총 이용요금 안내
		System.out.println(s + "을/를 선택하셨습니다.");
		System.out.println("이용요금은 "+ s.getServiceCost() + "원입니다.");
		System.out.println("주문하시려면 1번을, 취소하시려면 2번을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num == 1) { // 주문하는 경우
			this.svpayment += s.getServiceCost();
			this.setPayment(super.getRoomCost() + this.getSvpayment());
			System.out.println("주문이 완료되었습니다." + "\n" + "객실요금을 포함한 고객님의 총 이용요금은 " + this.getPayment() + "원입니다." + "\n");
		}
		else if (num == 2) { // 주문을 취소하는 경우
			System.out.println("주문을 취소합니다.");
		}
		else { // 1번, 2번외 다른 숫자를 누른 경우
			System.out.println("잘못 누르셨습니다.");
		}
	} 


	

	
	
}

