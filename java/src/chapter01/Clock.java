package chapter01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 hh시 mm분 ss초");
		String sdff = sdf.format(now);
		
		System.out.println(sdff);
		
		
		
		System.out.println("-------------------------------------");
		
		SimpleDateFormat a = new SimpleDateFormat("hh시 mm분");
		SimpleDateFormat b = new SimpleDateFormat("hh:mm:ss");
		
		long time = now.getHours() * 3600
				+ now.getMinutes() * 60 + now.getSeconds();
		
		String ntime = b.format(now);
		
		long t = 60600 - time;
		
		System.out.println("수료식 날짜: 2026년 11월 23일");
		
		Date end = new Date(126, 10, 23);
		long diff = end.getTime() - now.getTime();
		long day = diff / (1000 * 60 * 60 * 24);
		System.out.println("수료식까지 " + day + "일 남았습니다.");
		
		System.out.println("-------------------------------------");
		
		System.out.println("현재 시간 " + ntime);
		System.out.println("집에 갈 때까지 " + (t / 3600) + 
				"시간 " + (t % 3600) / 60 + "분 " + (t % 60) + "초" + " 남았습니다.");
		
	}

}
