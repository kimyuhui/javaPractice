package chapter09.test;

public class ButtonExample {

	public static void main(String[] args) {
		button btn = new button();
		
		btn.setOnClickListener(new CallListner());
		btn.touch();
		
		btn.setOnClickListener(new MessageListner());
		btn.touch();
	}

}
