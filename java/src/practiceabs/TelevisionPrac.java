package practiceabs;

public class TelevisionPrac extends RemotePrac {
	int i = 8; //채널과 볼륨의 초기값을 8번, 10으로 해놓음
	int volumn = 10;


	@Override
	public void powerOn(int i) {
		if(power == true) { //이미 티비 전원을 한번 켰을 시 해당 문구가 출력되도록 함 
			System.out.println("티비가 이미 켜져있습니다");
			return; // 메서드 끝내기
		}

		power = true; // 티비를 켜면 power = true값으로 바꿔서 상태 변경함
		System.out.println("티비 전원이 켜졌습니다.");
		System.out.println("현재 채널은 " + this.i + "번 입니다.");
	}
		

	//	void changeChannel(int channel) {
	//		System.out.println("몇 번으로 바꾸시겠습니까?");
	//		try {System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
	//		if(this.channel > 52 && this.channel < 1) {
	//			System.out.println("없는 채널입니다. ");}
	//		} catch (java.util.InputMismatchException this.channel) {
	//			System.out.println("잘못된 입력을 하셨습니다");
	//		}
	//		
	//	}
					// catch 뒤로 계속 에러가 나서 작동이 안됨.. 

	
	
	void changeChannelUp (int channel) {
		if(power == false) { // 티비가 켜져 있지 않을 때 해당 문구 출력되도록 함
			System.out.println("티비가 켜져있지 않습니다.");
		} else if(power == true) {

			if(this.i > 50) // 채널을 50개까지만 만들어놓음
			{System.out.println("더 올릴 수 없습니다");
			} else {
				this.i++;
				System.out.println("채널을 " + this.i + "번으로 바꿉니다.");
			}
		}
	}

	void changeChannelDown (int channel) {
		if(power == false) {
			System.out.println("티비가 켜져있지 않습니다.");
		} else if(power == true) {
			if(this.i < 1) { // 1번 아래로는 채널을 돌리지 못하게 함
				System.out.println("더 내릴 수 없습니다");
			} else {
				this.i--;
				System.out.println("채널을 " + channel + "번으로 바꿉니다.");
			}
		}
	}


	void changeVolumnUp (int volumn) {
		if(power == false) {
			System.out.println("티비가 켜져있지 않습니다.");
		} else if(power == true) {
			System.out.println("현재 볼륨은 " + this.volumn +"입니다.");
			if(this.volumn > 20) { // 최대 볼륨을 20으로 설정해둠
				System.out.println("더 올릴 수 없습니다.");
			} else {
				this.volumn++;
				System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
			}
		}
	}

	void changeVolumnDown (int volumn) {
		if(power == false) {
			System.out.println("티비가 켜져있지 않습니다.");
		} else if(power == true) {
			System.out.println("현재 볼륨은 " + this.volumn +"입니다.");
			if(this.volumn < 0) { // 최저 볼륨을 0으로 설정해둠
				System.out.println("최저 볼륨입니다");
			} else {
				this.volumn--;
				System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
			}
		}
	}


	@Override
	public void powerOff() {
		System.out.println("티비 전원을 끕니다");
		power = false;
	}



}

