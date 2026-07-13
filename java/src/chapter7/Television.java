package chapter7;

public class Television extends Remote {
	int channel;
	int volumn;
	
	
	
	void powerOn(int channel) {
		System.out.println("티비 전원이 켜졌습니다.");
		System.out.println("현재 채널은 " + this.channel + "번 입니다.");
	}
	
	void changeChannel() {
		System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
	}
	
	void changeVolumn() {
		System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
	}
	
	
	
}
