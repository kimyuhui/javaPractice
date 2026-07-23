package chapter01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 hh시 mm분 ss초");
		String sdff = sdf.format(now);
		
		System.out.println(sdff);
		
		SimpleDateFormat a = new SimpleDateFormat("hh시 mm분");
		SimpleDateFormat b = new SimpleDateFormat("hh:mm:ss");
		
		long time = System.currentTimeMillis();
		
		String ntime = b.format(time);
		
		long t = 60600 - time;
		
		String m = a.format(t); 
		
		System.out.println("현재 시간 " + ntime);
		System.out.println("집에 갈 때까지 " + t + " 남았습니다");
		
		// TODO Auto-generated method stub

	}

}
