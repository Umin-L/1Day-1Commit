package hotel;

import java.util.Scanner;

public class Guest extends Room{
	
	private int payment; // ���� �ڽ�Ʈ + ���ǿ�� 
	private int svpayment; // ���� �ڽ�Ʈ �����ݾ�

	int getPayment() {return this.payment;}
	int getSvpayment() {return this.svpayment;}
	
	void setPayment(int payment) {this.payment = payment;}
	void setSvpayment(int svpayment) {this.svpayment = svpayment;}

	
	
	void order(Service s){// �Խ�Ʈ�� ���� ����, �̿��� �� �� �̿��� �ȳ�
		System.out.println(s + "��/�� �����ϼ̽��ϴ�.");
		System.out.println("�̿����� "+ s.getServiceCost() + "���Դϴ�.");
		System.out.println("�ֹ��Ͻ÷��� 1����, ����Ͻ÷��� 2���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num == 1) { // �ֹ��ϴ� ���
			this.svpayment += s.getServiceCost();
			this.setPayment(super.getRoomCost() + this.getSvpayment());
			System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�." + "\n" + "���ǿ���� ������ ������ �� �̿����� " + this.getPayment() + "���Դϴ�." + "\n");
		}
		else if (num == 2) { // �ֹ��� ����ϴ� ���
			System.out.println("�ֹ��� ����մϴ�.");
		}
		else { // 1��, 2���� �ٸ� ���ڸ� ���� ���
			System.out.println("�߸� �����̽��ϴ�.");
		}
	} 


	

	
	
}

