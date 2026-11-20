package chapter01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	public static void main(String[] args) throws Exception {
		
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
		
		long t = 64200 - time;
		
		System.out.println("수료식 날짜: 2026년 11월 23일");

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");

		Date end = sdf2.parse("20261123");
		Date today = sdf2.parse(sdf2.format(now));

		long diff = end.getTime() - today.getTime();

		long day = diff / (1000 * 60 * 60 * 24);

		if (day > 0) {
		    System.out.println("수료식까지 " + day + "일 남았습니다.");
		} else if (day == 0) {
		    System.out.println("D-Day");
		    System.out.println("수료를 축하합니다!");
		} else {
		    System.out.println("수료식이 " + Math.abs(day) + "일 지났습니다.");
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("현재 시간 " + ntime);
		System.out.println("집에 갈 때까지 " + (t / 3600) + 
				"시간 " + (t % 3600) / 60 + "분 " + (t % 60) + "초" + " 남았습니다.");

	}

}