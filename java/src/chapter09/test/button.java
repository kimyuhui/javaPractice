package chapter09.test;

public class button {
	OnClickListner listener;
	
	void setOnClickListener(OnClickListner listner) {
		this.listener = listner;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	
	static interface OnClickListner{
		void onClick();
	}
	
}
