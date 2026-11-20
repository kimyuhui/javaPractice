package chapter04;

import java.util.ArrayList;
import java.util.List;

public class practice3 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("떡볶이");
		arrayList.add("치킨");
		arrayList.add("빙수");
		arrayList.add("피자");
		arrayList.add("닭발");
		arrayList.add("국수");
		arrayList.add("샐러드");
		arrayList.add("고기");
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		} System.out.println();
		System.out.println("size: " + arrayList.size());
		
		System.out.println("-------------------------------------------------");
		
		arrayList.remove("떡볶이");
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		} System.out.println();
		System.out.println("size: " + arrayList.size());
		
		System.out.println("-------------------------------------------------");
		
		arrayList.set(4, "짜파게티");
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		} System.out.println();
		System.out.println("size: " + arrayList.size());
		
		System.out.println("😨");
		
		
		
		
	}
}

	


