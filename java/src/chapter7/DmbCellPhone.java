package chapter7;


	//자식 클래스
public class DmbCellPhone extends CellPhone {
	//필드
	int channel;

	//보이지 않지만 CellPhone.java 내용이 그대로 있음 
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	@Override //부모클래스 내용에 덮어쓰기
	void powerOn() {
		System.out.println("DMB폰이 켜졌습니다.");
	}

	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb( ) {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
